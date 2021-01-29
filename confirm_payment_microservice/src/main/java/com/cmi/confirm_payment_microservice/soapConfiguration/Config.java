package com.cmi.confirm_payment_microservice.soapConfiguration;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
public class Config extends WsConfigurerAdapter
{


    @Bean
    public ServletRegistrationBean messageDispatcherServlet(ApplicationContext applicationContext)
    {
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(applicationContext);
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean(servlet, "/service/*");
    }

    @Bean(name = "paymentWsdl")
    public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema paymentSchema)
    {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("paymentPort");
        wsdl11Definition.setLocationUri("/service/payment");
        wsdl11Definition.setTargetNamespace("http://www.cmi.com/xml/payment");
        wsdl11Definition.setSchema(paymentSchema);
        return wsdl11Definition;
    }


    @Bean
    public XsdSchema PaymentSchema()
    {
        return new SimpleXsdSchema(new ClassPathResource("payment.xsd"));
    }
}

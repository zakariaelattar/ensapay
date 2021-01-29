package com.cmi.check_balance_microservice.soapConfiguration;

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

    @Bean(name = "checkBalanceWsdl")
    public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema balanceSchema)
    {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("checkBalancePort");
        wsdl11Definition.setLocationUri("/service/checkBalance");
        wsdl11Definition.setTargetNamespace("http://www.cmi.com/xml/balance");
        wsdl11Definition.setSchema(balanceSchema);
        return wsdl11Definition;
    }


    @Bean
    public XsdSchema balanceSchema()
    {
        return new SimpleXsdSchema(new ClassPathResource("balance.xsd"));
    }
}

package com.cmi.create_payment_account_micoservice.soapConfiguration;
import com.cmi.create_payment_account_micoservice.services.Account.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Bean(name = "createAccountValidationWsdl")
    public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema accountsSchema)
    {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("createAccountValidationPort");
        wsdl11Definition.setLocationUri("/service/create");
        wsdl11Definition.setTargetNamespace("http://www.cmi.com/xml/account");
        wsdl11Definition.setSchema(accountsSchema);
        return wsdl11Definition;
    }


    @Bean
    public XsdSchema accountsSchema()
    {
        return new SimpleXsdSchema(new ClassPathResource("account.xsd"));
    }
}

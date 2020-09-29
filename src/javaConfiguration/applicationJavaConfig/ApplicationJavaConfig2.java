package javaConfiguration.applicationJavaConfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import javax.annotation.Resource;

/**
 * Created by asus on 6/22/2020.
 */
@Configuration
//@ComponentScan("javaConfiguration")
@ComponentScan("javaConfiguration,otherAutowiredJavaConfig2")
//@ImportResource("config/javaCombineXmlconfig.xml")
public class ApplicationJavaConfig2 {



}

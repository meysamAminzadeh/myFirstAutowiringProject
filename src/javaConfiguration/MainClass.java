package javaConfiguration;

import javaConfiguration.applicationJavaConfig.ApplicationJavaConfig2;
import javaConfiguration.autowiredJavaConfig.AutowiredJavaConfiguration1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by asus on 6/22/2020.
 */
public class MainClass {

    public static void main(String[] args) {
 //       ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationJavaConfig.class);
 /*
        ClassJavaConfiguration1 classJavaConfiguration1 = context.getBean("c1", ClassJavaConfiguration1.class);
        ClassJavaConfiguration2 classJavaConfiguration2 = context.getBean("c2", ClassJavaConfiguration2.class);
        ClassJavaConfiguration3 classJavaConfiguration3 = context.getBean("c3", ClassJavaConfiguration3.class);

*/
/*        ClassJavaConfiguration1 classJavaConfiguration1= context.getBean(ClassJavaConfiguration1.class);
        classJavaConfiguration1.m1();
 */
     /*   ClassJavaConfiguration1 classJavaConfiguration1= context.getBean("name1",ClassJavaConfiguration1.class);
        classJavaConfiguration1.m1();
    */
      /*  System.out.println(" ===================== ");
        System.out.println(" *************************** ");
        ClassJavaConfiguration1 classJavaConfiguration1= context.getBean("name1",ClassJavaConfiguration1.class);
        ClassJavaConfiguration1 classJavaConfiguration2= context.getBean("name1",ClassJavaConfiguration1.class);
        ClassJavaConfiguration1 classJavaConfiguration3= context.getBean("name1",ClassJavaConfiguration1.class);
        System.out.println(" *************************** ");
*/
/*

        ClassJavaConfiguration1 classJavaConfiguration1= context.getBean("c1",ClassJavaConfiguration1.class);

        System.out.println(classJavaConfiguration1.getClassJavaConfiguration2().getClassJavaConfiguration3().getName());

*/
    /*    ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationJavaConfig2.class);
        AutowiredJavaConfiguration1 classJavaConfiguration1= context.getBean(AutowiredJavaConfiguration1.class);

        System.out.println(classJavaConfiguration1.getAutowiredJavaConfiguration2().getAutowiredJavaConfiguration3().getName());
*/
  /*      ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationJavaConfig2.class);
        AutowiredJavaConfiguration1 classJavaConfiguration1= context.getBean(AutowiredJavaConfiguration1.class);

        System.out.println(classJavaConfiguration1.getAutowiredJavaConfiguration2().getAutowiredJavaConfiguration3().getName());
        System.out.println(classJavaConfiguration1.getOtherAutowiredJavaConfiguration2().getAutowiredJavaConfiguration3().getName());
  */
        ApplicationContext context = new ClassPathXmlApplicationContext("config/javaCombineXmlconfig.xml");
        AutowiredJavaConfiguration1 classJavaConfiguration1= context.getBean(AutowiredJavaConfiguration1.class);

      //  System.out.println(classJavaConfiguration1.getAutowiredJavaConfiguration2().getAutowiredJavaConfiguration3().getName());
        System.out.println(classJavaConfiguration1.getOtherAutowiredJavaConfiguration2().getAutowiredJavaConfiguration3().getName());

    }
}

package annotationConfigDIAndAutoWired;

import annotationConfigDIAndAutoWired.myBean.A1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by asus on 6/21/2020.
 */
public class MainClass {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config/application-context.xml");

      //  System.out.println(context.getBean("c1",ClassForRequiredAnnotation.class).getName());

       A1 a1= context.getBean("a1",A1.class);
        System.out.println(a1.getA2().getA4().getName());
        System.out.println(a1.getA3().getA4().getName());

    }
}

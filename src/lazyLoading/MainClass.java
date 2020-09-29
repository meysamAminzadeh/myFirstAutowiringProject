package lazyLoading;

import lazyLoading.beans.ClassLazyLoading1;
import lazyLoading.beans.ClassLazyLoading2;
import lazyLoading.beans.ClassLazyLoading3;
import lazyLoading.beans.ClassLazyLoading4;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by asus on 6/22/2020.
 */
public class MainClass {

    public static void main(String[] args) throws InterruptedException {
        ApplicationContext context= new ClassPathXmlApplicationContext("config/application-context.xml");

 /*       ApplicationContext context= new ClassPathXmlApplicationContext("config/application-context.xml","config/config.xml");
 */     /*  System.out.println(" ================  ");
        Thread.sleep(3000);
        System.out.println(" ******************* ");
        ClassLazyLoading1 classLazyLoading1= context.getBean(ClassLazyLoading1.class);

        ClassLazyLoading2 classLazyLoading2= context.getBean(ClassLazyLoading2.class);
        ClassLazyLoading2 classLazyLoading3= context.getBean(ClassLazyLoading2.class);
        System.out.println(" ******************* ");
*/

        ClassLazyLoading3 classLazyLoading3= context.getBean(ClassLazyLoading3.class);
        ClassLazyLoading4 classLazyLoading4= context.getBean(ClassLazyLoading4.class);
    }
}

package autoWired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by asus on 6/20/2020.
 */
public class MainClass {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("conf/application_context.xml");
/*

        ClassForAutoWired1 classForAutoWired1= context.getBean("c1",ClassForAutoWired1.class);
        classForAutoWired1.getClassForAutoWired2().print();
*/

/*

        ClassForAutoWired1 classForAutoWired1= context.getBean("c1",ClassForAutoWired1.class);
        classForAutoWired1.getClassForAutoWired2().print();
        classForAutoWired1.getClassForAutoWired3().print();

*/


        ClassForAutoWired1 classForAutoWired1 = context.getBean("c1", ClassForAutoWired1.class);
        classForAutoWired1.getClassForAutoWired2().print();
        ClassForAutoWired3 classForAutoWired3 = context.getBean("c3", ClassForAutoWired3.class);
        classForAutoWired3.getClassForAutoWired2().print();



    }

}

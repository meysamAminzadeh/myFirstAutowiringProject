package initDistroyObject;

import initDistroyObject.myBeans.ClassInintDestroyA;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by asus on 6/22/2020.
 */
public class MainClass {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("config/application-context.xml");
          ((ClassPathXmlApplicationContext)(context)).close();

    }

}

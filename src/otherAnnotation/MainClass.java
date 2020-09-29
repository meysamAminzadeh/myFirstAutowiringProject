package otherAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import otherAnnotation.myBean.BeanOtherAnnotation1;
import otherAnnotation.myBean.ClassOtherAnnotation1;

/**
 * Created by asus on 6/21/2020.
 */
public class MainClass {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config/application-context.xml");
/*
        ClassOtherAnnotation1 classOtherAnnotation1 = context.getBean("c1",ClassOtherAnnotation1.class);
        System.out.println(classOtherAnnotation1.getClassOtherAnnotation2().getName());

    */
      /*  ClassOtherAnnotation1 classOtherAnnotation1 = context.getBean(ClassOtherAnnotation1.class);
        System.out.println(classOtherAnnotation1.getClassOtherAnnotation2().getName());
*/

        BeanOtherAnnotation1 beanOtherAnnotation1= context.getBean(BeanOtherAnnotation1.class);
        System.out.println(beanOtherAnnotation1.getBeanOtherAnnotation2().getCity());
    }


}

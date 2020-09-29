package javaConfiguration.autowiredJavaConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import otherAutowiredJavaConfig2.OtherAutowiredJavaConfiguration2;

/**
 * Created by asus on 6/22/2020.
 */
@Component
public class AutowiredJavaConfiguration1 {

    private AutowiredJavaConfiguration2 autowiredJavaConfiguration2;
    private OtherAutowiredJavaConfiguration2 otherAutowiredJavaConfiguration2;

    @Autowired(required = false)
    public AutowiredJavaConfiguration1(AutowiredJavaConfiguration2 autowiredJavaConfiguration2,
                                       OtherAutowiredJavaConfiguration2 otherAutowiredJavaConfiguration2) {
        this.autowiredJavaConfiguration2 = autowiredJavaConfiguration2;
        this.otherAutowiredJavaConfiguration2 = otherAutowiredJavaConfiguration2;
    }
    public OtherAutowiredJavaConfiguration2 getOtherAutowiredJavaConfiguration2() {
        return otherAutowiredJavaConfiguration2;
    }


    @Autowired(required = false)
    public AutowiredJavaConfiguration1(AutowiredJavaConfiguration2 autowiredJavaConfiguration2) {
        System.out.println(" Object class1 Created ");
        this.autowiredJavaConfiguration2 = autowiredJavaConfiguration2;
    }

    public AutowiredJavaConfiguration2 getAutowiredJavaConfiguration2() {
        return autowiredJavaConfiguration2;
    }

    public AutowiredJavaConfiguration1() {
        System.out.println(" Object class1 Created ");
    }

    public void  m1(){
        System.out.println(" m1 from class1");

    }

}

package javaConfiguration.autowiredJavaConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by asus on 6/22/2020.
 */
@Component
public class AutowiredJavaConfiguration2 {

    public AutowiredJavaConfiguration2() {
        System.out.println(" Object class2 Created ");
    }
@Autowired
    private AutowiredJavaConfiguration3 autowiredJavaConfiguration3;

    public void setAutowiredJavaConfiguration3(AutowiredJavaConfiguration3 autowiredJavaConfiguration3) {
        this.autowiredJavaConfiguration3 = autowiredJavaConfiguration3;
    }

    public AutowiredJavaConfiguration3 getAutowiredJavaConfiguration3() {
        return autowiredJavaConfiguration3;
    }


}

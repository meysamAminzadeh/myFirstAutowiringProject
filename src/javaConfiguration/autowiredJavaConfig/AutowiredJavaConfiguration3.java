package javaConfiguration.autowiredJavaConfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by asus on 6/22/2020.
 */
//@Component
public class AutowiredJavaConfiguration3 {
    private String name;

   // @Value("meysam_Aminzadeh")
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public AutowiredJavaConfiguration3() {
        System.out.println(" Object class3 Created ");
    }
}

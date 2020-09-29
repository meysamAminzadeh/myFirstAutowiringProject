package javaConfiguration.classes;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by asus on 6/22/2020.
 */
public class ClassJavaConfiguration1 {

    private ClassJavaConfiguration2 classJavaConfiguration2;


    public ClassJavaConfiguration1(ClassJavaConfiguration2 classJavaConfiguration2) {
        this.classJavaConfiguration2 = classJavaConfiguration2;
    }

    public ClassJavaConfiguration2 getClassJavaConfiguration2() {
        return classJavaConfiguration2;
    }

    public ClassJavaConfiguration1() {
        System.out.println(" Object class1 Created ");
    }

    public void  m1(){
        System.out.println(" m1 from class1");

    }


}

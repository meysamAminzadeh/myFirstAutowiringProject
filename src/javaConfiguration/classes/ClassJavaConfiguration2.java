package javaConfiguration.classes;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by asus on 6/22/2020.
 */
public class ClassJavaConfiguration2 {

    public ClassJavaConfiguration2() {
        System.out.println(" Object class2 Created ");
    }

    private ClassJavaConfiguration3 classJavaConfiguration3;

    public void setClassJavaConfiguration3(ClassJavaConfiguration3 classJavaConfiguration3) {
        this.classJavaConfiguration3 = classJavaConfiguration3;
    }

    public ClassJavaConfiguration3 getClassJavaConfiguration3() {
        return classJavaConfiguration3;
    }


}

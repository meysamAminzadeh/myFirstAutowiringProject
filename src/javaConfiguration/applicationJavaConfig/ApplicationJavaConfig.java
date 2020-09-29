package javaConfiguration.applicationJavaConfig;

import javaConfiguration.classes.ClassJavaConfiguration1;
import javaConfiguration.classes.ClassJavaConfiguration2;
import javaConfiguration.classes.ClassJavaConfiguration3;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

/**
 * Created by asus on 6/22/2020.
 */
@Configuration
public class ApplicationJavaConfig {


/*    @Bean(name = {"c1"})
    public ClassJavaConfiguration1 classJavaConfiguration1(){

        return new ClassJavaConfiguration1();
    }

    @Bean(name = {"c2"})
    public ClassJavaConfiguration2 classJavaConfiguration2(){

        return new ClassJavaConfiguration2();
    }
    @Bean(name = {"c3"})
    public ClassJavaConfiguration3 classJavaConfiguration3(){

        return new ClassJavaConfiguration3();
    }*/

/*

    @Bean(name = {"c1","c1_","C1*"})
    public ClassJavaConfiguration1 classJavaConfiguration1(){

        return new ClassJavaConfiguration1();
    }
*/
/*

    @Bean(name = {"name1","name2"})
    @Scope(value = "prototype")
    @Lazy

    public ClassJavaConfiguration1 classJavaConfiguration1(){

        return new ClassJavaConfiguration1();
    }

*/
  /*      @Bean(name = {"c1"})
    public ClassJavaConfiguration1 classJavaConfiguration1(){

        return new ClassJavaConfiguration1(classJavaConfiguration2());
    }
*/


    @Bean(name = {"c1"})
     public ClassJavaConfiguration1 classJavaConfiguration1(){
        ClassJavaConfiguration1 classJavaConfiguration1 = new ClassJavaConfiguration1(classJavaConfiguration2());

        return classJavaConfiguration1;
    }

    @Bean(name = {"c2"})
    public ClassJavaConfiguration2 classJavaConfiguration2(){
        ClassJavaConfiguration2 classJavaConfiguration2 = new ClassJavaConfiguration2();
        classJavaConfiguration2.setClassJavaConfiguration3(classJavaConfiguration3());
        return classJavaConfiguration2;
    }
    @Bean(name = {"c3"})
    public ClassJavaConfiguration3 classJavaConfiguration3(){

        ClassJavaConfiguration3 classJavaConfiguration3 = new ClassJavaConfiguration3();
        classJavaConfiguration3.setName("meysam");

        return classJavaConfiguration3;
    }
}

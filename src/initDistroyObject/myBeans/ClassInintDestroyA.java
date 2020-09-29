package initDistroyObject.myBeans;

import org.springframework.stereotype.Component;

/**
 * Created by asus on 6/22/2020.
 */
public class ClassInintDestroyA {

/*    public ClassInintDestroyA() {
        System.out.println(classInintDestroyB.getName());
    }
 */
private ClassInintDestroyB classInintDestroyB;

    public ClassInintDestroyA() {

    }

    public void myInit(){
        System.out.println(classInintDestroyB.getName());
    }
    public void myDestroy(){
        System.out.println(" connection is released ");
    }



    public ClassInintDestroyB getClassInintDestroyB() {
        return classInintDestroyB;
    }

    public void setClassInintDestroyB(ClassInintDestroyB classInintDestroyB) {
        this.classInintDestroyB = classInintDestroyB;
    }



}

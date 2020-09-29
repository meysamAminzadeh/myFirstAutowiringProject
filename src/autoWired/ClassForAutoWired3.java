package autoWired;

/**
 * Created by asus on 6/20/2020.
 */
public class ClassForAutoWired3 {

    public void print(){
        System.out.println(" print class3 ");
    }

    private ClassForAutoWired2 classForAutoWired2;
    private ClassForAutoWired4 classForAutoWired4;

    public ClassForAutoWired3() {
        System.out.println(" class3 created ");
    }

    public ClassForAutoWired3(ClassForAutoWired2 classForAutoWired2, ClassForAutoWired4 classForAutoWired4) {
        System.out.println(" Create class3 by constructor have two paramater");
        this.classForAutoWired2 = classForAutoWired2;
        this.classForAutoWired4 = classForAutoWired4;
    }


    public ClassForAutoWired3(ClassForAutoWired2 classForAutoWired2) {
        System.out.println(" constructor have one paramater");
        this.classForAutoWired2 = classForAutoWired2;
    }

    public ClassForAutoWired2 getClassForAutoWired2() {
        return classForAutoWired2;
    }
}

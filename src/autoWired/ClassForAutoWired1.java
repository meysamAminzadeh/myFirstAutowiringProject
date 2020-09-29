package autoWired;

/**
 * Created by asus on 6/20/2020.
 */
public class ClassForAutoWired1 {

    public ClassForAutoWired1() {
        System.out.println(" class1 created ");
    }

    private ClassForAutoWired2 classForAutoWired2;
    private ClassForAutoWired3 classForAutoWired3;

    public ClassForAutoWired2 getClassForAutoWired2() {
        return classForAutoWired2;
    }

    public void setClassForAutoWired2(ClassForAutoWired2 classForAutoWired2) {
        this.classForAutoWired2 = classForAutoWired2;
    }

  public ClassForAutoWired3 getClassForAutoWired3() {
        return classForAutoWired3;
    }

    public void setClassForAutoWired3(ClassForAutoWired3 classForAutoWired3) {
        this.classForAutoWired3 = classForAutoWired3;
    }
}

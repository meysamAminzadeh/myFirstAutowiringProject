package annotationConfigDIAndAutoWired.myBean;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by asus on 6/21/2020.
 */
public class A2 {
    private A4 a4;

    public A4 getA4() {
        return a4;
    }
@Autowired
    public void setA4(A4 a4) {
        this.a4 = a4;
    }
}

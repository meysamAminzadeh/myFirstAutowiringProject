package annotationConfigDIAndAutoWired.myBean;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by asus on 6/21/2020.
 */
public class A1 {

    private A2 a2;
    private A3 a3;

    @Autowired(required = false)
   //@Autowired
    public A1(A2 a2) {
       System.out.println( " create class 1 with one parameter" );
        this.a2 = a2;
    }

    @Autowired(required = false)
   // @Autowired
    public A1(A2 a2, A3 a3 ) {
        System.out.println( " create class 1 with two parameter" );
        this.a3 = a3;
        this.a2 = a2;
    }

    public A2 getA2() {
        return a2;
    }

    public A3 getA3() {
        return a3;
    }
}

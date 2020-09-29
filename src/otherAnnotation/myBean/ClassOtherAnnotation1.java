package otherAnnotation.myBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by asus on 6/21/2020.
 */

@Component
public class ClassOtherAnnotation1 {

    private ClassOtherAnnotation2 classOtherAnnotation2;

    public ClassOtherAnnotation2 getClassOtherAnnotation2() {
        return classOtherAnnotation2;
    }

    @Autowired
    @Qualifier(value = "c2q1")
    //@Qualifier(value = "c2q2")
    public void setClassOtherAnnotation2(ClassOtherAnnotation2 classOtherAnnotation2) {
        this.classOtherAnnotation2 = classOtherAnnotation2;
    }
/*
    @Autowired
    @Qualifier(value = "c2_a")
    //@Qualifier(value = "c2_b")
    public void setClassOtherAnnotation2(ClassOtherAnnotation2 classOtherAnnotation2) {
        this.classOtherAnnotation2 = classOtherAnnotation2;
    }
*/

}

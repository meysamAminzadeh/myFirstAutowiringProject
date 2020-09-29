package otherAnnotation.myBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by asus on 6/22/2020.
 */
@Component
public class BeanOtherAnnotation1 {
    private BeanOtherAnnotation2 beanOtherAnnotation2;

    public BeanOtherAnnotation2 getBeanOtherAnnotation2() {
        return beanOtherAnnotation2;
    }

    @Autowired
    public void setBeanOtherAnnotation2(BeanOtherAnnotation2 beanOtherAnnotation2) {
        this.beanOtherAnnotation2 = beanOtherAnnotation2;
    }
}

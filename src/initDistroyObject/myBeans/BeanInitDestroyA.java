package initDistroyObject.myBeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by asus on 6/22/2020.
 */


@Component
public class BeanInitDestroyA {
    @Autowired
    private BeanInitDestroyB beanInitDestroyB;

    public BeanInitDestroyA() {
    }
    @PostConstruct
    public void myInit(){
        System.out.println(beanInitDestroyB.getName());
    }
    @PreDestroy
    public void myDestroy(){
        System.out.println(" connection is released ");
    }

    public BeanInitDestroyB getBeanInitDestroyB() {
        return beanInitDestroyB;
    }

    public void setBeanInitDestroyB(BeanInitDestroyB beanInitDestroyB) {
        this.beanInitDestroyB = beanInitDestroyB;
    }
}

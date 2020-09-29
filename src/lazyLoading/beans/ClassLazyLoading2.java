package lazyLoading.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by asus on 6/22/2020.
 */
@Component
//@Lazy
@Scope(value = "prototype")
public class ClassLazyLoading2 {
    public ClassLazyLoading2() {
        System.out.println(" ClassLazyLoading2 is create ");
    }
}

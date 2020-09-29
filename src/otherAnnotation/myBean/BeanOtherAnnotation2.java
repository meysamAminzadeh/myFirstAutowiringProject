package otherAnnotation.myBean;

import org.springframework.stereotype.Component;

/**
 * Created by asus on 6/22/2020.
 */
@Component
public class BeanOtherAnnotation2 {
    private String city="tehran";

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}

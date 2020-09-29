package initDistroyObject.myBeans;

import org.springframework.stereotype.Component;

/**
 * Created by asus on 6/22/2020.
 */
@Component
public class BeanInitDestroyB {
    private String name = "Alireza";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

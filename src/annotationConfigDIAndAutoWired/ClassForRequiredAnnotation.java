package annotationConfigDIAndAutoWired;

import org.springframework.beans.factory.annotation.Required;

/**
 * Created by asus on 6/21/2020.
 */
public class ClassForRequiredAnnotation {
   // @Required
    private String name;

    public String getName()
    {
        return name;
    }
    @Required
    public void setName(String name) {
        this.name = name;
    }

  /*  // @Required
    public ClassForRequiredAnnotation(String name) {
        this.name = name;
    }
*/
}

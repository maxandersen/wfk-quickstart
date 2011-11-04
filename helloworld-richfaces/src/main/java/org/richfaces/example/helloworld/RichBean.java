package ca.bleathem.richfaces;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ViewScoped
@ManagedBean(name = "richBean")
public class RichBean implements Serializable {

    private static final long serialVersionUID = -2403138958014741653L;
    private String name;

    public RichBean() {
        System.out.println("post construct: initialize");
        name = "John";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("name: " + name);
        this.name = name;
    }
}

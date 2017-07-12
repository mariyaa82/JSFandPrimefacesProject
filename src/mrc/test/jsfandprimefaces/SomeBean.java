package mrc.test.jsfandprimefaces;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="someBean")
public class SomeBean {
  private String someProperty = "Mariya";
  
  public String getSomeProperty() {
    return(someProperty);
  }

  public void setSomeProperty(String someProperty) {
    this.someProperty = someProperty;
  }
  
  public String someActionControllerMethod() {
    return("page-b");  // Means to go to page-b.xhtml (since condition is not mapped in faces-config.xml)
  }
  
  public String someOtherActionControllerMethod() {
    return("index");  // Means to go to index.xhtml (since condition is not mapped in faces-config.xml)
  }
}

package application;
import java.applet.Applet;
import java.awt.*;
/*<applet code="MyApplet" width="200" height="100">
</applet>*/
public class MyApplet3 extends java.applet.Applet {
        Label l1,l2;
        TextField t1,t2;
        Button b1;
    public void init() {
            l1=new Label("First number");
            l2=new Label("second number");
            t1=new TextField();
            t2=new TextField();
            b1=new Button("add");
            add(l1);
            add(l2);
            add(t1);
            add(t2);
            add(b1);
            
    }
    
}

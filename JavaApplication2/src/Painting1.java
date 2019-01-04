import java.applet.Applet;
import java.awt.*;

public class Painting1 extends Applet
{
 public void paint(Graphics g)
    {
     g.drawOval(10,22,33,44);
    
     g.setColor(Color.RED);
    // g.setFont(font);
      g.fillOval(10,22,33,44);
    }

}

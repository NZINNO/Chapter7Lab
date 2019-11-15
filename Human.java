import java.awt.*;
import java.applet.*;
public class Human
{
  public static void drawChest(Graphics g){
    g.setColor(new Color(102,0,153));
    //light blue
    g.fillRect(260,355,20,20);
  }
  public static void drawHead(Graphics g) {
    g.setColor(new Color(255,204,0));
    g.fillOval(260,335,20,20);
  }
}

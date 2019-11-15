import java.awt.*;
import java.applet.*;
public class Tree
{
  public static void drawLog(Graphics g){
    g.setColor(new Color(102,51,0));
    g.fillRect(100,200,50,140);
  }
    public static void drawLeaf(Graphics g){
      g.setColor(new Color(0,102,0));
      g.fillOval(50,100,150,150);
  }
}

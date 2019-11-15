import java.awt.*;
import java.applet.*;
public class Lab7 extends Applet{
  public void paint(Graphics g)
  {
    Background.drawSky(g);
    Background.drawGrass(g);
    Background.drawRoad(g);
    Background.drawCenterline(g);
    Background.drawSun(g);
    Car.drawBody(g);
    Car.drawWheels(g);
    Car.drawWindows(g);
    Human.drawChest(g);
    Human.drawHead(g);
    Tree.drawLog(g);
    Tree.drawLeaf(g);
  }

}

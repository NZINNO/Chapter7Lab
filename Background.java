import java.awt.*;
import java.applet.*;
public class Background
{
  public static void drawSky(Graphics g) {
    g.setColor(new Color(128,128,255));
    //light blue
    g.fillRect(10,10,400,300);
  }

  public static void drawGrass(Graphics g){
    g.setColor(new Color(0,153,0));
    //dark green

    g.fillRect(10,300,400,200);
  }
  public static void drawRoad(Graphics g){
    g.setColor(new Color(102,102,102));
    g.fillRect(10,350,400,115);
  }
  public static void drawCenterline(Graphics g){
    g.setColor(new Color(255,255,0));
    g.fillRect(10,395,400,15);
  }
  public static void drawSun(Graphics g){
    g.setColor(new Color(255,255,0));
    g.fillOval(280,20,100,100);
  }
}

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
    g.setColor(new Color(0,128,0));
    //dark green

    g.fillRect(10,300,400,600);
  }
  public static void drawRoad(Graphics g){
    g.setColor(new color(0,0,0));
    g.fillRect(10,450,400,500);
  }
  public static void drawCenterline(Graphics g){
    g.setColor(new color(178,211,1));
    g.fillRect(10,470,400,480);
  }

  public static void drawSun(Graphics g){
    g.setColor(178,211,1));
    g.fillOval(350,20,50,50);
  }
}

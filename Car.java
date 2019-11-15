import java.awt.*;
import java.applet.*;
public class Car{
	public static void drawBody(Graphics g){
		g.setColor(new Color(255,0,0));
		g.fillRect(150,375,200,50);
		g.fillRect(200,325,100,50);
	}

	public static void drawWheels(Graphics g){
		g.setColor(new Color(0,0,0));
		g.fillOval(165,405,58,58);
		g.fillOval(275,405,58,58);
	}

	public static void drawWindows(Graphics g){
		g.setColor(new Color(0,0,0));
		g.fillRect(205,335,40,40);
		g.fillRect(255,335,40,40);
	}

}

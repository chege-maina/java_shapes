import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class Canvas extends JPanel{
    private int width;
    private int height;
    private String type;

    public Canvas(int w, int h, String t){
        width=w;
        height=h;
        type=t;
    }
    protected void paintComponent(Graphics g){

       /* System.out.println(width);
        System.out.println(height);
        System.out.println(type);*/


        Graphics2D g2d = (Graphics2D) g;
        if(type.equals("Circle")){
            Ellipse2D.Double e = new Ellipse2D.Double(500,125,width,height);
            g2d.setColor(new Color(57,255,20));
            g2d.fill(e);
        }
        else{
            Rectangle2D.Double r =  new Rectangle2D.Double(500,125,width,height);
            g2d.setColor(new Color(255,90,172));
            g2d.fill(r);
        }
        
    }
}
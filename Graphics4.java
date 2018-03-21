// Make a graphics program that displays a green filled in circle on the screen. The size does not matter, nos does the location.

package exercises2;

import java.awt.*;
import javax.swing.JFrame;

public class Graphics4 extends Canvas
{
    public void paint( Graphics g )
    {
      
        g.setColor(Color.green);
        g.fillArc(300, 150, 300, 300, 0, 360);
        
    
    }

    public static void main( String[] args )
    {
        // You can change the title or size here if you want.
        JFrame win = new JFrame("Graphics4");
        win.setSize(800,600);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Graphics4 canvas = new Graphics4();
        win.add( canvas );
        win.setVisible(true);
    }
}
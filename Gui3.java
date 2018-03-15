// more practice with guis

package exercises2;

import javax.swing.*;
import java.awt.*;

public class Gui3 {
	public static void main(String[] args) {
		Frame1 f = new Frame1();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}
class Frame1 extends JFrame{
	public Frame1(){
		setTitle("613 rocks!! ");
		setSize(300,200);
		setLocation(100,200);
		
		Panel1 panel = new Panel1();
		Container cp = getContentPane();
		cp.add(panel);
	}
}
class Panel1 extends JPanel{
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawString("Hi", 75, 100);
	}
}

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class TestingTests extends Canvas
	{
	public static void main(String[] args)
		{
		JFrame frame = new JFrame("Art");
		frame.setSize(1000,1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Graphical canva = new Graphical();
		frame.getContentPane().add(canva);
		frame.setVisible(true);
		TestingTests canvas = new TestingTests();
		frame.getContentPane().add(canvas);
		}
	public void paint(Graphics graphics)
		{
		graphics.setColor(new Color(38,18,24));
		graphics.fillRect(0, 5, 50, 50);
		graphics.setColor(new Color(38,168,24));
		graphics.drawRect(0, 50, 49, 49);
		}
	}

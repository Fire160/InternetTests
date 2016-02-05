import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.*;
import javax.swing.*;

import javax.swing.*;

public class Graphical extends Canvas implements KeyListener, ActionListener
	{
	public static void main(String[] args) 
		{
		Graphical canvas = new Graphical();
		TestingTests canva = new TestingTests();
		JFrame frame = new JFrame("Fun");
        //Create and set up the window.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
	frame.setSize(340,340);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.getContentPane().add(canva);
//		frame.getContentPane().add(canvas);
		
		frame.setVisible(true);
		}
	public void things(Graphics graphics)
		{
		graphics.setColor(new Color(138,188,244));
		graphics.fillRect(0, 0, 50, 50);
		graphics.setColor(new Color(238,168,244));
		graphics.drawRect(0, 0, 49, 49);
		}
	public void paint(Graphics graphics)
		{
		graphics.setColor(new Color(38,188,244));
		graphics.fillRect(0, 0, 50, 50);
		graphics.setColor(new Color(38,168,244));
		graphics.drawRect(0, 0, 49, 49);
		//
		graphics.setColor(new Color(38,188,244));
		graphics.fillRect(0, 50, 50, 50);
		graphics.setColor(new Color(38,168,244));
		graphics.drawRect(0, 50, 49, 49);
		//
		graphics.setColor(new Color(38,188,244));
		graphics.fillRect(0, 100, 50, 50);
		graphics.setColor(new Color(38,168,244));
		graphics.drawRect(0, 100, 49, 49);
		//
		graphics.setColor(new Color(38,188,244));
		graphics.fillRect(0, 150, 50, 50);
		graphics.setColor(new Color(38,168,244));
		graphics.drawRect(0, 150, 49, 49);
		//
		graphics.setColor(new Color(187,109,74));
		graphics.fillRect(0, 200, 50, 50);
		graphics.setColor(new Color(108,35,0));
		graphics.drawRect(0, 200, 49, 49);
		//
		graphics.setColor(new Color(187,109,74));
		graphics.fillRect(0, 250, 50, 50);
		graphics.setColor(new Color(108,35,0));
		graphics.drawRect(0, 250, 49, 49);
		//FIRST ROW DONE----------------------------------
		graphics.setColor(new Color(38,188,244));
		graphics.fillRect(50, 0, 50, 50);
		graphics.setColor(new Color(38,168,244));
		graphics.drawRect(50, 0, 49, 49);
		//
		graphics.setColor(new Color(38,188,244));
		graphics.fillRect(50, 50, 50, 50);
		graphics.setColor(new Color(38,168,244));
		graphics.drawRect(50, 50, 49, 49);
		//
		graphics.setColor(new Color(38,188,244));
		graphics.fillRect(50, 100, 50, 50);
		graphics.setColor(new Color(38,168,244));
		graphics.drawRect(50, 100, 49, 49);
		//
		graphics.setColor(new Color(38,188,244));
		graphics.fillRect(50, 150, 50, 50);
		graphics.setColor(new Color(38,168,244));
		graphics.drawRect(50, 150, 49, 49);
		//
		graphics.setColor(new Color(187,109,74));
		graphics.fillRect(50, 200, 50, 50);
		graphics.setColor(new Color(108,35,0));
		graphics.drawRect(50, 200, 49, 49);
		//
		graphics.setColor(new Color(187,109,74));
		graphics.fillRect(50, 250, 50, 50);
		graphics.setColor(new Color(108,35,0));
		graphics.drawRect(50, 250, 49, 49);
		//SECOND ROW DONE---------------------------------------
		graphics.setColor(new Color(255,255,255));
		graphics.fillRect(150, 0, 50, 50);
		graphics.setColor(new Color(255,255,255));
		graphics.drawRect(150, 0, 49, 49);
		//
		graphics.setColor(new Color(255,255,255));
		graphics.fillRect(150, 50, 50, 50);
		graphics.setColor(new Color(255,255,255));
		graphics.drawRect(150, 50, 49, 49);
		//
		graphics.setColor(new Color(38,188,244));
		graphics.fillRect(150, 100, 50, 50);
		graphics.setColor(new Color(38,168,244));
		graphics.drawRect(150, 100, 49, 49);
		//
		graphics.setColor(new Color(38,188,244));
		graphics.fillRect(150, 150, 50, 50);
		graphics.setColor(new Color(38,168,244));
		graphics.drawRect(150, 150, 49, 49);
		//
		graphics.setColor(new Color(187,109,74));
		graphics.fillRect(150, 200, 50, 50);
		graphics.setColor(new Color(108,35,0));
		graphics.drawRect(150, 200, 49, 49);
		//
		graphics.setColor(new Color(187,109,74));
		graphics.fillRect(150, 250, 49, 49);
		graphics.setColor(new Color(108,35,0));
		graphics.drawRect(150, 250, 49, 49);
		//THIRD ROW DONE----------------------------------------
		graphics.setColor(new Color(255,255,255));
		graphics.fillRect(100, 0, 50, 50);
		graphics.setColor(new Color(38,168,244));
		graphics.drawRect(100, 0, 49, 49);
		//
		graphics.setColor(new Color(38,188,244));
		graphics.fillRect(100, 50, 50, 50);
		graphics.setColor(new Color(38,168,244));
		graphics.drawRect(100, 50, 49, 49);
		//
		graphics.setColor(new Color(38,188,244));
		graphics.fillRect(100, 100, 50, 50);
		graphics.setColor(new Color(38,168,244));
		graphics.drawRect(100, 100, 49, 49);
		//
		graphics.setColor(new Color(38,188,244));
		graphics.fillRect(100, 150, 50, 50);
		graphics.setColor(new Color(38,168,244));
		graphics.drawRect(100, 150, 49, 49);
		//
		graphics.setColor(new Color(187,109,74));
		graphics.fillRect(100, 200, 50, 50);
		graphics.setColor(new Color(108,35,0));
		graphics.drawRect(100, 200, 49, 49);
		//
		graphics.setColor(new Color(187,109,74));
		graphics.fillRect(100, 250, 50, 50);
		graphics.setColor(new Color(108,35,0));
		graphics.drawRect(100, 250, 49, 49);
		//FOURTH ROW DONE----------------------------------------
		graphics.setColor(new Color(38,188,244));
		graphics.fillRect(200, 0, 50, 50);
		graphics.setColor(new Color(38,168,244));
		graphics.drawRect(200, 0, 49, 49);
		//
		graphics.setColor(new Color(255,255,255));
		graphics.fillRect(200, 50, 50, 50);
		graphics.setColor(new Color(255,255,255));
		graphics.drawRect(200, 50, 49, 49);
		//
		graphics.setColor(new Color(38,188,244));
		graphics.fillRect(200, 100, 50, 50);
		graphics.setColor(new Color(38,168,244));
		graphics.drawRect(200, 100, 49, 49);
		//
		graphics.setColor(new Color(38,188,244));
		graphics.fillRect(200, 150, 50, 50);
		graphics.setColor(new Color(38,168,244));
		graphics.drawRect(200, 150, 49, 49);
		//
		graphics.setColor(new Color(187,109,74));
		graphics.fillRect(200, 200, 50, 50);
		graphics.setColor(new Color(108,35,0));
		graphics.drawRect(200, 200, 49, 49);
		//
		graphics.setColor(new Color(187,109,74));
		graphics.fillRect(200, 250, 50, 50);
		graphics.setColor(new Color(108,35,0));
		graphics.drawRect(200, 250, 49, 49);
		//FIFTH ROW DONE-----------------------------------------------
		graphics.setColor(new Color(38,188,244));
		graphics.fillRect(250, 0, 50, 50);
		graphics.setColor(new Color(38,168,244));
		graphics.drawRect(250, 0, 49, 49);
		//
		graphics.setColor(new Color(38,188,244));
		graphics.fillRect(250, 50, 50, 50);
		graphics.setColor(new Color(38,168,244));
		graphics.drawRect(250, 50, 49, 49);
		//
		graphics.setColor(new Color(38,188,244));
		graphics.fillRect(250, 100, 50, 50);
		graphics.setColor(new Color(38,168,244));
		graphics.drawRect(250, 100, 49, 49);
		//
		graphics.setColor(new Color(38,188,244));
		graphics.fillRect(250, 150, 50, 50);
		graphics.setColor(new Color(38,168,244));
		graphics.drawRect(250, 150, 49, 49);
		//
		graphics.setColor(new Color(187,109,74));
		graphics.fillRect(250, 200, 50, 50);
		graphics.setColor(new Color(108,35,0));
		graphics.drawRect(250, 200, 49, 49);
		//
		graphics.setColor(new Color(187,109,74));
		graphics.fillRect(250, 250, 50, 50);
		graphics.setColor(new Color(108,35,0));
		graphics.drawRect(250, 250, 49, 49);
		//SIXTH ROW DONE--------------------------------------------
		graphics.setColor(new Color(108,35,0));
		graphics.fillRect(163, 184, 2, 2);
		graphics.setColor(new Color(255,198,147));
		graphics.fillRect(163, 186, 2, 2);
		graphics.fillRect(163, 188, 2, 2);
		graphics.fillRect(163, 190, 2, 2);
		graphics.setColor(new Color(108,35,0));
		graphics.fillRect(163, 196, 2, 2);
		graphics.fillRect(165, 174, 2, 2);
		graphics.fillRect(165, 176, 2, 2);
		graphics.fillRect(165, 178, 2, 2);
		graphics.fillRect(165, 182, 2, 2);
		graphics.fillRect(165, 184, 2, 2);
		graphics.setColor(new Color(255,198,147));
		graphics.fillRect(165, 186, 2, 2);
		graphics.fillRect(165, 188, 2, 2);
		graphics.fillRect(165, 190, 2, 2);
		graphics.setColor(new Color(108,35,0));
		graphics.fillRect(165, 194, 2, 2);
		graphics.fillRect(165, 196, 2, 2);
		graphics.setColor(Color.red);
		graphics.fillRect(167, 170, 2, 2);
		graphics.setColor(new Color(108,35,0));
		graphics.fillRect(167, 172, 2, 2);
		}
	@Override
	public void actionPerformed(ActionEvent arg0)
		{
		// TODO Auto-generated method stub
		
		}
	@Override
	public void keyPressed(KeyEvent arg0)
		{
		// TODO Auto-generated method stub
		
		}
	@Override
	public void keyReleased(KeyEvent arg0)
		{
		// TODO Auto-generated method stub
		
		}
	@Override
	public void keyTyped(KeyEvent arg0)
		{
		// TODO Auto-generated method stub
		
		}
	}


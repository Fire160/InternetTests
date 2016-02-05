import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Tester extends JFrame implements KeyListener, ActionListener
	{
	JTextArea displayArea;
    JTextField typingArea;
	public static void main(String[] args)
		{
//		javax.swing.SwingUtilities.invokeLater(new Runnable() 
//        	{
//            public void run() 
//            	{
//                createAndShowGUI();
//            	}
//        	}
//        	);
		Graphical canvas = new Graphical();
		TestingTests canva = new TestingTests();
		Tester frame = new Tester("Tester");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.addComponentsToPanel(frame);
	    frame.getContentPane().add(canva);
	    frame.repaint((long) 5.8);;
	    frame.setVisible(true);
		}
	private static void createAndShowGUI()
		{
		Tester frame = new Tester("Tester");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.addComponentsToPanel(frame);
	    frame.setVisible(true);
		}
	public void actionPerformed(ActionEvent e)
		{
        displayArea.setText("");
		}
	public void keyPressed(KeyEvent e)
		{
		System.out.println(e.getKeyChar());
		}
	public void keyReleased(KeyEvent e)
		{
		System.out.println("Loser");
		}
	public void keyTyped(KeyEvent e)
		{
		
		}
	public Tester(String name) 
		{
		super(name);
		}
	private void addComponentsToPanel(Tester frame) 
		{
		JButton button = new JButton("Clear");
	    button.addActionListener(this);
	    typingArea = new JTextField(20);
	    frame.addKeyListener(this);
	    displayArea = new JTextArea();
	    displayArea.setEditable(false);
	    JScrollPane scrollPane = new JScrollPane(displayArea);
	    scrollPane.setPreferredSize(new Dimension(375, 125));
//	    getContentPane().add(typingArea, BorderLayout.PAGE_START);
	    getContentPane().add(scrollPane, BorderLayout.CENTER);
	    getContentPane().add(button, BorderLayout.PAGE_END);
		}
	}

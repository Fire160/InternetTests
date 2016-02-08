import java.awt.BorderLayout;
import java.awt.Color;
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
    private static final Dimension WindowSize = new Dimension(700, 600);
    public static int x = WindowSize.width / 2;
   	public static int y = WindowSize.height / 2;
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
//		Graphical canvas = new Graphical();
//		TestingTests canva = new TestingTests();
		Tester frame = new Tester("Tester");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.addComponentsToPanel(frame);
//	    frame.getContentPane().add(canva);
	    Dimension screensize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        int x = screensize.width/2 - WindowSize.width/2;
        int y = screensize.height/2 - WindowSize.height/2;
        frame.setBounds(x, y, WindowSize.width, WindowSize.height);
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
		if(e.getKeyCode() == 87)
			{
			
			y -= 1;
			}
		else if(e.getKeyCode() == 65)
			{
			
			x -= 1;
			}
		else if(e.getKeyCode() == 83)
			{
			
			y += 1;
			}
		else if(e.getKeyCode() == 68)
			{
			
			x += 1;
			}
		else{}
		//if()
			{
			
			}
			
		repaint();
		typingArea.setText("");
		}
	public void keyReleased(KeyEvent e)
		{
		
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
	    typingArea.addKeyListener(this);
//	    displayArea = new JTextArea();
//	    displayArea.setEditable(false);
//	    JScrollPane scrollPane = new JScrollPane(displayArea);
//	    scrollPane.setSize(new Dimension(375, 125));
	    getContentPane().add(typingArea, BorderLayout.PAGE_END);
//	    getContentPane().add(scrollPane, BorderLayout.CENTER);
//	    getContentPane().add(button, BorderLayout.PAGE_END);
		}
	public void paint(Graphics g)
		{
	    g.setColor(Color.BLACK);
	    g.fillRect(0, 0, WindowSize.width, WindowSize.height);
	    int size = 50;
	    int R = (int) (Math.random() * 256);
	    int G = (int) (Math.random() * 256);        
	    int B = (int) (Math.random() * 256);
	    Color c = new Color(R, G, B);
	    g.setColor(Color.WHITE);
	    g.fillRect(x, y, size, size);
		}
	}

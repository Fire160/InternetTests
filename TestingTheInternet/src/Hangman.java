import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
public class Hangman extends JPanel {
    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        this.setBackground(Color.black);

        g.drawLine(100, 300, 100, 50);
        g.drawLine(200, 50, 100, 50);
        g.drawOval(50, 300, 100, 50);
        g.setColor(Color.BLUE);
        g.drawLine(200, 100, 200, 50);              
        g.drawOval(175, 100, 50, 50);       
        g.drawLine(200, 200, 200, 150);
        g.drawLine(200, 200, 250, 250);
        g.drawLine(200, 200, 150, 250);
        g.drawLine(150, 150, 200, 175);
        g.drawLine(250, 150, 200, 175);
    }
}
import javax.swing.JFrame;

public class HangmanAnimation extends JFrame
    {
    private Hangman hangman = new Hangman();
    public HangmanAnimation() 
        {
        add(hangman);
        }
    public static void main(String[] args) 
    	{
        JFrame frame = new HangmanAnimation();
        frame.setTitle("HangmanAnimation");
        frame.setLocationRelativeTo(null);
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    	}
    }
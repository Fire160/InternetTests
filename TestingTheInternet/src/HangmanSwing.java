
                   import java.awt.event.KeyAdapter;
                    
                    import java.awt.event.KeyEvent;
                    
                    import javax.swing.JPanel;
                    
                     
                    
                     
                    
                    public class HangmanSwing extends JPanel {
                  
                        private int y = 100;
                    
                            public HangmanSwing() {
                    
                                addKeyListener(new KeyAdapter () {
                    
                                    @Override
                   
                                    public void keyPressed(KeyEvent e) {
                    
                                        switch (e.getKeyCode()) {
                                       case KeyEvent.VK_DOWN: y += 10; break;
                    
                                            case KeyEvent.VK_UP: y -= 10; break;
                    
                                        }
                    
                                        repaint();
                    
                                    }
                    
                                });
                    
                            }
                    
                    

                }


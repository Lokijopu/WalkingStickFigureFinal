import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.Timer;

public class WalkingStickFigureMain extends JFrame{
	public WalkingStickFigureMain() {
		JFrame myFrame = new JFrame("Walking stick figure");
		myFrame.setLayout(null);
		myFrame.setBounds(400, 0, 500, 700);
		
		WalkingStickFigure man = new WalkingStickFigure();
		man.setLocation(11, 11);
		myFrame.add(man);
		Timer t1 = new Timer(1000, new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				myFrame.addKeyListener(new KeyListener() {
					
					public void keyPressed(KeyEvent e) {
						if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
							if (man.getX() < 455) {
								man.setDX(1);
								man.move();
							}
				        }
						else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
							if (man.getX() > 0) {
								man.setDX(-1);
					        	man.move();
							}
				        }
						else if (e.getKeyCode() == KeyEvent.VK_UP) {
							if (man.getY() > -8) {
								man.setDY(-1);
					        	man.move();
							}
				        }
						else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
							if (man.getY() < 600) {
					        	man.setDY(1);
					        	man.move();
							}
				        }
					}  

					public void keyReleased(KeyEvent arg0) {
						man.setDX(0);
						man.setDY(0);
						man.move();
					}

					public void keyTyped(KeyEvent arg0) {
						
			}
			
				
			});

			}
			
		});
		t1.start();
		myFrame.setVisible(true);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new WalkingStickFigureMain();
	}
}
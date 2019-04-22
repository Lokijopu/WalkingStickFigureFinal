import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Ellipse2D;
import javax.swing.JComponent;
	/**
	 * 
	 * @author Kevin Guo Period 6
	 *
	 */
	public class WalkingStickFigure extends JComponent{
		
		private Ellipse2D.Double head;
		private Rectangle body;
		private Rectangle leftArm;
		private Rectangle rightArm;
		private Rectangle leftLeg;
		private Rectangle rightLeg;
		private int dx;
		private int dy;
		public WalkingStickFigure() {
			head = new Ellipse2D.Double(10,10,10,10);
			body = new Rectangle(11,21,8,20);
			leftArm = new Rectangle(0, 21, 10, 8);
			rightArm = new Rectangle(19, 21, 10, 8);
			leftLeg = new Rectangle(7, 41, 8, 20);
			rightLeg = new Rectangle(15, 41, 8, 20);
			this.setSize(30, 70);
		}
		public void paintComponent(Graphics g) {
			Graphics2D g2 = (Graphics2D) g;
			g2.setColor(Color.BLUE);
			g2.draw(head);
			g2.fill(head);
			g2.draw(body);
			g2.fill(body);
			g2.draw(leftArm);
			g2.fill(leftArm);
			g2.draw(rightArm);
			g2.fill(rightArm);
			g2.draw(leftLeg);
			g2.fill(leftLeg);
			g2.draw(rightLeg);
			g2.fill(rightLeg);
		}
		public int getDX() {
			return dx;
		}
		public int getDY() {
			return dy;
		}
		public void setDX(int x) {
			dx = x;
		}
		public void setDY(int y) {
			dy = y;
		}
		public void move() {
			setLocation(getX() + dx,getY()  + dy);
			repaint();
		}
	}
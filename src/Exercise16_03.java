import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Exercise16_03 extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton up = new JButton("Up");
	private JButton down = new JButton("Down");
	private JButton left = new JButton("Left");
	private JButton right = new JButton("Right");
	private CirclePanel canvas = new CirclePanel();
	
	public Exercise16_03(){
		JPanel panel = new JPanel(); // Use the panel to group buttons
		panel.add(up);
		panel.add(down);
		panel.add(left);
		panel.add(right);
		
		this.add(canvas, BorderLayout.CENTER); // Add canvas to center
		this.add(panel, BorderLayout.SOUTH); // Add buttons to the frame
		up.addActionListener(new UpListener());
		down.addActionListener(new DownListener());
		left.addActionListener(new LeftListener());
		right.addActionListener(new RightListener());
	}
	/** Main method */
	public static void main(String[] args) {
		JFrame frame = new Exercise16_03();
		frame.setTitle("ControlCircle1");
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(450, 450);
		frame.setVisible(true);
	}

	class UpListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			canvas.up();
		}
	}
	
	class DownListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			canvas.down();
		}
	}
	
	class LeftListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			canvas.left();
		}
	}
	
	class RightListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			canvas.right();
		}
	}
	
	class CirclePanel extends JPanel {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private int x = 200;
		private int y = 200;
		private int radius = 10;
		/** Repaint the circle */
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			//g.drawOval(getWidth() / 2 - radius, getHeight() / 2 - radius, 2 * radius, 2 * radius);
			g.drawOval(x, y, 2 * radius, 2 * radius);
		}
		
		public void up() {
			y -= 10;
			repaint();
		}
		
		public void down(){
			y +=10;
			repaint();
		}
		
		public void left(){
			x -= 10;
			repaint();
		}
		
		public void right(){
			x += 10;
			repaint();
		}
	}
}

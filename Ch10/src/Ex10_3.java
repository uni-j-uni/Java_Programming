import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ex10_3 extends JFrame {
	private JLabel la = new JLabel("Hello"); 
	public Ex10_3() {
		setTitle("Mouse 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.addMouseListener(
				new MouseAdapter() {
					public void mousePressed(MouseEvent e) {
						int x = e.getX();
						int y = e.getY();
						la.setLocation(x, y);
						la.setText("(X : " + x + ", Y : " + y + ")");
					}
				});
		c.setLayout(null);
		la.setSize(50, 20);
		la.setLocation(30, 30);
		c.add(la);

		setSize(250, 250);
		setVisible(true);
	}
	public static void main(String [] args) {
		new Ex10_3();
	}
} 

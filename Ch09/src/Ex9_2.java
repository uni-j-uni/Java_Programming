import javax.swing.*;
import java.awt.*;

public class Ex9_2 extends JFrame{
	public Ex9_2() {
		setTitle("Hello Program");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		JTextField text1 = new JTextField();
		text1.setPreferredSize(new Dimension(200, 20));
		c.add(text1, BorderLayout.WEST);
		c.add(new JButton("확인"), BorderLayout.EAST);
		c.add(new JLabel("Hello"), BorderLayout.SOUTH);
		pack();
		setVisible(true);
	}
	public static void main(String args[]) {
		new Ex9_2();
	}
}

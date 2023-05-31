import javax.swing.*;
import java.awt.*;

public class Ex9_3 extends JFrame{
	public Ex9_3() {
		setTitle("GridLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new GridLayout(4, 1, 10, 10));
		c.add(new JLabel("이름"));
		c.add(new JTextField("윤희준"));
		c.add(new JLabel("학번"));
		c.add(new JTextField("20"));
		c.add(new JLabel("학과"));
		c.add(new JTextField("소프트웨어학과"));
		c.add(new JLabel("과목"));
		c.add(new JTextField("자바"));
		
		pack();
		setVisible(true);
	}
	public static void main(String args[]) {
		new Ex9_3();
	}
}

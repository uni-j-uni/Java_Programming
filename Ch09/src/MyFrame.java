import java.awt.*;
import javax.swing.*;

public class MyFrame extends JFrame {
	public MyFrame() {
		setTitle("첫번째 윈도우 프로그램");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane();
		JLabel label1 = new JLabel("내 이름은 윤희준입니다.");
		contentPane.add(label1);
		setPreferredSize(new Dimension(300, 150));
		pack();
		setVisible(true);
	}
	public static void main(String args[]) {
		new MyFrame();
	}
}

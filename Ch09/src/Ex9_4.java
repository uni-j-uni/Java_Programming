import javax.swing.*;
import java.awt.*;

public class Ex9_4 extends JFrame{
	public Ex9_4() {
		setTitle("덧셈 프로그램");
		Container c = getContentPane();
		
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		
        c.add(p1, BorderLayout.CENTER);
        c.add(p2, BorderLayout.SOUTH);
        p1.setLayout(new GridLayout(1, 5));
        
        JTextField t1 = new JTextField();
        t1.setColumns(10);
        p1.add(t1);
        p1.add(new JLabel("    +"));
        JTextField t2 = new JTextField();
        t2.setColumns(10);
        p1.add(t2);
        p1.add(new JLabel("    ="));
        JTextField t3 = new JTextField();
        t3.setColumns(10);
        p1.add(t3);
        
        p2.setLayout(new FlowLayout());
        p2.add(new JButton("확인"));
        p2.add(new JButton("취소"));
        
        setPreferredSize(new Dimension(200, 100));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}
	public static void main(String args[]) {
		new Ex9_4();
	}
}

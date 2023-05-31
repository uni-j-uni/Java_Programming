import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Ex10_1 extends JFrame{
	public Ex10_1() {
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
        JButton btn = new JButton("확인");
        btn.addActionListener(new Addition(t1, t2, t3));
        p2.add(btn);
        p2.add(new JButton("취소"));
        
        setPreferredSize(new Dimension(200, 100));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}
	class Addition implements ActionListener {
		JTextField t1, t2, t3;
		Addition(JTextField t1, JTextField t2, JTextField t3) {
			this.t1 = t1;
			this.t2 = t2;
			this.t3 = t3;
		}
		public void actionPerformed(ActionEvent e) {
			int sum = Integer.parseInt(t1.getText()) + Integer.parseInt(t2.getText());
			t3.setText(Integer.toString(sum));
		}
	}
	public static void main(String args[]) {
		new Ex10_1();
	}
}

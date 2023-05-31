import javax.swing.*;
import java.awt.*;

public class Ex12_1 extends JFrame{
	private MyPanel panel = new MyPanel();
	public Ex12_1() {
		setTitle("fillXXX사용예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(500, 600);
		setVisible(true);
	}
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.ORANGE);	// 얼굴
			g.fillOval(90,70,300,350);
			g.setColor(Color.BLACK);	// 모자
			g.fillRoundRect(50,40,400,100,10,10);
			g.setColor(Color.BLACK);	// 모자 윗부분 
			g.fillRect(140,0,200,100);
			g.setColor(Color.WHITE);	// 눈 왼쪽
			g.fillOval(130,160,90,70);
			g.setColor(Color.WHITE);	// 눈 오른쪽
			g.fillOval(260,160,90,70);
			g.setColor(Color.BLACK);	// 눈동자 왼쪽
			g.fillOval(160,180,40,40);
			g.setColor(Color.BLACK);	// 눈동자 오른쪽
			g.fillOval(280,180,40,40);
			g.setColor(Color.RED);	// 입
			g.fillOval(190,300,100,100);
			
			int[] x ={240,150,240,240};
			int[] y ={225,275,260,275};
			g.setColor(Color.YELLOW);
			g.fillPolygon(x, y, 4);		// 코
		}
	}
	public static void main(String[] args) {
		new Ex12_1();
	}
}

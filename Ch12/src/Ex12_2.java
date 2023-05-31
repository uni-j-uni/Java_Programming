import javax.swing.*;
import java.awt.*;

public class Ex12_2 extends JFrame{
	private MyPanel panel = new MyPanel();
	
	public Ex12_2() {
		setTitle("이미지 일부분을 크기 조절하여 그리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel.setPreferredSize(new Dimension(600, 600));
		setContentPane(panel);
		pack();
		setVisible(true);
		}
	class MyPanel extends JPanel {
		private Image[] imgs;
		
		public MyPanel() {
			imgs = new Image[3];
			for (int i = 0; i < imgs.length; ++i)
				imgs[i] = (new ImageIcon("" + i + ".jpg")).getImage(); // ""안에 이미지 이름 삽입, 이름 뒤에 번호 붙이기 
		}
		private int [][] map = {
				{0, 1, 2},
				{1, 0, 2},
				{2, 1, 0}
		};
		public void paintComponent(Graphics g) {
			final int ImgWidth = 200;
			final int ImgHeight = 200;
			super.paintComponent(g);
			for (int row = 0; row < 3; ++row)
				for (int col = 0; col < 3; ++col)
					g.drawImage(imgs[map[row][col]], col * ImgWidth, row * ImgHeight, ImgWidth, ImgHeight, this);
			}
		}
	public static void main(String [] args) {
		new Ex12_2();
	}
}

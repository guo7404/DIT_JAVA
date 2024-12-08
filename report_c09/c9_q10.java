package report_c09;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class c9_q10 extends JFrame{
//	public void setNum(JLabel num) {
//			Random random = new Random();
//	        int x = random.nextInt(151) + 50; // 50~200 사이의 랜덤 x좌표
//	        int y = random.nextInt(151) + 50; // 50~200 사이의 랜덤 y좌표
//	        // JLabel 위치 설정
//	        num.setBounds(x, y, 100, 30); // JLabel의 위치와 크기 설정
//        
//	}
	
	public c9_q10() {
		setSize(400,400);
		Colors colors = new Colors();
		JPanel wsetPanel = new JPanel();
		JPanel centerPanel = new JPanel();
		
		wsetPanel.setLayout(new GridLayout(10,1));
		wsetPanel.setPreferredSize(new Dimension(50,0));
		centerPanel.setLayout(null);

		for(int i=0;i<10;i++) {
			JButton button = new JButton();
			button.setBackground(colors.setColors[i]);
			button.setEnabled(false);
			wsetPanel.add(button);
		}
		
		for(int i=0;i<10;i++) {
			JLabel numLabel = new JLabel(String.valueOf(i));
			numLabel.setText(String.valueOf(i));
			Random random = new Random();
	        int x = random.nextInt(151) + 50; // 50~200 사이의 랜덤 x좌표
	        int y = random.nextInt(151) + 50; // 50~200 사이의 랜덤 y좌표
	        // JLabel 위치 설정
	        numLabel.setBounds(x, y, 100, 30); // JLabel의 위치와 크기 설정
			centerPanel.add(numLabel);
		}
		
		add(wsetPanel,BorderLayout.WEST);
		add(centerPanel,BorderLayout.CENTER);
		setVisible(true);

	}
	
	public static void main(String[] args) {
		new c9_q10();
	}
}

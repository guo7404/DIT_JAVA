package reprot_c10;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class c10_q5 extends JFrame {
	
	public c10_q5(){
		Random random = new Random();
		JLabel label = new JLabel();
		
		int width = 800;
		int height = 800;
		
		label.setText("c");
        label.setFont(new Font("", Font.BOLD, 30));	
        label.setLocation(100,100); // 위치 설정
		label.setSize(label.getPreferredSize());
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				int X = random.nextInt(getWidth()-label.getWidth()*2);
		        int Y = random.nextInt(getHeight()-label.getHeight()*2);
				label.setLocation(X,Y);
			}
		});
        
        add(label);
		setSize(width,height);
		setLayout(null);
		setVisible(true);
		setLocationRelativeTo(null);
	}
	
	public static void main(String[] args) {
		new c10_q5();
	}
}
package reprot_c10;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class c10_q10 extends JFrame{
	private int mouseX;
	private int mouseY;
	Random random = new Random();
	
	private void createBlock() {
		JLabel block = new JLabel();
		block.setOpaque(true);
        block.setBackground(Color.BLUE); // 블록의 배경색 설정

		block.setSize(80,80);
		
		int x = random.nextInt(getWidth() - block.getWidth());
        int y = random.nextInt(getHeight() - block.getHeight());
		block.setLocation(x,y);
		add(block);
		
		block.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                mouseX = e.getX();
                mouseY = e.getY();
            }
        });
		block.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                int x = block.getX() + e.getX() - mouseX;
                int y = block.getY() + e.getY() - mouseY;
                block.setLocation(x, y);
                revalidate();
                repaint();
            }
        });
		
		revalidate(); // 레이아웃 갱신
        repaint(); // 화면 갱신
	}
	
	public c10_q10() {
		setSize(800,800);
        setLocationRelativeTo(null);
        setFocusable(true);
        setLayout(null); 
		
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyChar()== 'm') {
					createBlock();
				}
			}
		});
		
		setVisible(true);

		
	}
	
	public static void main(String[] args) {
		new c10_q10();
	}
	
}

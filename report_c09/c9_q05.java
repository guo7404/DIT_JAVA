package report_c09;

import javax.swing.*;

import java.awt.Color;
import java.awt.GridLayout;
class Colors{
	public Color[] setColors = {
			Color.RED, Color.GREEN, Color.BLUE, Color.YELLOW,
	        Color.CYAN, Color.MAGENTA, Color.ORANGE, Color.PINK,
	        Color.LIGHT_GRAY, Color.DARK_GRAY, Color.BLACK, Color.WHITE,
	        new Color(128, 0, 128), new Color(255, 165, 0), // 퍼플, 오렌지
	        new Color(0, 255, 255), new Color(255, 20, 147) // 시안, 딥 핑크
	    };
}
public class c9_q05 extends JFrame{
	
	public c9_q05() {
		Colors colors = new Colors();
		setTitle("hi");
		setVisible(true);
		setSize(800,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(new GridLayout(4,4));
        for(int i=0;i<16;i++) {
        	JButton button = new JButton();
        	button.setBackground(colors.setColors[i]);
        	button.setText(String.valueOf(i));
//        	button.setVisible(true);
//        	button.setEnabled(false);
        	add(button);
        }
        
	}
	public static void main(String[] args) {
//		c9_q05 frame = new c9_q05();
		new c9_q05();
//		GridLayout gridLayout = new GridLayout();
//		gridLayout.setRows(4);
//		gridLayout.setColumns(4);
		
	}
}

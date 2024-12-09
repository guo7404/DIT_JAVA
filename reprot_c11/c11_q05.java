package reprot_c11;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class c11_q05 extends JFrame{
	public c11_q05() {
		Container c = getContentPane();
		JPanel panel = new JPanel();
		JSlider slider = new JSlider(JSlider.HORIZONTAL,100,200,100);
		JLabel label = new JLabel(String.valueOf(slider.getValue()));
		slider.setMajorTickSpacing(20);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        slider.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				// TODO Auto-generated method stub
				int value = slider.getValue();
				label.setText(String.valueOf(value));
			}
		});
		
		panel.add(slider);
		panel.add(label);
		panel.setLayout(new FlowLayout());
		c.add(panel,BorderLayout.CENTER);
		setSize(500,500);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new c11_q05();
	}

}

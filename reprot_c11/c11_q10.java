package reprot_c11;

import java.awt.BorderLayout;
import java.awt.Container;
import java.util.Random;

import javax.swing.*;

public class c11_q10 extends JFrame{
	private Random random;
	private String[] sentence = {
			"I think, therefore I am.",//René Descartes
			"To be or not to be.",//William Shakespeare
			"That’s one small step for man.",//Neil Armstrong
			"Injustice anywhere is a threat to justice everywhere.",//Martin Luther King Jr.
			"Love conquers all."//Virgil
	};
	public void randomtext() {
		String[][] words;
        String[][] wordsArray = new String[sentence.length][];
		// 각 문장을 단어 단위로 분리하여 2차원 배열에 저장
        for (int i = 0; i < sentence.length; i++) {
            wordsArray[i] = sentence[i].split(" "); // 공백으로 단어 분리
        }
	}
	public c11_q10() {
		Container c = getContentPane();
		
		JPanel northPanel = new JPanel();
		JLabel label1 = new JLabel("단어 조합게임! 순서대로 단어를 클릭하세요.");
		JButton button1 = new JButton("New Text");
		northPanel.add(label1);
		northPanel.add(button1);
		
		JPanel southPanel = new JPanel();
		JLabel label2 = new JLabel(">>");
		southPanel.add(label2);
		
		JPanel centerPanel = new JPanel();
		
		c.add(southPanel,BorderLayout.SOUTH);
		c.add(northPanel,BorderLayout.NORTH);
		c.add(centerPanel,BorderLayout.CENTER);
		setLocationRelativeTo(null);
		setSize(500,500);
		setVisible(true);
	}
	public static void main(String[] args) {
		new c11_q10();
	}
}

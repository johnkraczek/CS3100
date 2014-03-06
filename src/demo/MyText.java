package demo;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class MyText extends JPanel {
	private static final long serialVersionUID = 1L;

	public MyText() {
		JLabel label = new JLabel("<html><b> Hello World </b></html>");
		label.setFont(new Font("Comic Sans MS", Font.ITALIC, 24));
		label.setForeground(Color.RED);
		this.add(label);

		JTextArea text = new JTextArea(8, 20);
		text.setText("The quick brown fox jumped over the lazy dog.The quick brown fox jumped over the lazy dog.The quick brown fox jumped over the lazy dog.The quick brown fox jumped over the lazy dog.The quick brown fox jumped over the lazy dog.The quick brown fox jumped over the lazy dog.The quick brown fox jumped over the lazy dog.The quick brown fox jumped over the lazy dog.The quick brown fox jumped over the lazy dog.The quick brown fox jumped over the lazy dog.The quick brown fox jumped over the lazy dog.The quick brown fox jumped over the lazy dog.The quick brown fox jumped over the lazy dog.The quick brown fox jumped over the lazy dog.The quick brown fox jumped over the lazy dog.The quick brown fox jumped over the lazy dog.The quick brown fox jumped over the lazy dog.The quick brown fox jumped over the lazy dog.The quick brown fox jumped over the lazy dog.The quick brown fox jumped over the lazy dog.");
		text.setLineWrap(true);
		text.setWrapStyleWord(true);
		
		final JScrollPane scroll = new JScrollPane(text);
		
		EventQueue.invokeLater(new Runnable() {
			public void run(){
				scroll.getVerticalScrollBar().setValue(0);
			}
		});
		this.add(scroll);

		//Border border = BorderFactory.createBevelBorder(BevelBorder.LOWERED); 
		//Border border = BorderFactory.createEtchedBorder(EtchedBorder.RAISED);
		//Border border = BorderFactory.createLineBorder(Color.BLUE, 4);
		//Border border = BorderFactory.createMatteBorder(6,0,6,0, Color.BLUE);
		Border border = BorderFactory.createEmptyBorder(20,0,0,0); // this is useful for positioning
		
		scroll.setBorder(border);
		scroll.setOpaque(false);
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new JFrame();
				frame.setTitle("myText");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				// frame.pack();
				frame.setSize(320, 240);
				frame.setLocationByPlatform(true);
				frame.add(new MyText());
				frame.setVisible(true);
			}
		});
	}
}

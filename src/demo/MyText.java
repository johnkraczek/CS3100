package demo;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyText extends JPanel {
	private static final long serialVersionUID = 1L;
	
	public MyText(){
	JLabel label = new JLabel("Hello World");
	label.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
	this.add(label);
	label.setText("YEAH");
	this.add(label);
	}
	

	public static void main(String[] args){
		EventQueue.invokeLater(new Runnable(){
			public void run(){
				JFrame frame = new JFrame();
				frame.setTitle("myText");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				//frame.pack();
				frame.setSize(320,240);
				frame.setLocationByPlatform(true);
				frame.add(new MyText());
				frame.setVisible(true);
			}
		});
	}
}

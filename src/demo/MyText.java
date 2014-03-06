package demo;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyText extends JPanel {
	private static final long serialVersionUID = 1L;
	
	public MyText(){
	JLabel label = new JLabel("<html><b> Hello World </b></html>");
	label.setFont(new Font("Comic Sans MS", Font.ITALIC, 24));
	label.setForeground(Color.RED);
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

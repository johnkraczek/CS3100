package demo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyText extends JPanel {
	private static final long serialVersionUID = 1L;

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

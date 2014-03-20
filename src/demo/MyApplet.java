package demo;

import java.awt.EventQueue;

import javax.swing.JApplet;

public class MyApplet extends JApplet{

	private static final long serialVersionUID = 1L;

	public void init(){
		
		EventQueue.invokeLater(new Runnable(){
		
			public void run(){
				add(new MyText());
			}
		
		});
		
	}
	
}

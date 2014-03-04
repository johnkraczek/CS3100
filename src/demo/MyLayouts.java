package demo;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyLayouts extends JPanel implements ActionListener {
	private static final long serialVersionUID = -1560980475;

	JButton redButton;
	JButton greenButton;
	JButton blueButton;
	JButton yellowButton;
	
	public MyLayouts(){
		this.setBackground(Color.BLACK);
		
		redButton = new JButton("Red");
		greenButton = new JButton("Green");
		blueButton = new JButton("Blue");
		yellowButton = new JButton("Yellow");
		
		
		redButton.addActionListener(this);
		greenButton.addActionListener(this);
		blueButton.addActionListener(this);
		yellowButton.addActionListener(this);
		
		this.setLayout(null);
		
		this.redButton.setSize(100,30);
		this.redButton.setLocation(100, 0);
		
		this.greenButton.setSize(100,30);
		this.greenButton.setLocation(100, 30);
		
		this.blueButton.setSize(100,30);
		this.blueButton.setLocation(0, 30);
		
		this.yellowButton.setSize(100,30);
		this.yellowButton.setLocation(0, 0);
		
		this.add(redButton);
		this.add(greenButton);
		this.add(blueButton);
		this.add(yellowButton);
	}
	
	public void actionPerformed(ActionEvent event) {
		Object source = event.getSource();
		if(source == redButton){
			this.setBackground(Color.RED);
		}else if(source == greenButton){
			this.setBackground(Color.GREEN);
		}else if(source == blueButton){
			this.setBackground(Color.BLUE);
		}
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable(){
			public void run(){
				JFrame frame = new JFrame();
				frame.setTitle("MyLayouts");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setSize(320,240);
				frame.setLocationByPlatform(true);
				frame.add(new MyLayouts());
				frame.setVisible(true);
			}
		});
	}


}

package demo;

import java.awt.BorderLayout;
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
		
		this.setLayout(new BorderLayout());
		
		this.add(redButton, BorderLayout.NORTH);
		this.add(greenButton, BorderLayout.SOUTH);
		this.add(blueButton, BorderLayout.EAST);
		this.add(yellowButton, BorderLayout.WEST);
	}
	
	public void actionPerformed(ActionEvent event) {
		Object source = event.getSource();
		if(source == redButton){
			this.setBackground(Color.RED);
		}else if(source == greenButton){
			this.setBackground(Color.GREEN);
		}else if(source == blueButton){
			this.setBackground(Color.BLUE);
		}else if(source == yellowButton){
			this.setBackground(Color.YELLOW);
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

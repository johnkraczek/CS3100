package demo;

import java.awt.EventQueue;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyMouse extends JPanel implements MouseListener {

	private static final long serialVersionUID = 1L;
	
	MyMouse(){
		this.addMouseListener(this);
	}
	
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run(){
				JFrame frame = new JFrame();
				frame.setTitle("MyMouse");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setLocationByPlatform(true);
				frame.add(new MyMouse());
				frame.setSize(320, 240);
				
				frame.setVisible(true);
			}
		});
		
	}

	public void mouseClicked(MouseEvent event) {
	}
	
	public void mouseEntered(MouseEvent event) {
	}

	public void mouseExited(MouseEvent event) {
	}

	public void mousePressed(MouseEvent event) {
		int x = event.getPoint().x;
		int y = event.getPoint().y;
		System.out.println("Mouse Pressed(" + x + "," + y + ")");
	}

	public void mouseReleased(MouseEvent event) {
	}

}

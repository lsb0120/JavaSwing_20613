package unit03.LayoutExam;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HelloPanel extends JFrame{
	HelloPanel(){
		
		
		JPanel p =new JPanel(); 
		p.setBackground(Color.orange);
		add(p);
		
		JButton b=new JButton("버튼1");
		b.setBackground(Color.yellow);
		p.add(b);
		JButton c=new JButton("버튼2");
		c.setBackground(Color.pink);
		p.add(c);
		
		
		
		setTitle("안녕 패널");
		setSize(300,100);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new HelloPanel();

	}

}

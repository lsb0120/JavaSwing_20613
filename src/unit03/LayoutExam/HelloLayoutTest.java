package unit03.LayoutExam;

import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class HelloLayoutTest extends JFrame{
	HelloLayoutTest(){
		
		
		
		setLayout(new GridLayout(0,1));
		JPanel p1= new JPanel();
		p1.setLayout(new GridLayout(0,2));
		JPanel p2= new JPanel();
		p2.setLayout(new FlowLayout());
		
		
		JButton b1=new JButton("버튼1");
		JButton b2=new JButton("버튼2");
		JButton b3=new JButton("버튼3");
		JButton b4=new JButton("버튼4");
		JButton b5=new JButton("버튼5");
		JButton b6=new JButton("버튼6");
		JButton b7=new JButton("버튼7");
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		p1.add(b4);
		p2.add(b5);
		p2.add(b6);
		p2.add(b7);
		
		
		
		add(p1);
		add(p2);
		setTitle("레이아웃 섞기");
		setSize(350,200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		new HelloLayoutTest();

	}

}

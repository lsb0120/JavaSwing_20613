package unit03.LayoutExam;

import java.awt.*;

import javax.swing.*;


public class HelloBorderLayout extends JFrame{
	HelloBorderLayout() {
		//패널을 만들어보자, 프레임위에 붙이자
		JPanel p= new JPanel();
		add(p);
		
		JButton b1=new JButton("버튼1");
		JButton b2=new JButton("버튼2");
		JButton b3=new JButton("버튼3");
		JButton b4=new JButton("버튼4");
		JButton b5=new JButton("버튼5");
		
		
		p.setLayout(new BorderLayout());
		
		p.add(b1,BorderLayout.NORTH);
		p.add(b2,BorderLayout.CENTER);
		p.add(b3,BorderLayout.SOUTH);
		p.add(b4,BorderLayout.WEST);
		p.add(b5,BorderLayout.EAST);
		
		
		
		
		//프레임기본세팅
		setTitle("보더 레이아웃");
		setSize(350,200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		
		
		
	}
	public static void main(String[] args) {
		new HelloBorderLayout();

	}

}

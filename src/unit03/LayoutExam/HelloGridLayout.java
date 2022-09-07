package unit03.LayoutExam;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HelloGridLayout extends JFrame{
		 HelloGridLayout(){
			 
			 
			 //소스를 변경함
			JPanel p=new JPanel();
			p.setBackground(Color.black);
			add(p);
			JButton b1=new JButton("버튼1");
			JButton b2=new JButton("버튼2");
			JButton b3=new JButton("버튼3");
			JButton b4=new JButton("버튼4");
			JButton b5=new JButton("버튼5");
			JButton b6=new JButton("버튼6");
			JButton b7=new JButton("버튼7");
				
				
				//p.setLayout(new GridLayout(3,2));
				p.setLayout(new GridLayout(0,3,10,10));
				
				
				p.add(b1);
				p.add(b2);
				p.add(b3);
				p.add(b4);
				p.add(b5);
				p.add(b6);
				p.add(b7);
			 
				setTitle("그리드 레이아웃");
				setSize(500,300);
				setDefaultCloseOperation(EXIT_ON_CLOSE);
				setVisible(true);
			 
		 }
	public static void main(String[] args) {
		new HelloGridLayout();

	}//https://github.com/lsb0120/JavaSwing_20613.git
	//NewToken20613
	//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

}

package unit30.component;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class HelloButten extends JFrame implements ActionListener{
	//이벤트 소스가 될수 있는 컴포넌트는 다른 곳에서도 사용괼수 있으므로
	//멤버변수로 선언함
	JPanel p1;
	JButton b1,b2;
	
	HelloButten(){
		
		
		p1= new JPanel();
		add(p1);
		b1=new JButton("노란색");
		b2=new JButton("핑크색");
		
		p1.add(b1);
		p1.add(b2);
		
		//버튼에 리슨어를 달아보자
		b1.addActionListener(this);
		b2.addActionListener(this);
		//프레임 세팅
		setTitle("버튼 이벤트");
		setSize(700,400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		
		
	}
	
	public static void main(String[] args) {
		new HelloButten();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
			p1.setBackground(Color.yellow);
			JOptionPane.showMessageDialog(null, e.getActionCommand()+" 버튼이 클릭이 되었습니다");
			}
		else if(e.getSource()==b2) {
			p1.setBackground(Color.pink);
			JOptionPane.showMessageDialog(null, e.getActionCommand()+" 버튼이 클릭이 되었습니다");
		}
		
	}
	
	
	
}









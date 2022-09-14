package unit30.component;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class HelloButten extends JFrame implements ActionListener{
	//�̺�Ʈ �ҽ��� �ɼ� �ִ� ������Ʈ�� �ٸ� �������� ��뱮�� �����Ƿ�
	//��������� ������
	JPanel p1;
	JButton b1,b2;
	
	HelloButten(){
		
		
		p1= new JPanel();
		add(p1);
		b1=new JButton("�����");
		b2=new JButton("��ũ��");
		
		p1.add(b1);
		p1.add(b2);
		
		//��ư�� ����� �޾ƺ���
		b1.addActionListener(this);
		b2.addActionListener(this);
		//������ ����
		setTitle("��ư �̺�Ʈ");
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
			JOptionPane.showMessageDialog(null, e.getActionCommand()+" ��ư�� Ŭ���� �Ǿ����ϴ�");
			}
		else if(e.getSource()==b2) {
			p1.setBackground(Color.pink);
			JOptionPane.showMessageDialog(null, e.getActionCommand()+" ��ư�� Ŭ���� �Ǿ����ϴ�");
		}
		
	}
	
	
	
}









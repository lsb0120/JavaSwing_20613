package unit03.LayoutExam;

import javax.swing.JFrame;

//2. JFrame ��� �ޱ�
public class HelloSwing extends JFrame{
//4.������ �ȿ��� ȭ���� ����
	HelloSwing(){
		//3.ȭ�� �ʱ� �����ϱ�
		setTitle("�ȳ� ����");
		setSize(300,100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
		
	public static void main(String[] args) {
		//1.new ������()�� ������ ���α׷� �����Ű��
		new HelloSwing();

	}

}

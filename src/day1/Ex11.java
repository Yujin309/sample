package day1;
//����
//�л��� �̸�, ����
//��������, ��������, ��������
//�� �޾Ƽ�
//�̸��� 5�ڸ� ��Ʈ��
//���̴� 3�ڸ� ����������
//�������� �������� ���������� 3�ڸ� �����������ϰ� 0���� ��ĭ ä���
//������ 3�ڸ� ��������
//����� �Ҽ��� 2�ڸ����� ����ϴ� ���α׷� �ۼ��ϱ� 

import java.util.Scanner;
public class Ex11 {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		//�̸�, ����, ����, ���� , ��������
		System.out.print("�̸�: ");
		String name= scanner.nextLine();
		System.out.print("����: ");
		int age = scanner.nextInt();
		System.out.print("����: ");
		int korean = scanner.nextInt();
		System.out.print("����: ");
		int english = scanner.nextInt();
		System.out.print("����: ");
		int math = scanner.nextInt();
		
		//������ ����غ���
		int sum= korean + english + math;
		
		//����� ����غ���
		double average = sum / 3.0;
		
		System.out.printf("�̸�:%5s,����:%3d,����:%03d "
		+" ����: %03d ����:%03d ����:%-3d ���: %.2f",
				name,age, korean,english,math,sum,average);
		
		scanner.close();
	    
	}
}

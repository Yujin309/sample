package day2;
//���ǹ� - ����if��
//���� �ϳ��� ������ ����ؾ� ���� �׽�Ʈ�� �ؾ��ϴ� 
//���ǹ��̶�� 
//if�� �ȿ� if���� �����ִ�.


import java.util.Scanner;
public class Ex08 {
	
public static void main(String[] args) {
	Scanner scanner= new Scanner(System.in);
	System.out.println("���̸� �Է����ּ���:");
	int age = scanner.nextInt();
	if (age >= 18) {
		//18�� �̻��̹Ƿ� ������ �Է� ����
		
	System.out.println("������ �Է��ϼ���.1�̸� ���� 2�� ����");
	int sex = scanner.nextInt();
	if(sex ==1) {
		//18��  + �̹Ƿ� ��ü ��� �Է� ����

		System.out.println("��ü����� �Է����ּ���:");
		int category = scanner.nextInt();
		
		if(category>= 1 && category <= 3) {
			System.out.println("����");
			
		}else if(category ==4) {
			System.out.println("����");
			
		}else {
			System.out.println("����");
			
		}
		
	
	}else if(sex ==2) {
		System.out.println("�����̹Ƿ� ������ �ǹ��� �����ϴ�");
	}else {
		System.out.println("�߸��Է��ϼ̽��ϴ�.");
		
	}
	}else {
		//18���̸�= �̼������̱⿡ �ش� ���ٰ� ���
		System.out.println("�̼����ڶ� ���� ���� �ǹ��� �����ϴ�.");
		}
	
	
	scanner.close();
}
}

package day2;
//�ݺ���- while ��

// for �ݺ������� i���� ����� ����� �����ϸ鼭
//�ݺ��϶�� ���� ��

//while �� ���ǽ��� ���� 
//true �� ������ �ݺ�. false�� ���� �Ǵ� ����

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		
		int count = 0;
	
		while (count > 5) {
			System.out.println("count:" + count);
		}
//���ѷ����� ���� �޴��� �����
//3���� ��� 
//1- int ���� �ϳ� ���� �� ������ ������ �ʰ� ������ ���� ������ ���ǽ�
// int count = 0; while(count<5)

//2- ���������� true�� ���ü� �ۿ� ���� ���ǽ� 
//while(0<1), while(0 == 0)

//3. true
//while(true) 

		Scanner scanner = new Scanner(System.in);

		while (true) {

			System.out.println("��Ʈ �л����� ���α׷�");
			System.out.println("1.�Է� 2.��� 3.����");
			System.out.print(">");

			int choice = scanner.nextInt();
			if (choice == 1) {
				// ���� �л��� ������ �Է��ϴ� �ڵ�

			} else if (choice == 2) {
				// �Էµ� �л��� ������ ����ϴ� �ڵ�
			} else if (choice == 3) {
				System.out.println("������ּż� �����մϴ�");
				break;
			} else {
				System.out.println("�߸��Է��ϼ̽��ϴ�.");
			}
		}
		scanner.close();

	}
}

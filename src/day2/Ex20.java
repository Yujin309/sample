package day2;
//����ڷ� ���� �̸� ���� ���� ���� ������ �Է¹޾�

//�̸� ���� ���� ����� ����ϴ� ���α׷� �����
//�� �̸��� "-1"�� ���ö�����
//��� �Է� �ޱ� 

import java.util.Scanner;

public class Ex20 {
//����� 
//final�̶�� Ű���� (�����)�� �ٿ��� �������
//������ static�żҵ��� main �޼ҵ尡 �ֱ⶧����
//static���� �ٿ���
	
final static int SUBJECT_NUMBER= 3;
//���δ� �빮��- ���

final static double SUBJECT_TO_DOUBLE = SUBJECT_NUMBER *1.0;
//SUBJECT_NUMBER *1.0; = ���� ��Ȯ������ ��.
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// �Է��� ��� �޾ƾ� �ϴ�
		// ���� �ݺ��� �ʿ�

		while (true) {
			System.out.println("�̸��� �Է����ּ���(-1�� ����)");

			String name = scanner.nextLine();

			if (name.equals("-1")) {
				// string�� String�� ���̱� ������
				// �� ������ ==�� �ƴ�
				// equals�޼ҵ�� ���ؾ��Ѵ�.

				System.out.print("������ּż� �����մϴ�");

				break;
			}
			System.out.print("����: ");
			int korean = scanner.nextInt();

			System.out.print("����: ");
			int english = scanner.nextInt();

			System.out.print("����: ");
			int math = scanner.nextInt();

			scanner.nextLine();

			int sum = korean + english + math;

			System.out.printf("�̸�: %s ����: %d ����: %d ����: %d ����: %d ���: %.2f\n", name, korean, english, math, sum,
					sum /SUBJECT_TO_DOUBLE);
			
			

		//	System.out.printf("�̸�: %s ����: %d ����: %d ����: %d ����: %d ���: %.2f\n"
		//	, name, korean, english, math, sum,
		//			sum / 3.0);
			
//���� �ڵ忡��3.0�� ������ ���� �̴�
			//��� ���Դ��� �Ѵ��� �˾ƺ��⵵ �����
			//���� ������� �þ��
			//�������� ã�ٰ� ��μ� �ǾƷ��� �ͼ�
			//3.0�� �ٽ� 4.0�̳� ������ ���ڷ� �ٲ������
			
			//magic number�� �ؼ��ϴ� �����
			//��� Ȥ��  ������ ���� ��Ʈ���ؾ��� 
		}
		scanner.close();
	}
}

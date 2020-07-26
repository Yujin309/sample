package day2;
//ex20�� �����ؼ�

//������ ������ 0~100���� ���� ����� 

import java.util.Scanner;

public class Ex21 {
	final static int SUBJECT_NUMBER = 3;
	final static double SUBJECT_TO_DOUBLE = SUBJECT_NUMBER * 1.0;

	final static int MINIMUM_SCORE = 0;
	final static int MAXIMUM_SCORE = 100;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("�̸��� �Է����ּ���(-1�� ����)");

			String name = scanner.nextLine();

			if (name.equals("-1")) {
				System.out.print("������ּż� �����մϴ�");

				break;
			}

			System.out.print("����: ");
			int korean = scanner.nextInt();
			while (korean < MINIMUM_SCORE || korean > MAXIMUM_SCORE) {
				System.out.println("�߸��Է��ϼ̽��ϴ�.");
				System.out.println("����:");
				korean = scanner.nextInt();
			}

			System.out.print("����: ");
			int english = scanner.nextInt();
			while (korean < MINIMUM_SCORE || english > MAXIMUM_SCORE) {
				System.out.println("�߸��Է��ϼ̽��ϴ�.");
				System.out.println("����:");
				english = scanner.nextInt();
			}
			System.out.print("����: ");
			int math = scanner.nextInt();
			while (korean < MINIMUM_SCORE || math > MAXIMUM_SCORE) {
				System.out.println("�߸��Է��ϼ̽��ϴ�.");
				System.out.println("����:");
				math = scanner.nextInt();
			}
			scanner.nextLine();

			int sum = korean + english + math;

			System.out.printf("�̸�: %s ����: %d ����: %d ����: %d ����: %d ���: %.2f\n", name, korean, english, math, sum,
					sum / SUBJECT_TO_DOUBLE);


			System.out.printf("�̸�: %s ����: %d ����: %d ����: %d ����: %d ���: %.2f\n", name, korean, english, math, sum,
					sum /SUBJECT_TO_DOUBLE);

		}
		scanner.close();

	}
}

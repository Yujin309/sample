package day2;
//����ڷκ��� �Է��� �޾Ƽ�
//�� ���ڰ� Ȧ���� Ȧ����� ����ϴ� ���α׷� �����
//(¦����, �ƹ��͵� ��¾���)
// ����, % 2 ! = 1 
// ¦���� ����,,, ==�� �ϸ� Ȧ��

import java.util.Scanner;
public class Ex02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("���ڸ� �Է����ּ���:");
		int number =scanner.nextInt();
	if(number % 2 == 1) {
		System.out.println("Ȧ���Դϴ�.");
	}
		scanner.close();
	}

}

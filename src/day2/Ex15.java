package day2;
//����ڷ� ���� �Է��� �޾Ƽ�
// factorial�� ���ϴ� ���α׷� �ۼ�
// (=1���� �� �������� ��)
//���ڸ� �ʹ� ũ�� ������ �����߻�.

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		 
		
		System.out.print("���ڸ� �Է����ּ���:");
		Scanner scanner = new Scanner(System.in);
		
		int number =scanner.nextInt();
		int factorial = 1;
	
		for(int i = 1; i<= number; i ++) {
			factorial *= i;
		}
		
		
		System.out.println(factorial);
		
		scanner.close();
	}
}


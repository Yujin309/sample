package day2;
//����ڷκ��� ������ �Է¹���
//Ȧ������ ¦������ ����ϴ� ���α׷� 

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		System.out.print("���ڸ� �Է����ּ���:");
		int number =scanner.nextInt();
		if(number % 2 == 1) {
			System.out.println("Ȧ���Դϴ�.");
		}else {
			System.out.println("¦���Դϴ�.");
		}
		scanner.close();	
	}
}

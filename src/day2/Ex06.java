package day2;
//�л����� ���� ���� �Է¹޾�
//90~100= A
//80~89 = B
//70~79 = C
//60~69 = D
//~60= F �� ������ ���α׷� 

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		System.out.print("������ �Է����ּ���:");
		int score =scanner.nextInt();
		if(score >= 90 && score <= 100) {
			System.out.println("A");
		}else if(score >= 80 && score <= 89) {
			System.out.println("B");
		}else if(score >= 70 && score <= 79) {
			System.out.println("C");
		}else if(score >= 60 && score <= 69) {
			System.out.println("D");
		}else if(score >= 0 && score <= 59) {
		System.out.println("F");
		}else {
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
		}
		scanner.close();
	}
}

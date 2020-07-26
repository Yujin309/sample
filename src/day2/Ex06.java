package day2;
//학생으로 부터 점수 입력받아
//90~100= A
//80~89 = B
//70~79 = C
//60~69 = D
//~60= F 가 나오는 프로그램 

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		System.out.print("점수를 입력해주세요:");
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
			System.out.println("잘못입력하셨습니다.");
		}
		scanner.close();
	}
}


package day2;
//사용자로부터 숫자을 입력받음
//홀수인지 짝수인지 출력하는 프로그램 

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		System.out.print("숫자를 입력해주세요:");
		int number =scanner.nextInt();
		if(number % 2 == 1) {
			System.out.println("홀수입니다.");
		}else {
			System.out.println("짝수입니다.");
		}
		scanner.close();	
	}
}

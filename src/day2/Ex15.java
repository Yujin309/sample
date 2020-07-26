package day2;
//사용자로 부터 입력을 받아서
// factorial을 구하는 프로그램 작성
// (=1부터 그 수까지의 곱)
//숫자를 너무 크게 넣으면 오류발생.

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		 
		
		System.out.print("숫자를 입력해주세요:");
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


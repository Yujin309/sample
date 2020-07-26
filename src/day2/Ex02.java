package day2;
//사용자로부터 입력을 받아서
//그 숫자가 홀수면 홀수라고 출력하는 프로그램 만들기
//(짝수면, 아무것도 출력안함)
// 변수, % 2 ! = 1 
// 짝수가 나옴,,, ==로 하면 홀수

import java.util.Scanner;
public class Ex02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요:");
		int number =scanner.nextInt();
	if(number % 2 == 1) {
		System.out.println("홀수입니다.");
	}
		scanner.close();
	}

}

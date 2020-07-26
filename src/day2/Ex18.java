package day2;
//반복문- while 문

// for 반복문에서 i에게 몇부터 몇까지 진행하면서
//반복하라고 말을 함

//while 은 조건식을 통해 
//true 가 나오면 반복. false는 종료 되는 구조

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		
		int count = 0;
	
		while (count > 5) {
			System.out.println("count:" + count);
		}
//무한루프를 만들어서 메뉴를 만들기
//3가지 방법 
//1- int 변수 하나 만들어서 그 변수가 변하지 않고 영원히 참이 나오는 조건식
// int count = 0; while(count<5)

//2- 절대적으로 true가 나올수 밖에 없는 조건식 
//while(0<1), while(0 == 0)

//3. true
//while(true) 

		Scanner scanner = new Scanner(System.in);

		while (true) {

			System.out.println("비트 학생관리 프로그램");
			System.out.println("1.입력 2.출력 3.종료");
			System.out.print(">");

			int choice = scanner.nextInt();
			if (choice == 1) {
				// 새로 학생의 정보를 입력하는 코드

			} else if (choice == 2) {
				// 입력된 학생의 정보를 출력하는 코드
			} else if (choice == 3) {
				System.out.println("사용해주셔서 감사합니다");
				break;
			} else {
				System.out.println("잘못입력하셨습니다.");
			}
		}
		scanner.close();

	}
}

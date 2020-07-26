package day2;
//사용자로 부터 이름 국어 영어 수학 점수를 입력받아

//이름 점수 총점 평균을 출력하는 프로그램 만들기
//단 이름에 "-1"이 들어올때까지
//계속 입력 받기 

import java.util.Scanner;

public class Ex20 {
//상수는 
//final이라는 키워드 (예약어)를 붙여서 만들어줌
//하지만 static매소드인 main 메소드가 있기때문에
//static까지 붙여줌
	
final static int SUBJECT_NUMBER= 3;
//전부다 대문자- 상수

final static double SUBJECT_TO_DOUBLE = SUBJECT_NUMBER *1.0;
//SUBJECT_NUMBER *1.0; = 뜻이 명확해지는 것.
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 입력을 계속 받아야 하니
		// 무한 반복문 필요

		while (true) {
			System.out.println("이름을 입력해주세요(-1은 종료)");

			String name = scanner.nextLine();

			if (name.equals("-1")) {
				// string과 String의 비교이기 때문에
				// 비교 연산자 ==이 아닌
				// equals메소드로 비교해야한다.

				System.out.print("사용해주셔서 감사합니다");

				break;
			}
			System.out.print("국어: ");
			int korean = scanner.nextInt();

			System.out.print("영어: ");
			int english = scanner.nextInt();

			System.out.print("수학: ");
			int math = scanner.nextInt();

			scanner.nextLine();

			int sum = korean + english + math;

			System.out.printf("이름: %s 국어: %d 영어: %d 수학: %d 총점: %d 평균: %.2f\n", name, korean, english, math, sum,
					sum /SUBJECT_TO_DOUBLE);
			
			

		//	System.out.printf("이름: %s 국어: %d 영어: %d 수학: %d 총점: %d 평균: %.2f\n"
		//	, name, korean, english, math, sum,
		//			sum / 3.0);
			
//위의 코드에서3.0은 마술의 숫자 이다
			//어디서 나왔는지 한눈에 알아보기도 힘들고
			//만약 과목수가 늘어나면
			//여기저기 찾다가 비로소 맨아래에 와서
			//3.0을 다시 4.0이나 과목의 숫자로 바꿔줘야함
			
			//magic number를 해소하는 방법은
			//상수 혹은  변수로 만들어서 컨트롤해야함 
		}
		scanner.close();
	}
}

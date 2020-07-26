package day2;
//ex20을 대조해서

//국영수 점수도 0~100까지 들어가게 만들기 

import java.util.Scanner;

public class Ex21 {
	final static int SUBJECT_NUMBER = 3;
	final static double SUBJECT_TO_DOUBLE = SUBJECT_NUMBER * 1.0;

	final static int MINIMUM_SCORE = 0;
	final static int MAXIMUM_SCORE = 100;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("이름을 입력해주세요(-1은 종료)");

			String name = scanner.nextLine();

			if (name.equals("-1")) {
				System.out.print("사용해주셔서 감사합니다");

				break;
			}

			System.out.print("국어: ");
			int korean = scanner.nextInt();
			while (korean < MINIMUM_SCORE || korean > MAXIMUM_SCORE) {
				System.out.println("잘못입력하셨습니다.");
				System.out.println("국어:");
				korean = scanner.nextInt();
			}

			System.out.print("영어: ");
			int english = scanner.nextInt();
			while (korean < MINIMUM_SCORE || english > MAXIMUM_SCORE) {
				System.out.println("잘못입력하셨습니다.");
				System.out.println("영어:");
				english = scanner.nextInt();
			}
			System.out.print("수학: ");
			int math = scanner.nextInt();
			while (korean < MINIMUM_SCORE || math > MAXIMUM_SCORE) {
				System.out.println("잘못입력하셨습니다.");
				System.out.println("수학:");
				math = scanner.nextInt();
			}
			scanner.nextLine();

			int sum = korean + english + math;

			System.out.printf("이름: %s 국어: %d 영어: %d 수학: %d 총점: %d 평균: %.2f\n", name, korean, english, math, sum,
					sum / SUBJECT_TO_DOUBLE);


			System.out.printf("이름: %s 국어: %d 영어: %d 수학: %d 총점: %d 평균: %.2f\n", name, korean, english, math, sum,
					sum /SUBJECT_TO_DOUBLE);

		}
		scanner.close();

	}
}

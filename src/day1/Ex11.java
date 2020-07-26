package day1;
//예제
//학생의 이름, 나이
//국어점수, 영어점수, 수학점수
//를 받아서
//이름은 5자리 스트링
//나이는 3자리 오른쪽정렬
//국어점수 영어점수 수학점수는 3자리 오른쪽정렬하고 0으로 빈칸 채우기
//총점은 3자리 왼쪽정렬
//평균은 소숫점 2자리까지 출력하는 프로그램 작성하기 

import java.util.Scanner;
public class Ex11 {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		//이름, 나이, 국어, 영어 , 수학점수
		System.out.print("이름: ");
		String name= scanner.nextLine();
		System.out.print("나이: ");
		int age = scanner.nextInt();
		System.out.print("국어: ");
		int korean = scanner.nextInt();
		System.out.print("영어: ");
		int english = scanner.nextInt();
		System.out.print("수학: ");
		int math = scanner.nextInt();
		
		//총점을 계산해보자
		int sum= korean + english + math;
		
		//평균을 계산해보자
		double average = sum / 3.0;
		
		System.out.printf("이름:%5s,나이:%3d,국어:%03d "
		+" 영어: %03d 수학:%03d 총점:%-3d 평균: %.2f",
				name,age, korean,english,math,sum,average);
		
		scanner.close();
	    
	}
}

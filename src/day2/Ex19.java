package day2;
//학생으로부터 점수를 입력받아서
// A.B.C.D.F.를 출력하는 프로그램
//단 학생이 잘못된 점수 (-122.22343)를 입력하면
//올바른 점수를 입력할때까지 계속 새로운 입력을 받음

import java.util.Scanner;

public class Ex19 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("점수를 입력해주세요");
	int score =scanner.nextInt();
	
	if(score < 0 || score > 100) {
		System.out.println("잘못입력하셨습니다.");
		System.out.println("점수를 입력해주세요:");
		score= scanner.nextInt();
	}
	
	if(score >= 90) { 
		System.out.println("A");
		
	}else if(score >= 80){
		System.out.println("B");
		
    }else if(score >= 70){
		System.out.println("C");
		
    }else if(score >= 60){
		System.out.println("D");
		
    }else {
		System.out.println("F");
	}
    scanner.close();
}
}

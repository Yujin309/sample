package day2;
//BMI 계산하기 
//BMI 공식 = 몸무게 / 키 / 키
//키는 m단위이다
//170= 1.7 
//BMI 계산 
// 0~18.4 :저체중
//18.5~22.9 :정상체중
//23~24.9: 과체중
//25~29.5: 비만
//30~ 고도비만
//사용자가 키와 몸무게를 Double로 입력= 출력하는 프로그램 

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		System.out.print("몸무게를 입력해주세요:");
	double weight = scanner.nextDouble();
		System.out.print("키를 입력하세요:");
		double height = scanner.nextDouble();
		
		double bmi = weight / height / height;
		
		if(bmi >= 30 ) {
			System.out.println("고도비만");
		}else if(bmi  >= 25 ) {
			System.out.println("비만");
		}else if(bmi  >= 23) {
			System.out.println("과체중");
		}else if(bmi  >= 18.5 ) {
			System.out.println("정상체중");
		}else if(bmi  >= 0 ) {
		System.out.println("저체중");
		}else {
			System.out.println("잘못입력하셨습니다.");
		
		scanner.close();
	}
	}
}


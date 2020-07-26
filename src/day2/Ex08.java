package day2;
//조건문 - 다중if문
//만약 하나의 조건을 통과해야 다음 테스트를 해야하는 
//조건문이라면 
//if문 안에 if문이 들어갈수있다.


import java.util.Scanner;
public class Ex08 {
	
public static void main(String[] args) {
	Scanner scanner= new Scanner(System.in);
	System.out.println("나이를 입력해주세요:");
	int age = scanner.nextInt();
	if (age >= 18) {
		//18세 이상이므로 성별을 입력 받음
		
	System.out.println("성별을 입력하세요.1이면 남자 2면 여자");
	int sex = scanner.nextInt();
	if(sex ==1) {
		//18세  + 이므로 신체 등급 입력 받음

		System.out.println("신체등급을 입력해주세요:");
		int category = scanner.nextInt();
		
		if(category>= 1 && category <= 3) {
			System.out.println("현역");
			
		}else if(category ==4) {
			System.out.println("공익");
			
		}else {
			System.out.println("면제");
			
		}
		
	
	}else if(sex ==2) {
		System.out.println("여성이므로 병역의 의무가 없습니다");
	}else {
		System.out.println("잘못입력하셨습니다.");
		
	}
	}else {
		//18세미만= 미성년자이기에 해당 없다고 출력
		System.out.println("미성년자라서 아직 병역 의무가 없습니다.");
		}
	
	
	scanner.close();
}
}

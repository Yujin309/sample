package day2;
//검정고시 성적 결과 프로그램
//사용자로부터 국 영 수 점수를 입력받아서
// 평균 70미만이거나 ->총점이 210 미만
//점수가 하나라도 60미만이면 탈락
//그외에는 합격을 출력하는 프로그램 

import java.util.Scanner;
public class Ex12 {

   public static void main(String []args) {
	   Scanner scanner = new Scanner(System.in); 
	
		System.out.print("국어: ");
		int korean = scanner.nextInt();
		
		
		System.out.print("영어: ");
		int english = scanner.nextInt();
		
		
		System.out.print("수학: ");
		int math = scanner.nextInt();
		
		int sum= korean + english + math;
		//변수 
		if ((sum < 210)|| korean <60 || english < 60 || math < 60) {
			System.out.println("탈락");
			
		} else { 	
	System.out.println("합격");
		}
	

    scanner.close();
   }}
			
   


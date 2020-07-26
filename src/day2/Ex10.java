package day2;
//의도적으로 break 생략해서
//특정 입력값들이 똑같은 결과가 나올때
// switch를 사용하는 코드

//사용자가 월을 입력하면
//해당 월이 몇일까지 있는지 보여주는 프로그램 작성

import java.util.Scanner;

public class Ex10 {
public static void main(String[] args) {
	Scanner scanner= new Scanner(System.in);
	System.out.println("월을 입력해주세요:");
	int month= scanner.nextInt();
	switch(month) {
	case 1:
	case 3:
	case 5:
	case 7:
	case 8:
	case 10:
	case 12:
		System.out.println("31일까지 입니다.");
		break;
	case 4:
	case 6:
	case 9:
	case 11:
	
			System.out.println("30일까지 입니다.");
	break;
	
	case 2:
		System.out.println("28일까지 입니다.");
		
   default:
	System.out.println("잘못입력하셨습니다.");
	break;
	
	}

	scanner.close();

}}

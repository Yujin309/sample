package day01;

import java.util.Scanner;

public class day_0722_2 {
//구구단 만들기 
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		//값을 받는 것 
		int input = scanner.nextInt();
		//개행 시키는 것 
		
		day_0722_2 GuguDan = new day_0722_2();
		GuguDan.gugudan(input);
		//객체명.구구단 
    //input을 스캐너로 쓰겠다는 건가?  사용자가 입력한 값을 쓰겠다는 것 이다.  input을 한 이유?
		
	}

	private void gugudan(int i) {
		for (int j = 1; j < 10; j++) {
			System.out.println(i + "X" + j + "=" + (i * j));
		}

	}

}

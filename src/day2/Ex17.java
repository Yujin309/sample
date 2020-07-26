package day2;
//1~100까지 소수를 구하는 프로그램
//소수?= 1과 자기자신만 약수인 숫자
//약수의 개수 2개

//어떤 숫자의 가장 큰 약수는 
//자기 자신이다. 
//이 2가지 조건을 통해서 1~100까지의 소수를 구하는 프로그램

public class Ex17 {
	
	
public static void main(String[] args) {
	
	for(int i =1; i <= 100; i++) {
		//여기서 i는 소수인지 아닌지 검사할 숫자
		
		
		int count= 0;
		//count는 약수의 갯수를 저장할 변수
		
        //j for loop은 어떤숫자가 i의 약수인지 아닌지 체크
		//그러면 j는 어디서부터 어디까지 반복되어야할까?

		
		for(int j=1; j <= i; j++) { 
			if(i % j == 0) {
				count++; 
				
			}
		}
		
		if(count ==2) {
			System.out.println(i+"는 소수입니다.");
		

	}
}
	
}
}


package day2;
//1~100까지 합을 구하는 프로그램 작성


public class Ex14 {
	
	public static void main(String[] args) {
	
		//합을 저장할 int 변수 하나
		int sum = 0;
		
		for(int i= 1; i <=100; i++) {
		sum= sum +i;
		//현재값에 산술연산하고 그값을 원래 변수에 다시 넣어라
		//줄여 쓸수 있다 
		//sum += i;
		//+=,-=,*=,/= 4개 다 가능 
			
		}
	System.out.println("1부터 100까지의 합:"+ sum);
	}}

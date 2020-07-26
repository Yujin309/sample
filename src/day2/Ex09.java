package day2;
//조건문 = switch
//변수 하나의 값들을
//case에 넣어서
//조건문 실행
public class Ex09 {

	public static void main(String[] args ) {
		int number= 2;
		switch (number) {
		case 1:
			System.out.println("1입니다.");
		
		
		case 2:
			System.out.println("2입니다.");
			
		case 3:
			System.out.println("3입니다.");
			
			default:
				System.out.println("그외입니다");
				break;
			
		}
	}
}

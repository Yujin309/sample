package day2;
//조건문 - if else if else 구조
// yes, no 구조가 아닌 여러개의 
//가능성중 하나를 실행해야 하는 경우가 많다.
//그럴때에는 if- else if - ...-else 가 나오는 구조를 
//더 많이 사용하게 됨
public class Ex05 {
public static void main(String[] args) {
	int age= 15;
	if(age >= 18) {
		System.out.println("성년입니다.");
	}else if(age >= 12) {
		System.out.println("청소년입니다.");
	}else {
		System.out.println("어린이입니다.");
	}
}
}

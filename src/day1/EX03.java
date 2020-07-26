package day1;
//연산자
//연산자란
//2개의 변수를 연산해서
//새로운 값을 만들어내는 것을
//연산자라고 한다.
//연산자에는
//산술, 논리, 비교, 증감, 비트 5가지 연산자가 있다.
//산술 연산자
//+ - * / %
//%란
//2숫자의 나머지를 구하는 연산자 이다.
//예시 : 5%3->5/3의 나머지를 구해준다.

public class EX03 {
public static void main(String[]args) {
	//사칙연산 직접해보기
	int number =10;
	int number2= 3;
	System.out.println(number + number2);
	
	System.out.println(number - number2);
	
	System.out.println(number * number2);
	
	System.out.println(number / number2);
	
	System.out.println(number % number2);
	
	//서로 같은 데이터 타입이면 
	//해당 데이터타입이 결과값으로 나오지만
	//서로 다른 데이터 타입이면?
	//자동으로 더 큰 데이터 타입으로 바뀐다
	//정수형<실수형 
	double myDouble = 3.0;
	System.out.println(number + myDouble);
	System.out.println(number - myDouble);
	System.out.println(number * myDouble);
	System.out.println(number / myDouble);
	System.out.println(number % myDouble);
}
}

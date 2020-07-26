package day1;
//증감 연산자
//증감 연산자는
//변수의 값을 1씩 변화시킨다.
//++,--
//하지만 증감연산자가 변수의 앞에 붙나
//뒤에 붙냐에 따라서
//값이 변하는 시점이 달라지게 된다.
public class Ex04 {
public static void main(String[] args) {
	int number = 10;
	System.out.println(number++);
	//++가 뒤에 붙어있으면
	//다른 명령어를 모두 실행시키고 나서
	//변수의 값을 1 늘린다.
	//후위증가연산자라고 한다.
	System.out.println(number);
	
	System.out.println(++number);
	//++가 앞에 붙어있으면
	//변수의 값을 1 늘리고 나서
	//다른 명령어를  실행시킨다.
	System.out.println(number);
}
}

package day1;

//논리 연산자
//논리 연산자는 
//2개의 boolean값에 대한 연산이다.
//AND ( && ):2개 다 true일때 true
//OR (||) : 2중 하나만 true 여도 true
//부정 (!) : true는 false, false는 true로 바꿔준다.
public class Ex06 {
	
	public static void main(String[] args) {
		boolean myBoolean1 = true;
		boolean myBoolean2 = false;
		System.out.println(myBoolean1 && myBoolean2);
		System.out.println(myBoolean1 || myBoolean2);
		System.out.println(!myBoolean1);

//논리 연산자는 다른 비교연산자의 결과값으로 연산해줄수 있다.
		// Java에서는
		// 0< number <5 가 안된다
		// 자바로 표현하려면
		// number는 0보다 크고
		// 5보다 작다
		// 즉 AND연산자를 사용해 줘야한다.
		int number = 5;
		System.out.println(number > 0 && number < 5);
	}
}

package day2;
//반복문 -for반복 ㅣloop
//몇번을 반복할지 명시하게 됨
//생김새
//for(int i =0; i < 5; i++){
//반복할 내용
//}
public class Ex13 {

public static void main(String[] args) {
	for(int i= 0; i <5; i++) {
		//i++ : +1
//변수에는 scope(유효범위)라는 것이 있다,
		//변수를 선언하면 해당 변수는, 
		//그 변수가 선언된 {}와 거기속한 {}안에서만 사용가능
		//{}를 벗어나면 사용불가.

		System.out.println(i+"회째 반복");

		//i는 위에 for loop가 끝난 순간
		//소멸되었으므로
		//아래의 System.out.println(i)는 에러
		//System.out.println(i);
		
		
		//또한 변수 소멸전이면 , 똑같은 이름의 변수는 
		//만들수 없다.
	}
}
	
}

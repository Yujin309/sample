package day1;
//비교 연산자
//비교해서 true/false(boolean)값이 출력된다.
//<,<=,>,>=,==,!=
public class EX05 {
public static void main(String[] arg) {
	int number1 = 10;
	int number2 = 20;
		System.out.println(number1 < number2);
	    System.out.println(number1 > number2);
	    number2= 10;
	    System.out.println(number1 <number2);
	    System.out.println(number1<= number2);
	    
	    //==는 두 값이 같은지 비교한다
	    //!=는 두값이 다른지 비교한다.
	    System.out.println(number1 == number2);
	    System.out.println(number1 != number2);

	    //String은 여러 문자를 가지고 있는
	    //문자열 클래스로써
	    //우리가 원하는 글자들을 넣어 줄수 있다.
	    String myString = "abc def";
	    String myString2 = new String("abc def");
	    
	    //클래스를 비교연산자로 비교하면
	    //클래스 변수의 값이 아닌
	    //주소 값을 비교하게 된다.
	    //따라서 클래스변수를 비교할 때에는
	    //클래스에 선언되어있는 equals()매소드를 통해 비교해야한다.
	   
	    System.out.println(myString == myString2);
	    System.out.println(myString.equals(myString2));

}
}

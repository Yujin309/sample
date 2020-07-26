package day1;
//printf는
//%문자를 써서
//우리가 원하는 형식대로 출력하게 된다
public class Ex09 {
public static void main(String[] args) {
	int number = 10;
	//1. 10진법 숫자
	//A) 10진법 숫자를 그대로 출력해라
	System.out.printf("1-A) %d\n", number);
	// \n은 엔터키 (다음줄) 을 뜻한다.
	//B) 10진법 숫자를 5자리로 출력해라
	System.out.printf("1-B) %5d\n", number);
	//C) 10진법 숫자를 5자리고 맞추고 왼쪽에 빈공간을 0으로 채워라
	System.out.printf("1-C) %05d\n", number);
	//D) 10진법 숫자를 5자리로 맞추고 왼쪽정렬하기
	System.out.printf("1-D) %-5d\n", number);
	
	number = 122;
	//2. 16진법 표기하기
	//A) 16진법 숫자를 그대로 알파벳은 소문자로 표시해라
	System.out.printf("2-A) %x\n", number);
	//B) 16진법 숫자를 표시하고 알파벳은 대문자로 표시해라
	System.out.printf("2-B) %X\n",number);
	//C) 16진법 숫자를 5자리로 표기하고 알파벳은 대문자로 표시해라
	System.out.printf("2-C) %5X\n",number);
	//D) 16진법 숫자를 8자리로 표기하고 알파벳은 대문자로
	//왼쪽의 빈자리는 0으로 채워서 표기해라 
	System.out.printf("2-D) %08X\n",number);
	
	//char 은 문자 1개를 표시한다.
	//ascii 테이블 값에 대응 되는 문자를 표시한다.
	char myCharacter = (char)'A'+32;
	System.out.println(myCharacter);
	
	//3.캐릭터 
	//A) 글자 그대로 출력해라
	System.out.printf("3-A) %c\n", myCharacter);
	//B) 글자를 대문자로만 출력해라
	System.out.printf("3-B) %C\n", myCharacter);
	//C) 글자를 대문자로 5자리 맞춰서 출력해라
	System.out.printf("3-C,%5C\n", myCharacter);
	
	//4. 실수
	double myDouble = 3.141592;
	//A) 실수를 그대로 출력해라
	System.out.printf("4-A, %f\n", myDouble);
	//B) 소숫점 3자리까지만 출력해라
	System.out.printf("4-B, %3f\n",myDouble);
	//C) 실수를 5자리로 맞추고 소숫점 3자리까지만 출력해라
	System.out.printf("4-C, %8.3f\n",myDouble);
	// 위는 3.142가 나옴으로써 5자리가 나온다.
	//만약 표시되는 내용이 내가 지정한 자릿수보다 크면
	//지정한 자릿수는 무시되고 표시되는 내용이 그대로 출력된다. 
	
	//5.스트링(문자열)표시학;
	String myString = "hello";
	//A. string 을 그대로 표시해라
	System.out.printf("5-A, %s\n",myString);
	//B. String 을 모두 대문자로 표시해라
	System.out.printf("5-B, %S\n", myString);
	//C. String 을 10자리로 맞춰서 표시해라
	System.out.printf("5-C, %10s\n",myString);
	//d. String 을 10자리로 맞추고 왼쪽장렬
	System.out.printf("5-D, %-10s\n",myString);
	
	//이 printf에서
	// %문자와 값들은 여러개를 넣어줄수있다
	//단, %문자의 갯수와 종류가 순서대로 맞아야한다
	System.out.printf("이름: %5s, 나이: %03d세, 키: %.2f\n",
	"조재영",15,170.0);
}
}

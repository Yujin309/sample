package day1;

//입력
//자바에서의 입력은
//Scaner 클래스 변수를 만들어서
// 그변수의 메소드를 실행시켜서 입력을 받음.
// Scanner 클래스는 외부 클래스 이기 때문에
// import 해줘야 한다.
import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		// 클래스 변수는
		// 클래스 이름 변수이름 = new 클래스 이름();
		// 으로 선언, 초기화 해준다,
		Scanner scanner = new Scanner(System.in);

		// 정수를 입력받을때에는
		// scanner.nextInt()로 입력받는다.
		System.out.print("나이를 입력하세요: ");
		int age = scanner.nextInt();

		// 실수를 입력 받을때에는
		// scanner.nextDouble()로 입력 받음
		System.out.print("키를 입력하세요:");
		double height = scanner.nextDouble();

		// nextInt, nextDouble같이
		// 문자가 아닌 숫자를 입력받는 메소드의 경우
		// 버퍼 메모리에서 숫자만 가지고 온다
		// 하지만 우리가 입력을 종료할 때에는
		// enter 키를 입력한다

		// 그럼 여기서 문제
		// enter키는 문자일까 숫자일까?
		// 정답은 문자이다.
		// 따라서 nextInt같은 숫자를 입력받은 메소드는
		// 15엔터를 누르면
		// 버퍼메모리에서 15는 가지고 오고 엔터는 남겨둔다.

		// 이렇게 엔터가 남겨진 상황에서
		// 문자열을 읽는 nextLine이 오게 되면?
		// 컴퓨터는 사용자가 아무런 입력없이 엔터키로
		// 입력을 종료해버렸다고 착각해버린다.

		// 대표적인 버그의 예 이다.

		// 그러면 숫자를 입력하고 나서
		// 문자열을 입력하려면

		// 어떻게 해야할까?
		// 버퍼메모리를 한번 비워주면 된다

		// 비워주는 방법은 간단하다.
		// scanner.nextLine()을 단독 실행시켜준다
		scanner.nextLine();
		// 주의할점은 이클립스의 자동완성 때문에
		// scanner.hasNextLine()으로 완성되는데
		// 이것을 nextLine으로 바뀌줘야 한다.

		// 스트링을 입력 받을때에는
		// scanner.nextLine()으로 입력
		System.out.print("이름을 입력하세요:");
		String name = scanner.nextLine();

		System.out.printf("이름: %s, 나이: %d, 키: %f\n", 
				name, age, height);

		// 스캐너는 버퍼메모리라는 곳을
		// 직접 참조하기때문에
		// 사용이 끝나면 닫아줘야함
		// 안그러면 메모리 누수 발생
		scanner.close();
	}
}

package star;
//1번 문제.
import java.util.Scanner;

public class ex01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("출력할 줄 수를 입력하세요:");

		int lineNumber = scanner.nextInt();

		// 별이 첫번째 줄에 1개 두번째는 2개
		// i번째 는 i가 나오는 2중 for loop만들기
		// i 는 세로줄 수를 뜻함

		for (int i = 1; i <= lineNumber; i++) {

			// string 변수에 +하면

			String star = "";
			// star 를 여기에 선언과 초기화를 해주면
			// i for문이 반복될때마다 새롭게 선언과 초기화됨
			// 아무것도 없는 string문이 됨

			// j for loop은 star에 *을 추가해준다.

			// 공백은 stars += "";으로 추가한다.

			for (int j = 1; j <= i; j++) {
				star += "*";
				// i가 1일때 j는 1~1 .
			}
			System.out.println(star);
		}

	}

}

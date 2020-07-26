
package HOME;
//1번 문제.
import java.util.Scanner;

public class star2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("출력할 줄 수를 입력하세요:");

		int lineNumber = scanner.nextInt();


		for (int i = 0; i <= 5; i++) {



			String star = "";
		

			for (int j = 5; j >= i; j--) {
				
				star += "*";
				// i가 1일때 j는 1~1 .
			}
			System.out.println(star);
		}

	}

}


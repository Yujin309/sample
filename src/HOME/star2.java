
package HOME;
//1�� ����.
import java.util.Scanner;

public class star2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("����� �� ���� �Է��ϼ���:");

		int lineNumber = scanner.nextInt();


		for (int i = 0; i <= 5; i++) {



			String star = "";
		

			for (int j = 5; j >= i; j--) {
				
				star += "*";
				// i�� 1�϶� j�� 1~1 .
			}
			System.out.println(star);
		}

	}

}


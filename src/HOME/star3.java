package HOME;

import java.util.Scanner;




public class star3 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("����� �� ���� �Է��ϼ���:");

		int lineNumber = scanner.nextInt();


		for (int i = 0; i <= 10; i++) {



			String star = "";
		

			for (int j = 1; j > i; j++) {
				
				star += "*";
			
			}
			System.out.println(star);
		}

	}

}



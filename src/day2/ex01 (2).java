package star;
//1�� ����.
import java.util.Scanner;

public class ex01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("����� �� ���� �Է��ϼ���:");

		int lineNumber = scanner.nextInt();

		// ���� ù��° �ٿ� 1�� �ι�°�� 2��
		// i��° �� i�� ������ 2�� for loop�����
		// i �� ������ ���� ����

		for (int i = 1; i <= lineNumber; i++) {

			// string ������ +�ϸ�

			String star = "";
			// star �� ���⿡ ����� �ʱ�ȭ�� ���ָ�
			// i for���� �ݺ��ɶ����� ���Ӱ� ����� �ʱ�ȭ��
			// �ƹ��͵� ���� string���� ��

			// j for loop�� star�� *�� �߰����ش�.

			// ������ stars += "";���� �߰��Ѵ�.

			for (int j = 1; j <= i; j++) {
				star += "*";
				// i�� 1�϶� j�� 1~1 .
			}
			System.out.println(star);
		}

	}

}

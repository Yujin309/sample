package day01;

import java.util.Scanner;

public class day_0722_2 {
//������ ����� 
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		//���� �޴� �� 
		int input = scanner.nextInt();
		//���� ��Ű�� �� 
		
		day_0722_2 GuguDan = new day_0722_2();
		GuguDan.gugudan(input);
		//��ü��.������ 
    //input�� ��ĳ�ʷ� ���ڴٴ� �ǰ�?  ����ڰ� �Է��� ���� ���ڴٴ� �� �̴�.  input�� �� ����?
		
	}

	private void gugudan(int i) {
		for (int j = 1; j < 10; j++) {
			System.out.println(i + "X" + j + "=" + (i * j));
		}

	}

}

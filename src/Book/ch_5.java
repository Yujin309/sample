package Book;

import java.util.Scanner;

public class ch_5 {

	public static void main(String[] args) {
		String[] iArrName = { "����", "ö��", "����", "����" };
		int[] iArr = new int[5];
		int totalHeight = 0;
		int maxH = 0;
		int maxHIndex = 0;
		int minH = 0;
		int minHIndex = 0;
//ó������ 0���� �ʱⰪ��  �ش�. 
		
		Scanner scanner = new Scanner(System.in);
//Scanner ���� �Է� ������ ���°�. ����Ʈ ������ �д´�. 
		
		for (int i = 0; i < iArr.length; i++) {
			//�迭�� ũ�Ⱑ ���´�
			// iArr ��ŭ ����.
			System.out.print(iArrName[i] + "Ű�� �Է��ϼ��� :");
			iArr[i] = scanner.nextInt(); //int �� �Է¹����� 
					//�������� �������� nextLine �޼��带 �̿��ؼ� ���پ� �о ó�� 
			totalHeight = totalHeight + iArr[i];
		}

		
		
		System.out.println("�л��� ��� ������ " + (totalHeight / iArrName.length) + "�Դϴ�");
		for (int i = 0; i < iArr.length; i++) {
			if (iArr[i] > maxH) {
				maxH = iArr[i];
				maxHIndex = i;
			}
		}
		System.out.println("���� ū �л���" + iArrName[maxHIndex] + "�Դϴ�");
		minH = maxH;
		for (int i = 0; i < iArr.length; i++) {
			if (iArr[i] < minH) {
				minH = iArr[i];
				minHIndex = i;
			}
		}
		System.out.println("���� ���� �л���" + iArrName[minHIndex] + "�Դϴ�.");
	}
}

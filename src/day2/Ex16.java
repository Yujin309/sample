package day2;
//���� for loop

//�ٱ��� for loop�� �ѹ� ����ɶ�����
//���� for loop�� ó������ ������ ����

//�ٱ��� for loop��3�� �ݺ��ǰ�
//���� for loop�� 4�� �ݺ��Ǹ�
//���� for loop�� ��Ż �ݺ�Ƚ���� ����ϱ�?

public class Ex16 {

	public static void main(String[] args) {
		
		int totalCount = 0;
		
		for (int i = 0; i < 3; i++) {
			
			// ������ i�� ��⶧���� for loop�ȿ�����
			// i�� �� ������.

		for (int j = 0; j < 4; j++) {
				totalCount++;

		System.out.println("�� �ݺ�Ƚ��: " + totalCount + ",i:" + i + "j:" + j);

		// ����j forloop�� ������ int j�Ҹ�
		// i for loop�ѹ� �ݺ��Ǹ�
		// j�� ���� ����� �ʱ�ȭ�� �Ǳ⶧����
		// 0 1 2 3 �� ����
			}
		}
	}
}
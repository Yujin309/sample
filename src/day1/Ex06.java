package day1;

//�� ������
//�� �����ڴ� 
//2���� boolean���� ���� �����̴�.
//AND ( && ):2�� �� true�϶� true
//OR (||) : 2�� �ϳ��� true ���� true
//���� (!) : true�� false, false�� true�� �ٲ��ش�.
public class Ex06 {
	
	public static void main(String[] args) {
		boolean myBoolean1 = true;
		boolean myBoolean2 = false;
		System.out.println(myBoolean1 && myBoolean2);
		System.out.println(myBoolean1 || myBoolean2);
		System.out.println(!myBoolean1);

//�� �����ڴ� �ٸ� �񱳿������� ��������� �������ټ� �ִ�.
		// Java������
		// 0< number <5 �� �ȵȴ�
		// �ڹٷ� ǥ���Ϸ���
		// number�� 0���� ũ��
		// 5���� �۴�
		// �� AND�����ڸ� ����� ����Ѵ�.
		int number = 5;
		System.out.println(number > 0 && number < 5);
	}
}


package day1;
//�ּ�
//�ּ��̶�
//������ ������ �ɶ� ���ð� �Ǵ� �ٵ��̴�.
//��Ŭ���������� �ʷϻ����� ǥ�õȴ�.
//�Էµ� �ٵ��� ���ð� �Ǳ� ������
//�ѱ��� ���� �� �� �ִ�.
//�ַ� �ڵ忡 ���� ������ ������ �ּ��� ����ϰ� �ȴ�. 

//�ּ��� ���� �ּ��� ������ �ּ��� �ִ�.
//���� �ּ��� �Ǿտ� //�� �ٿ��� �����Ѵ�.
//������ �ּ��� /**/�� ���μ� ����.

public class Ex01 {
public static void main(String[] args) {
	//�߰�ȣ�� ���� ���� ���͸� ġ��
	//��Ŭ������ �˾Ƽ� �ݾ��ش�.
	
	//������?
	//�츮�� ���� ������ �����ؼ�
	//�ش� ������ ���� �ٲ�� �ִ� ������ ���Ѵ�.
	//������
	//������ Ÿ�� ���������� �����ϰ�
	//������ =������ �ʱ�ȭ �Ѵ�.
	
	//������ Ÿ���̶� �ش� ������
	//� ������ ������ ���� �ִ��� �����ִ� ���̴�. 
	
	//������ Ÿ���� ũ��
	//�⺻���� ���������� ������.
	//�⺻���� ���� �ش� ������ �״�� ���� �Ű�
	//�������� �� ���� ������ �ִ� �ּ��� ���� ������ �ִ� ����
	//���Ѵ�.
	
	//�⺻�� 8���� byte short int long float double chat boolean
	//������ 3���� Ŭ������ �������̽��� �迭��
	
	//byte: 8��Ʈ ���� -> 2��8�°��� ���ڰ� �ִ�.
	// -> -2�� 7��~2�� 7�� -1 ����
	//short: 16��Ʈ ���� 
	// -> -2�� 15��~2�� 15�� -1����
	//int: 32��Ʈ ���� 
	// -> -2�� 31��~2�� 31�� -1����
	//long: 64��Ʈ ����
	// -> -2�� 63��~2�� 63�� -1����
	
	
	//�����̶� ���� ���� 
	//���� ����� �ٸ���
	//������ ��������
	//�ſ� ���������� ���´� 
	//�ֳ�! underflow ��� ������ ����� ����
	//underflow �� �ش� ������ 
	//ǥ���Ҽ� �ִ� �ּҰ����� ��������
	// �ִ밪���� ���ϴ� ���� 
	//underflow��� �Ѵ�.
	//�ݴ�� ǥ���Ҽ� �ִ� �ִ밪����
	//�� ū ���� ���� �ּҰ����� ���ϴ� ���� 
	//overflow��� �Ѵ�. 
	
	//��� �÷ο� ���� �߻� ���Ѻ���
	byte number= -128;
	//����Ʈ�� �ּҰ��� -128�� �ִ´�.
	System.out.println(number);
	
	//�ڹٿ����� �ش� ������ ������ Ÿ���� ǥ���Ҽ� ���� 
	//ũ���� ���ڸ� ������ ������ ���.
	//������ ����ȭ(typecasting)�� ���ؼ�
	//"�̰� �������� �������� �ٲ�!"��� �����ټ� �ִ�.
	number = (byte)-129;
	System.out.println(number);

	

	//������? �Ҽ����� �������� �ʴ� ����
	//��Ʈ��? 2���� �ڸ��� 1��
	
	//float :���� �ڸ����� �Ǽ�
	//double : ū �ڸ����� �Ǽ�
	//char: ���� 1��
	//boolean: ��/����
}
}
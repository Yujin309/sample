package day1;
//printf��
//%���ڸ� �Ἥ
//�츮�� ���ϴ� ���Ĵ�� ����ϰ� �ȴ�
public class Ex09 {
public static void main(String[] args) {
	int number = 10;
	//1. 10���� ����
	//A) 10���� ���ڸ� �״�� ����ض�
	System.out.printf("1-A) %d\n", number);
	// \n�� ����Ű (������) �� ���Ѵ�.
	//B) 10���� ���ڸ� 5�ڸ��� ����ض�
	System.out.printf("1-B) %5d\n", number);
	//C) 10���� ���ڸ� 5�ڸ��� ���߰� ���ʿ� ������� 0���� ä����
	System.out.printf("1-C) %05d\n", number);
	//D) 10���� ���ڸ� 5�ڸ��� ���߰� ���������ϱ�
	System.out.printf("1-D) %-5d\n", number);
	
	number = 122;
	//2. 16���� ǥ���ϱ�
	//A) 16���� ���ڸ� �״�� ���ĺ��� �ҹ��ڷ� ǥ���ض�
	System.out.printf("2-A) %x\n", number);
	//B) 16���� ���ڸ� ǥ���ϰ� ���ĺ��� �빮�ڷ� ǥ���ض�
	System.out.printf("2-B) %X\n",number);
	//C) 16���� ���ڸ� 5�ڸ��� ǥ���ϰ� ���ĺ��� �빮�ڷ� ǥ���ض�
	System.out.printf("2-C) %5X\n",number);
	//D) 16���� ���ڸ� 8�ڸ��� ǥ���ϰ� ���ĺ��� �빮�ڷ�
	//������ ���ڸ��� 0���� ä���� ǥ���ض� 
	System.out.printf("2-D) %08X\n",number);
	
	//char �� ���� 1���� ǥ���Ѵ�.
	//ascii ���̺� ���� ���� �Ǵ� ���ڸ� ǥ���Ѵ�.
	char myCharacter = (char)'A'+32;
	System.out.println(myCharacter);
	
	//3.ĳ���� 
	//A) ���� �״�� ����ض�
	System.out.printf("3-A) %c\n", myCharacter);
	//B) ���ڸ� �빮�ڷθ� ����ض�
	System.out.printf("3-B) %C\n", myCharacter);
	//C) ���ڸ� �빮�ڷ� 5�ڸ� ���缭 ����ض�
	System.out.printf("3-C,%5C\n", myCharacter);
	
	//4. �Ǽ�
	double myDouble = 3.141592;
	//A) �Ǽ��� �״�� ����ض�
	System.out.printf("4-A, %f\n", myDouble);
	//B) �Ҽ��� 3�ڸ������� ����ض�
	System.out.printf("4-B, %3f\n",myDouble);
	//C) �Ǽ��� 5�ڸ��� ���߰� �Ҽ��� 3�ڸ������� ����ض�
	System.out.printf("4-C, %8.3f\n",myDouble);
	// ���� 3.142�� �������ν� 5�ڸ��� ���´�.
	//���� ǥ�õǴ� ������ ���� ������ �ڸ������� ũ��
	//������ �ڸ����� ���õǰ� ǥ�õǴ� ������ �״�� ��µȴ�. 
	
	//5.��Ʈ��(���ڿ�)ǥ����;
	String myString = "hello";
	//A. string �� �״�� ǥ���ض�
	System.out.printf("5-A, %s\n",myString);
	//B. String �� ��� �빮�ڷ� ǥ���ض�
	System.out.printf("5-B, %S\n", myString);
	//C. String �� 10�ڸ��� ���缭 ǥ���ض�
	System.out.printf("5-C, %10s\n",myString);
	//d. String �� 10�ڸ��� ���߰� �������
	System.out.printf("5-D, %-10s\n",myString);
	
	//�� printf����
	// %���ڿ� ������ �������� �־��ټ��ִ�
	//��, %������ ������ ������ ������� �¾ƾ��Ѵ�
	System.out.printf("�̸�: %5s, ����: %03d��, Ű: %.2f\n",
	"���翵",15,170.0);
}
}

package day1;
//�� ������
//���ؼ� true/false(boolean)���� ��µȴ�.
//<,<=,>,>=,==,!=
public class EX05 {
public static void main(String[] arg) {
	int number1 = 10;
	int number2 = 20;
		System.out.println(number1 < number2);
	    System.out.println(number1 > number2);
	    number2= 10;
	    System.out.println(number1 <number2);
	    System.out.println(number1<= number2);
	    
	    //==�� �� ���� ������ ���Ѵ�
	    //!=�� �ΰ��� �ٸ��� ���Ѵ�.
	    System.out.println(number1 == number2);
	    System.out.println(number1 != number2);

	    //String�� ���� ���ڸ� ������ �ִ�
	    //���ڿ� Ŭ�����ν�
	    //�츮�� ���ϴ� ���ڵ��� �־� �ټ� �ִ�.
	    String myString = "abc def";
	    String myString2 = new String("abc def");
	    
	    //Ŭ������ �񱳿����ڷ� ���ϸ�
	    //Ŭ���� ������ ���� �ƴ�
	    //�ּ� ���� ���ϰ� �ȴ�.
	    //���� Ŭ���������� ���� ������
	    //Ŭ������ ����Ǿ��ִ� equals()�żҵ带 ���� ���ؾ��Ѵ�.
	   
	    System.out.println(myString == myString2);
	    System.out.println(myString.equals(myString2));

}
}

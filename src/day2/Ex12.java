package day2;
//������� ���� ��� ���α׷�
//����ڷκ��� �� �� �� ������ �Է¹޾Ƽ�
// ��� 70�̸��̰ų� ->������ 210 �̸�
//������ �ϳ��� 60�̸��̸� Ż��
//�׿ܿ��� �հ��� ����ϴ� ���α׷� 

import java.util.Scanner;
public class Ex12 {

   public static void main(String []args) {
	   Scanner scanner = new Scanner(System.in); 
	
		System.out.print("����: ");
		int korean = scanner.nextInt();
		
		
		System.out.print("����: ");
		int english = scanner.nextInt();
		
		
		System.out.print("����: ");
		int math = scanner.nextInt();
		
		int sum= korean + english + math;
		//���� 
		if ((sum < 210)|| korean <60 || english < 60 || math < 60) {
			System.out.println("Ż��");
			
		} else { 	
	System.out.println("�հ�");
		}
	

    scanner.close();
   }}
			
   


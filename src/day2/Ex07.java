package day2;
//BMI ����ϱ� 
//BMI ���� = ������ / Ű / Ű
//Ű�� m�����̴�
//170= 1.7 
//BMI ��� 
// 0~18.4 :��ü��
//18.5~22.9 :����ü��
//23~24.9: ��ü��
//25~29.5: ��
//30~ ����
//����ڰ� Ű�� �����Ը� Double�� �Է�= ����ϴ� ���α׷� 

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		System.out.print("�����Ը� �Է����ּ���:");
	double weight = scanner.nextDouble();
		System.out.print("Ű�� �Է��ϼ���:");
		double height = scanner.nextDouble();
		
		double bmi = weight / height / height;
		
		if(bmi >= 30 ) {
			System.out.println("����");
		}else if(bmi  >= 25 ) {
			System.out.println("��");
		}else if(bmi  >= 23) {
			System.out.println("��ü��");
		}else if(bmi  >= 18.5 ) {
			System.out.println("����ü��");
		}else if(bmi  >= 0 ) {
		System.out.println("��ü��");
		}else {
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
		
		scanner.close();
	}
	}
}


package day2;
//�л����κ��� ������ �Է¹޾Ƽ�
// A.B.C.D.F.�� ����ϴ� ���α׷�
//�� �л��� �߸��� ���� (-122.22343)�� �Է��ϸ�
//�ùٸ� ������ �Է��Ҷ����� ��� ���ο� �Է��� ����

import java.util.Scanner;

public class Ex19 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("������ �Է����ּ���");
	int score =scanner.nextInt();
	
	if(score < 0 || score > 100) {
		System.out.println("�߸��Է��ϼ̽��ϴ�.");
		System.out.println("������ �Է����ּ���:");
		score= scanner.nextInt();
	}
	
	if(score >= 90) { 
		System.out.println("A");
		
	}else if(score >= 80){
		System.out.println("B");
		
    }else if(score >= 70){
		System.out.println("C");
		
    }else if(score >= 60){
		System.out.println("D");
		
    }else {
		System.out.println("F");
	}
    scanner.close();
}
}

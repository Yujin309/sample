package Home01;

public class 평균Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name= "이말자";
	
		int korean= 90;
		int english= 100;
		int math= 90;
		
		double sum= korean+english+math;
		double avg= sum/3;
		
		String grade="다시입력해주세요";
		
		switch ((int) avg/10) {
		
		
		case 10 : case 9 :  grade = "A";
		break;
		
		case 8 :  grade= "B";
		break;
		

		case 7 :  grade= "C";
		break;

		case 6 :  grade= "D";
		break;
		 
		case 5: case 4: case 3:case 2:case 1: case 0 :
			grade ="F";
		break;
		}
		System.out.println("이름  국어  영어  수학  총점  평균             등급 ");
		System.out.printf("%s %d %d %d %.0f %.2f    %s \n",
				 name, korean,english,math,sum,avg,grade);
	}
		
		}
	


		
		
		
		
		
		
		
		
		
		
	


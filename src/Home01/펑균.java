package Home01;

public class 펑균 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name= "이말자";

int korean= 90;
int english= 100;
int math= 90;

double sum= korean+english+math;
double avg= sum/3;

String grade;

	if(avg >= 90) { 
		grade ="A";
	}else if(avg >= 80){
		grade ="B";
	}else if(avg >= 70){
		grade= "C";
	}else if(avg >= 60){
		grade="D";
	}else {
		grade="F";
	}
		System.out.println("이름  국어  영어  수학  총점  평균             등급 ");
		System.out.printf("%s %d %d %d %.0f %.2f    %s \n",
				 name, korean,english,math,sum,avg,grade);
		
		
	}



}


	
	
	



	



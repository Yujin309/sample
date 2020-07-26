package Home01;

public class 돈계산 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int money = 345780;

int m1 = money/100000; 
System.out.println("10만원권:"+ m1 + "장");

int m2 = (money%100000)/50000;
System.out.println("5만원권:"+ m2 + "장");

int m3 = (money%50000)/10000; 
System.out.println("만원권:"+ m3 + "장");

int m4 = (money%10000)/5000;
System.out.println("오천원권:"+ m4 + "장");

int m5 = (money%5000)/1000;
System.out.println("천원권:"+ m5 + "장");

int m6 = (money%1000)/500;
System.out.println("오백원:"+ m6 + "개");

int m7 = (money%500)/100;

System.out.println("백원:"+ m7 + "개");
int m8 = (money%100)/50;
System.out.println("오십원:"+ m8 + "개");
int m9 = (money%50)/10;
System.out.println("십원:"+ m9 + "개");


	}

}

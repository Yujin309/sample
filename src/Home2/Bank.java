package Home2;
	import java.util.Scanner;
//public static void main(String[] args) {
public class Bank {

			  private int Money;//입금액	}	 
			  static int accountNumber=100;//계좌 번호 
			  public  double rate =2.0;//이자
			  
			  private  String Name;
			  public int  accountNo;
			  public static int acc= 001;//계좌 번호 2
			  private int balance; //총액
			  private int choice;//선택 
			  private int term;//몇년 기간 
				static int FinalMoney;//만기시 환급액
				static int BankNum =(accountNumber + acc);
				
				static int plus;//이자
			private int join;
	
			
			public Bank(){
			
			}
		Scanner sc = new Scanner(System.in);
				public void inputInfo() {
				
				while (true) { 
				
				System.out.println("이름?: ");
				this.Name = sc.nextLine();
				
				System.out.println("몇년?:  ");
				this.term =sc.nextInt();
				
				System.out.println("입금액?:  ");
				this. Money= sc.nextInt();
				
				this.balance= Money*term*12;//총액
				this.plus=(int)(Money*rate);//이자
				this.FinalMoney= balance+plus;//환급액
				
				calc();
			System.out.printf("원금 -> 월 %d * %d년 = %d원\n", Money,term,balance);
				
			System.out.printf("만기시 금액->  %d원 ",FinalMoney);
			
		System.out.println("계좌를 개설하시겠습니까? Y / N ");
				
		 join=sc.next().charAt(0);
		
				sc.nextLine();
				 if(join=='Y') {

	System.out.println("계좌번호\t    이름\t   월입금액\t   기간\t   이율\t    총액\t   이자액\t   만기시환급액   ");
	System.out.println
	(accountNumber+"-"+BankNum+"    "+ Name+"     "+ Money+"   "+term+"년        "+ rate+"%     " +balance+"      " +plus+"    "+FinalMoney);

		++acc;
		System.out.println();
				 }
				 
else {
						System.out.println("감사합니다.");

					}
				
				}
				
				}
				private void calc() {
					// TODO Auto-generated method stub
					
				}
				}
				



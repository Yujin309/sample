package Home2;
	import java.util.Scanner;
//public static void main(String[] args) {
public class Bank {

			  private int Money;//�Աݾ�	}	 
			  static int accountNumber=100;//���� ��ȣ 
			  public  double rate =2.0;//����
			  
			  private  String Name;
			  public int  accountNo;
			  public static int acc= 001;//���� ��ȣ 2
			  private int balance; //�Ѿ�
			  private int choice;//���� 
			  private int term;//��� �Ⱓ 
				static int FinalMoney;//����� ȯ�޾�
				static int BankNum =(accountNumber + acc);
				
				static int plus;//����
			private int join;
	
			
			public Bank(){
			
			}
		Scanner sc = new Scanner(System.in);
				public void inputInfo() {
				
				while (true) { 
				
				System.out.println("�̸�?: ");
				this.Name = sc.nextLine();
				
				System.out.println("���?:  ");
				this.term =sc.nextInt();
				
				System.out.println("�Աݾ�?:  ");
				this. Money= sc.nextInt();
				
				this.balance= Money*term*12;//�Ѿ�
				this.plus=(int)(Money*rate);//����
				this.FinalMoney= balance+plus;//ȯ�޾�
				
				calc();
			System.out.printf("���� -> �� %d * %d�� = %d��\n", Money,term,balance);
				
			System.out.printf("����� �ݾ�->  %d�� ",FinalMoney);
			
		System.out.println("���¸� �����Ͻðڽ��ϱ�? Y / N ");
				
		 join=sc.next().charAt(0);
		
				sc.nextLine();
				 if(join=='Y') {

	System.out.println("���¹�ȣ\t    �̸�\t   ���Աݾ�\t   �Ⱓ\t   ����\t    �Ѿ�\t   ���ھ�\t   �����ȯ�޾�   ");
	System.out.println
	(accountNumber+"-"+BankNum+"    "+ Name+"     "+ Money+"   "+term+"��        "+ rate+"%     " +balance+"      " +plus+"    "+FinalMoney);

		++acc;
		System.out.println();
				 }
				 
else {
						System.out.println("�����մϴ�.");

					}
				
				}
				
				}
				private void calc() {
					// TODO Auto-generated method stub
					
				}
				}
				



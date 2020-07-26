package Use;
import Home2.TicketNum1;
public class TicketNumUse {

	public static void main(String[] args) {
	
TicketNum1 unRef1=new TicketNum1();
unRef1.Name="A";
unRef1.count =1;

TicketNum1 unRef2=new TicketNum1();
unRef2.Name="B";
unRef2.count =2;

TicketNum1 unRef3=new TicketNum1();
unRef3.Name="C";
unRef3.count =3;
	
TicketNum1 unRef4=new TicketNum1();
unRef4.Name="D";
unRef4.count =4;
	
TicketNum1 unRef5=new TicketNum1();
unRef5.Name="E";
unRef5.count =5;

unRef3.output();
	}
}

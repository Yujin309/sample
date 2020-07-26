package Home2;

public class TicketNum1 {

	public static int ticketNumber=5 ;//번호
	 public int count;//대기인원
	public String Name;//이름
	
	public static void TicketNum1() {
		ticketNumber++;
	}
	
	public void output() {
		System.out.println(Name+"님은 "+ ticketNumber+"명 중에 "+count+"번째 입니다." );
		
	
	
	
	}

}

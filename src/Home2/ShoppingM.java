package Home2;

public class ShoppingM extends Product{
	String carrier;
	
//	private int price; 
 String pname;
 
@SuppressWarnings("unused")
private int price;
	
	public ShoppingM(String pname,int price,String carrier) {
		this.pname= pname;
		this.price=price;
		this.carrier=carrier;
		
	}
	public void printExtra() {
		System.out.println("Ελ½Ε»η:"+carrier);
		
	}

}

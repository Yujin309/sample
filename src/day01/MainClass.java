package day01;
public class MainClass {
int i=10;//앞에 public 생략 

	private int age;
	private int height;
	private int weight;
	private String phoneNum;
	//인스턴스 변수라고 한다

	public MainClass() {
		
	}
	
	public MainClass (int age, int height, int weight, String phoneNum) {
	//파라미터 있는것을 원한다면 
		
		this.age=age;
		this.height=height;
		this.weight=weight;
		this.phoneNum=phoneNum;
	}
	public double calculateBMI() {
	double result=weight/(height* height);
	return result;
	}
	
	public int getAge() {
		return this.age	;
	}
	public void setAge(int age) {
		this.age=age;
	}
	
}

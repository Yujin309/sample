package day01;
public class MainClass {
int i=10;//�տ� public ���� 

	private int age;
	private int height;
	private int weight;
	private String phoneNum;
	//�ν��Ͻ� ������� �Ѵ�

	public MainClass() {
		
	}
	
	public MainClass (int age, int height, int weight, String phoneNum) {
	//�Ķ���� �ִ°��� ���Ѵٸ� 
		
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

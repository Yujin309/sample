package day2;
//Switch ���� �̿���
//http stsus code�����
//Ư�� �������� �̵���Ű�� �ڵ�
public class EX11 {

	public static void main(String []args) {
		int code = 404;
		String address = "/main/index";
		
		
	switch(code) {
	case 200:
		System.out.println("������ ��û");
		break;
	case 300:
		System.out.println("�������� �̵���Ŵ");
		address= "redirect:/main/search";
		break;
		
	case 404:
		System.out.println("��û�� �������� �����ϴ�.");
		address= "/err/404";
		break;
	case 500:
		System.out.println("��������");
		address= "/err/500";
		break;
		
	}
	System.out.println("������� �����̵� �ּ� :"+address);
}
}
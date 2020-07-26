package day2;
//Switch 문을 이용한
//http stsus code결과를
//특정 페이지로 이동시키는 코드
public class EX11 {

	public static void main(String []args) {
		int code = 404;
		String address = "/main/index";
		
		
	switch(code) {
	case 200:
		System.out.println("정상적 요청");
		break;
	case 300:
		System.out.println("페이지를 이동시킴");
		address= "redirect:/main/search";
		break;
		
	case 404:
		System.out.println("요청한 페이지가 없습니다.");
		address= "/err/404";
		break;
	case 500:
		System.out.println("서버에러");
		address= "/err/500";
		break;
		
	}
	System.out.println("사용자의 최종이동 주소 :"+address);
}
}
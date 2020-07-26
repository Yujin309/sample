package day2;
//이중 for loop

//바깥쪽 for loop이 한번 실행될때마다
//안쪽 for loop은 처음부터 끝까지 진행

//바깥쪽 for loop이3번 반복되고
//안쪽 for loop이 4번 반복되면
//안쪽 for loop의 토탈 반복횟수는 몇번일까?

public class Ex16 {

	public static void main(String[] args) {
		
		int totalCount = 0;
		
		for (int i = 0; i < 3; i++) {
			
			// 위에서 i를 썼기때문에 for loop안에서는
			// i를 또 못만듦.

		for (int j = 0; j < 4; j++) {
				totalCount++;

		System.out.println("총 반복횟수: " + totalCount + ",i:" + i + "j:" + j);

		// 위의j forloop이 끝나면 int j소멸
		// i for loop한번 반복되면
		// j가 새로 선언과 초기화가 되기때문에
		// 0 1 2 3 만 나옴
			}
		}
	}
}
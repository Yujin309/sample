package Book;

import java.util.Scanner;

public class ch_5 {

	public static void main(String[] args) {
		String[] iArrName = { "영희", "철수", "영수", "말자" };
		int[] iArr = new int[5];
		int totalHeight = 0;
		int maxH = 0;
		int maxHIndex = 0;
		int minH = 0;
		int minHIndex = 0;
//처음에는 0으로 초기값을  준다. 
		
		Scanner scanner = new Scanner(System.in);
//Scanner 값을 입력 받을때 쓰는것. 바이트 단위로 읽는다. 
		
		for (int i = 0; i < iArr.length; i++) {
			//배열의 크기가 나온다
			// iArr 만큼 돈다.
			System.out.print(iArrName[i] + "키를 입력하세요 :");
			iArr[i] = scanner.nextInt(); //int 를 입력받을떄 
					//여러줄을 받을때는 nextLine 메서드를 이용해서 한줄씩 읽어서 처리 
			totalHeight = totalHeight + iArr[i];
		}

		
		
		System.out.println("학생들 평균 신장은 " + (totalHeight / iArrName.length) + "입니다");
		for (int i = 0; i < iArr.length; i++) {
			if (iArr[i] > maxH) {
				maxH = iArr[i];
				maxHIndex = i;
			}
		}
		System.out.println("가장 큰 학생은" + iArrName[maxHIndex] + "입니다");
		minH = maxH;
		for (int i = 0; i < iArr.length; i++) {
			if (iArr[i] < minH) {
				minH = iArr[i];
				minHIndex = i;
			}
		}
		System.out.println("가장 작은 학생은" + iArrName[minHIndex] + "입니다.");
	}
}

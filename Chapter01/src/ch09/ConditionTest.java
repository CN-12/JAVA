package ch09;

import java.util.Scanner;

public class ConditionTest {

	public static void main(String[] args) {
		
		System.out.println("입력 받은 두 수 중 큰 수를 출력할거임!");
		int max;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("첫 번째 수를 입력하세요 :");
		int x = scanner.nextInt();
		System.out.println("두 번째 수를 입력하세요 :");
		int y = scanner.nextInt();
		
		max = (x > y) ? x:y;
		System.out.println(max);
	}

}

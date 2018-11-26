package practice02;

import java.util.Scanner;

public class Prob01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("금액 :");
		int[] arraymoney; 
		int i = 0;
		int money = scanner.nextInt();
		arraymoney = new int[10];
		int[] divine = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
		
		for (; i< 10; i++) {
			arraymoney[i] = money/divine[i];
			money = money%divine[i];
			System.out.println(divine[i] + "원 :" + arraymoney[i] + "개");
		
		}
		scanner.close();
	}

}

package practice02;

import java.util.Scanner;

public class Prob02 {

	public static void main(String[] args) {
		Scanner in = new Scanner( System.in );
		System.out.println("5개의 숫자를 입력하시오");
        int intArray[] = new int[5];
        double sum = 0;
        int i = 0;
        
        for (; i < 5; i++) {
        	intArray[i] = in.nextInt();
        	sum = sum + intArray[i];
        	System.out.println(intArray[i]);
        }
        /* 키보드에서 배열 크기만큼 입력 받아 배열에 저장하는 코드 */

        /* 배열에 저장된 정수 값 더하기 */

        /* 출력 */
        System.out.println(sum/5);
        in.close();
	}
	

}

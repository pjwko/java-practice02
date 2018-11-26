package practice02;

import java.util.Random;
import java.util.Scanner;

public class Prob05 {

	public static void main(String[] args) {	
		Random r = new Random();
		int k = r.nextInt(100) + 1;
		int ana = 1;
		
		System.out.println(k);
		
		while(true) {
		Scanner scanner = new Scanner(System.in);
		System.out.print( ana + ">>" );
		int i = scanner.nextInt();
		ana = ana + 1;
		
		 	if( i < k) {
		 		System.out.println("더높게");
		 	}
		 	else if ( i > k ) {
		 		System.out.println("더낮게");
		 	} else { System.out.print("다시 하시겠습니까?(y/n)");
			String answer = scanner.nextLine();
			if( answer.equals("n") ){ 
				//종료하도록 작성한다.	
				break;
}	
			
				
			
			
		}


	}

	}
}

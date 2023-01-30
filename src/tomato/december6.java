package tomato;

import java.util.Scanner;

public class december6 {
	
	public static void main(String[] args) {
		
		
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your number");
		
		boolean isNotPrime = false;
		int num = scanner.nextInt();

		for(int i=2; i<num-1; i++) {
			if(num%i == 0) {
				isNotPrime = true;
				break;
			}
		}
		if (isNotPrime) {
			System.out.println(num+" is not a prime number");
		}else {
			System.out.println(num+" is a prime number");
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

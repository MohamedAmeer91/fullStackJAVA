package in.Ameer.MockTest;

import java.util.Scanner;

public class LargestofThreeNumbers {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter value of A:");
		int a=scan.nextInt();
		System.out.println("Enter value of B:");
		int b=scan.nextInt();
		System.out.println("Enter value of C:");
		int c=scan.nextInt();
		
		if(a>b) {
			if(a>c) {
				System.out.println(a+" A is greater than B "+b+" and C "+c);
			}else {
				System.out.println(c+" C is greater than A "+a+" and B "+b);
			}
		}else if(b>c) {
			System.out.println(b+" B is greater than A "+a+" and C "+c);
		}else {
			System.out.println(c+" C is greater than A "+a+" and B "+b);
		}
		scan.close();
	}
}

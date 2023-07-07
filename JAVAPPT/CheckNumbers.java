package in.Ameer.MockTest;

import java.util.Scanner;

public class CheckNumbers {

	public static void main(String[] args) {
		
		CheckNumbers accessObject = new CheckNumbers();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to check it is positiveor negative:");
		int input_number = scan.nextInt();
		String val = accessObject.getPositiveorNegative(input_number);
		System.out.println("Entered number is :"+val);
		scan.close();

	}
	
	public String getPositiveorNegative(int input) {
		String returnval = "";
		
		if(input>0) {
			returnval = "Positive";
		}else if(input<0) {
			returnval = "Negative";
		}else {
			returnval = "zero";
		}
		
		return returnval;
	}

}

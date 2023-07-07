package in.Ameer.MockTest;

import java.util.ArrayList;

public class ListAverage {

	public static void main(String[] args) {
		
		int[] numberlist = {5,10,15,25,36,48};
		int array_length=numberlist.length;
		if(array_length>0) {
		int index=0;
		int sum=0;
		
		do {
			sum+=numberlist[index];
			index++;						
		}while(index<array_length);
		
		double average=sum/array_length;
		
		System.out.println("Average::"+average);

		}
	}
	


}

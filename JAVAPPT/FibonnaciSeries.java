package in.Ameer.MockTest;

public class FibonnaciSeries {

	public static void main(String[] args) {

		int k1=0, k2=1,k3;

		int n=20;
		System.out.print(k1+" "+k2);
		for(int i=2;i<n;i++) {
			k3=k1+k2;    
			  System.out.print(" "+k3);    
			  k1=k2;    
			  k2=k3;  
		}
	}

}

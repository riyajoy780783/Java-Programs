package ncr;

import java.util.Scanner;

public class Ncr {

	public static void main(String[] args) {
		long factr=1,factd=1;
		long factn=1;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		long n = sc.nextInt();
		
		System.out.println("Enter the value of r");
		long r = sc.nextInt();
		for(long i=1;i<=n;i++)
		{
			factn=factn*i;
		}
		
		for(long i=1;i<=r;i++)
		{
			factr=factr*i;
		}
		//System.out.println(factr);
		long diff =n-r;
		for(int i=1;i<=diff;i++)
		{
			factd=factd*i;
		}
		
		long ncr=(factn/(factr*factd));
		System.out.println("The NCR factor for given value is "+ncr);
		
	}

}

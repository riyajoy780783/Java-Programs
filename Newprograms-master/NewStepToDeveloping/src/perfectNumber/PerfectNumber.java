package perfectNumber;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int d;
		int sum=0;
		System.out.print("The divisor of the numbers are ");
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				d=i;
				System.out.print(" "+d);
				sum=sum+i;
			}
		}
		System.out.println();
		System.out.println("The sum of the divisors are "+sum);
		if(n==sum)
		{
			System.out.println("It is a perfect number");
		}
		else
		{
			System.out.println("It is not a perfect number");
		}
	}

}

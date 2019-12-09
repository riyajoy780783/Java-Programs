package armStrong;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int a=num;
		int sum=0;
		while(num!=0)
		{
			int r=num%10;
			int n=r*r*r;
			sum=sum+n;
			num=num/10;
		}
		if(a==sum)
		{
			System.out.println("The given number is Armstrong ");
		}
		else
		{
			System.out.println("The given number is not Armstrong");
		}

	}

}

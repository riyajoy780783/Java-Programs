package fibonacci;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
        int p1=0;
        int p2 =  1;
        System.out.print("The fibonacci series is "+p1+" "+p2);
        for(int i=0;i<=n;i++)
        {
        	int p3=p1+p2;
        	p1=p2;
        	p2=p3;
        	System.out.print(" "+ p2);
        }
	}

}

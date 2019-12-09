package goldidol;

import java.util.Scanner;

public class Gold {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the kg of gold");
		int n = sc.nextInt();
		int d=0;
		int num=n/5;
		if(num>5)
		{
			d=num/5;
			
		}
		n=n+num+d;
		System.out.println("Number of Sculptors can be made is "+n);

	}

}

package vehicle;

import java.util.Scanner;

public class Vehicle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number vehicle");
		int n = sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the fare collected for each vehicles ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int d=0,c=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]>=50)
			{
				d++;
			}
			else if(arr[i]>0 &&arr[i]<50)
			{
				c++;
			}
		}
		System.out.println("Number of heavy vehicle "+d+" and the number of light vehicle is "+c);

	}

}

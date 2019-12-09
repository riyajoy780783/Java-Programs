package greatone;

import java.util.Scanner;

public class Greatone {

	public static void main(String[] args) {
		int max=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of applicants");
		int n = sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the amount(in crores) ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		if(arr[0]>arr[1])
		{
			max=arr[0];
		}
		else {
			max=arr[1];
			
		}
			
		for(int i=0;i<n;i++)
		{
			if(max <arr[i])
				{
					
				max=arr[i];
			}
		}
		System.out.println("The winning bid is "+ max +" crores");

	}

}

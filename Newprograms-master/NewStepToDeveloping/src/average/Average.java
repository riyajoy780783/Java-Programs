package average;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of students");
		int n = sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the mark of the students ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int sum=0;
		for(int j=0;j<n;j++)
		{
			sum=sum+arr[j];
		}
		System.out.println("The average is "+sum/n);

	}

}

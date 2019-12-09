package retest;

import java.util.Scanner;

public class Retest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of students");
		int n = sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the mark of  students ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int count=0;
		for(int j=0;j<n;j++)
		{
			if(arr[j]<45)
			{
				count++;
			}
		}
		System.out.println("The number of students appearing for retest is "+count);

	}

}

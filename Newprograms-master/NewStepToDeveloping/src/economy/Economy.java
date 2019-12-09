package economy;

import java.util.Scanner;

public class Economy {

	public static void main(String[] args) {
		System.out.println("Enter the number of bowlers");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the runs conceded by the bowler");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int arr1[]=new int[n];
		
		System.out.println("Enter the number of balls for each bowler");
		for(int i=0;i<n;i++)
		{
			arr1[i]=sc.nextInt();
		}
		double ec[]=new double[n];
		
			for(int j=0;j<n;j++)
			{
				double r=arr1[j]/6.0;
				 ec[j]=arr[j]/r;
				
			}
			System.out.println("Economy of bowler is ");
			for(int i=0;i<n;i++)
			{
				System.out.println(ec[i]);
			}
			double sum=0;
			for(int i=0;i<n;i++)
			{
				sum=sum + ec[i];
			}
			double economy=sum/n;
			System.out.println("The overall value of team is "+economy);
			int count =0;
			for(int i=0;i<n;i++)
			{
				if(ec[i]<economy)
				{
					count++;
				}
			}
			System.out.println("The number of bowlers eligible are "+count);
	}

}

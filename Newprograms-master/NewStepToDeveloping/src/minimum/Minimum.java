package minimum;

import java.util.Scanner;

public class Minimum {

	public static void main(String[] args) {
		int min=0;
		int i=0;
		int c=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of players");
		int n = sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the fouls made by each player");
		for( i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		if(arr[0]<arr[1])
		{
			min=arr[0];
		}
		else {
			min=arr[1];
			
		}
			
		for(i=0;i<n;i++)
		{
			if(min >arr[i])
				{
					
				min=arr[i];
				c=i+1;
				
			}
		}
		System.out.println("The eligible player is player no:"+c+"("+min+"fouls) ");



	}

}

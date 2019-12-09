package negativeNumber;

import java.util.Scanner;

public class Negative {

	public static void main(String[] args) {
		int sum=0;
		boolean i=false;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Enter a number");
			int n=sc.nextInt();
			if(n<0)
			{
				i=true;
			}
			else
			{
				
				for(int j=0;j<=n;j++)
				{
				sum=sum+j;
				i=false;
					
				}System.out.println(sum);
				
			}
			
		}while(i);
	}

}

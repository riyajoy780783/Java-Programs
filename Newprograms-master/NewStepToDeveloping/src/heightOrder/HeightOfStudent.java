package heightOrder;

import java.util.Scanner;

public class HeightOfStudent {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of students");
		int n = sc.nextInt();
		double arr[]=new double[n];
		System.out.println("Enter the height of the students ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextDouble();
		}
		double max;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]>arr[j])
				{
					max = arr[i];
					arr[i] =arr[j];
					arr[j] = max;
				}
			}
		}
		System.out.println("The height in order");
		
for(int i=0;i<n;i++)
{
	System.out.println(arr[i]);
}
	}

}

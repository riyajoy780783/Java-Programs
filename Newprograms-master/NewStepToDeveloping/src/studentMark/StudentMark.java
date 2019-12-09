package studentMark;

import java.util.Scanner;

public class StudentMark {

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
		int max;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]<arr[j])
				{
					max = arr[i];
					arr[i] =arr[j];
					arr[j] = max;
				}
			}
		}
		System.out.println("The priority ofmarks");
		
for(int i=0;i<n;i++)
{
	System.out.println(arr[i]);
}


	}

}

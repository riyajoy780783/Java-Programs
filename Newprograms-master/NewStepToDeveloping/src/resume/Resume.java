package resume;

import java.util.Scanner;

public class Resume {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=sc.next();
		System.out.println("Enter your age");
		int age=sc.nextInt();
		System.out.println("Enter your degree");
		String degree=sc.next();
		System.out.println("Enter your branch");
		String branch=sc.next();
		System.out.println("Enter your contact number");
		String mobile =sc.next();
		System.out.println("Name    : "+name +"\n"+"Age     : "+age +"\n"+"Degree  : "+degree+"\n"+"Branch  : "+branch+"\n"+"Contact : "+mobile);

	}

}

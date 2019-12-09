package onlineShop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Admin extends ConnectionManager {
	
	ConnectionManager cm = new ConnectionManager();
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public void adminlogin() throws NumberFormatException, IOException  {
		
		System.out.println("\n1.Add Product");
		System.out.println("2.Display Inventory Details");
		System.out.println("3.Logout");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int choice = Integer.parseInt(br.readLine());
		
		switch(choice)
		{
		case 1:
			System.out.print("Product Id :");
			String pId=br.readLine();
			System.out.print("Product Name : ");
			String pName=br.readLine();
			System.out.println("Min Sell Quantity Price: ");
			String min=br.readLine();
			
			
			
		
			
		}
	
	}
}

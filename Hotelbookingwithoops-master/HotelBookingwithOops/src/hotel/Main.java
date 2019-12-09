package hotel;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;

import booking.Booking;
import customer.Customer;
import register.Registration;

public class Main {
	static int roomnum = 0;
	static int registerID = 0;
	Customer cus = new Customer();
	
	
	public static void main(String[] args) throws IOException {
		Registration reg = new Registration();
		 String firstName;
		 String middleName;
		 String lastName;
		 String email;
		 String contact;
		 int choice;
		 
		 boolean i= false;
		 boolean l =true;
		 
		  String ac;
		  String cot;
		  String cable;
		  String wifi;
		  String laundry;
		  
		  int fordate[]=new int[31];
		  int roomno[]=new int[25];
		  int customerid[] = new int[25];
		  String view[] = new String[25];
		  String Email[] = new String[25];
		  int e=0;
		  int r=0;
		  int date=0;
		  int v=0;
		  boolean register = false;
		  
		 while(l)
		 {
			 //System.out.println("****************** RIYA LUXURY HOTEL ***************");
		System.out.println("\nEnter your choice\n\n  1.Registration\n  2.Booking\n  3.Check status\n  4.Update Email\n  5.All Booking\n  6.All customers\n  7.Exit");
		
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		choice = Integer.parseInt(br.readLine());
		switch(choice)
		{
		case 1:
			do {
			System.out.println("        Welcome to Registration\n\nEnter your details");
			System.out.print("\nEnter your Firstname : ");
			firstName = br.readLine();
			view[v] = firstName;
			v++;
			System.out.print("\nEnter your Middlename : ");
			middleName = br.readLine();
			System.out.print("\nEnter your Lastname : ");
			lastName = br.readLine();
			System.out.print("\nEnter your Email : ");
			email = br.readLine();
			Email[e]=email;
			e++;
			System.out.print("\nEnter your Contact : ");
			contact = br.readLine();
       
			
			reg.registration(firstName,middleName,lastName,email,contact);
			register = true;
			customerid[r]=reg.registerID;
			
			
			System.out.print("\nDo yo want to continue registeration? YES/NO : ");
			String y1 = br.readLine();
			if(y1.equalsIgnoreCase("yes"))
			{
				i=true;
				//System.out.println("Thank you for booking.Your room number is "+ ++roomno);
			}
			else
			{
				i=false;
			}
			}while(i);
			break;
       
		case 2:
			if(register==false)
			{
				System.out.println("************Ouch!!!!!!!!!!!!!!!!!!ONLY REGISTERED CUSTOMERS CAN BOOK THE ROOM*************");
			}
			else if(register==true)
			{
			
			System.out.println("\n       Booking\n\nplease choose the requirements");
			System.out.print("\nEnter the date of booking : ");
			date=Integer.parseInt(br.readLine());
			fordate[r]=date;
			System.out.print("\nAc/NAc : ");
			ac = br.readLine();
			System.out.print("\nSingle/Double : ");
			cot = br.readLine();
			System.out.print("\nWith cable connection/without cable connection (c/wc) : ");
			cable = br.readLine();
			System.out.print("\nWifi needed or not  (w/nw) : ");
			wifi = br.readLine();
			System.out.print("\nLaundry service needed or not ( L/nL) : ");
			laundry = br.readLine();
			
			
			
			Booking book = new Booking();
			book.roomBooking(ac,cot,cable,wifi,laundry);
			//System.out.println("\nDo yo want to continue? \nYES/NO");
			//String y1 = br.readLine();
			/*if(y1.equalsIgnoreCase("yes"))
			{
				
				
				i=false;
				System.out.println("Thank you for booking.Your room number is "+ book.roomnum());
				roomno[r]=++roomnum;
				r++;
				
			}
			else
			{
				//register=false;
				//System.out.println("Only registered customers can book the room");
				i=true;
			}
		
			*/
			System.out.println("\nThank you for booking.Your room number is "+ book.roomnum());
			roomno[r]=++roomnum;
			r++;
			register=false;
			}
			
			break;
			
		case 3:
			
			
			do {
			
			System.out.print("\nEnter the room number : ");
			Booking rm1=new Booking();
			int num=Integer.parseInt(br.readLine());
			boolean check = rm1.checkStatus(num);
			if(check)
			{
				System.out.println("\nRoom number "+ num +" booked");
				//System.out.println("Do you want another room? YES/NO");
			}
			else
			{
				System.out.println("\nRoom number "+ num+" is not booked");
			}
			System.out.print("\nDo you want to check another room? YES/NO : ");
			String y1 = br.readLine();
			if(y1.equalsIgnoreCase("yes"))
			{
				i=true;
			}
			else
			{
				i=false;
			}
			}while(i);
			
			
			break;
			
		case 4:
			
		do {
			Customer cus = new Customer();
			System.out.println("       \nUpdate Email");
			System.out.print("\nDo you want to update your email id? YES/NO : ");
			String y1 = br.readLine();
			//++registerID;
			if(y1.equalsIgnoreCase("yes"))
			{
				System.out.print("\nEnter the current emailID : ");
				String id=br.readLine();
				System.out.print("\nEnter new email ID : ");
				String email2 = br.readLine();
				for(int w=0;w<reg.registerID;w++)
				{
					if(id.equalsIgnoreCase(Email[w]))
					{
						//cus.setEmail(id);
						System.out.println("\nEmail updated");
						reg.emailUpdate(email2, registerID);
					}
				}
				
				
				}
			System.out.print("\nDo yo want to update another email? YES/NO : ");
			String y2 = br.readLine();
			if(y2.equalsIgnoreCase("yes"))
			{
				i=true;;
			}
			else
			{
				break;
			}
				}while(i);
			
			
			break;
			
			
		case 5:	
			
			System.out.println("       View all Booking");
			
			do {
			
			System.out.print("\nEnter the start date : ");
			int startdate = Integer.parseInt(br.readLine());
			System.out.print("\nEnter the end date : ");
			int enddate = Integer.parseInt(br.readLine());
			System.out.println("\nThe booking made from "+startdate+" to "+enddate);
			System.out.println("\nCustomer ID"+"      "+"Room no");
			 
				for(int in=0;in<=reg.registerID;in++)
				{
				if( fordate[in]>=startdate && fordate[in]<=enddate)
				{
					System.out.println(customerid[in]+"                "+roomno[in]);
				}
				}
			
			System.out.println("\nDo yo want to check for another dates YES/NO : ");
			String y2 = br.readLine();
			if(y2.equalsIgnoreCase("yes"))
			{
				i=true;
			}
			else
			{
				break;
			}
				}while(i);
				
				break;
			
				
		case 6:
			
			
				
			System.out.println("\n       The registered customers are");
			System.out.println("\nCustomer list");
			System.out.println("\nCustomer ID"+"    "+"Customer Name");
			int s=0;
			for(int k=1;k<=reg.registerID;k++)
			{
			System.out.println(k+"               "+ view[s]);
			s++;
			}
			/*System.out.println("\nDo yo want to continue? \nYES/NO");
			String y2 = br.readLine();
			if(y2.equalsIgnoreCase("yes"))
			{
				i=false;
			}
			else
			{
				break;
			}
				}while(i);*/
			
			
			break;
			
			
			
		case 7:
			
			
			System.out.println("********************** Thanks for your valuable time:::::)))) ***************************");
			l=false;
			
			}
		}
		 }
	}



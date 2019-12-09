package facegarden;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int roomnum=0;
	public static void main(String[] args) throws IOException {
		
		String name;
		String address;
		String contactNumber;
		String email;
		String proofType;
		String proofID;
		boolean i;
		int k=0;
		
		String ac;
		String cot;
		String cable;
		String wifi;
		String laundry;
		int booked[]=new int[25];
		int flag=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		do {
			
			System.out.println("Name");
			name = br.readLine();
			System.out.println("Address");
			address = br.readLine();
			System.out.println("Contact number");
			contactNumber = br.readLine();
			System.out.println("Email");
			email = br.readLine();
			System.out.println("Proof type");
			proofType = br.readLine();
			System.out.println("Proof ID");
			proofID = br.readLine();
		
		Customer c1=new Customer();
		c1.setName(name);
		c1.setAddress(address);
		c1.setContactNumber(contactNumber);
		c1.setEmail(email);
		c1.setProofType(proofType);
		c1.setProofID(proofID);
		c1.register();
		System.out.println("Do you want to continue?"+"\n"+"y/n");
		char y = br.readLine().charAt(0);
		if(y=='y')
		{
			i=true;
		}
		else {
			//System.out.println("Thank you for your valuable time:)");
			i=false;
		}
		
		}while(i);
		boolean g=true;
		while(g) {
			
		
		System.out.println("**Menu**");
		System.out.println("1. Book \n2 .Checkstatus \n3. Exit");
		String choose =br.readLine();
		
		switch(choose) 
		{
		case"1":
		{
		System.out.println("Booking:");
		do {
		Roombooking rm = new Roombooking();
		System.out.println("Please choose the services required. Ac/NAc");
		ac = br.readLine();
		rm.setAc(ac);
		System.out.println("Cot(Single/Double)");
		cot = br.readLine();
		rm.setCot(cot);
		System.out.println("With cable connection/without cable connection(C/nC)");
		cable = br.readLine();
		rm.setCable(cable);
		System.out.println("Wi-Fi needed or not(W/nW)");
		wifi = br.readLine();
		rm.setWifi(wifi);
		System.out.println("Laundry service needed or not(L/nL)");
		laundry = br.readLine();
		rm.setLaundry(laundry);
		rm.Book(ac,cot,cable,wifi,laundry);
		System.out.println("**services choosed**");
		rm.display();
		System.out.println("Do you want to continue?"+"\n "+"y/n");
		char y = br.readLine().charAt(0);
		if(y=='y')
		{
			i=false;
			
			System.out.println("Thank you for booking.your room number is "+ rm.roomnum());
			 //booked[k]=roomnum;
			 //System.out.println(roomnum);
			 //k++;
			break;
		}
		else {
			i=true;
			
			}
		
		}while(i);
		
		break;
		}
		
		case"2":
		{
			System.out.println("Check status:");
			Roombooking rm1=new Roombooking();
			System.out.println("Enter room number");
			int num=Integer.parseInt(br.readLine());
			boolean check = rm1.checkStatus(num);
			if(check)
			{
				System.out.println("Room number "+ num +" booked");
			}
			else
			{
				System.out.println("Room number "+ num+" is not booked");
			}
		}break;
		case"3":
		{
			System.out.println("Thank you for you sevice!!!!!");
			g=false;
			
		}
		}
		}
		
			   
		   	}
}

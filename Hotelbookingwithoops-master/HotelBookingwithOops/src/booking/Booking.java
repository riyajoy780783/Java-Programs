package booking;

import customer.Customer;

public class Booking {
	Customer customer = new Customer();
	int amount = 0;
	static int roomno = 0;
	boolean a1,a2,a3,a4,a5,a6,a7,a8,a9,a10;
	static int booked[] = new int[24];
	public void roomBooking(String ac,String cot,String cable,String wifi,String laundry) {
		
		customer.setAc(ac);
		customer.setCot(cot);
		customer.setCable(cable);
		customer.setWifi(wifi);
		customer.setLaundry(laundry);
		
		if(customer.getAc().equalsIgnoreCase("AC"))
		{
			amount = 1000;
			a1=true;
		}
		else if(customer.getCot().equalsIgnoreCase("NAc"))
		{
			amount = 750;
			a2 = true;
		}
		if(customer.getCot().equalsIgnoreCase("single"))
		{
			amount=amount;
			a3 = true;
		}
		else if(customer.getCot().equalsIgnoreCase("Double"))
		{
			amount = amount+ 350;
			a4 = true;
		}
		if(customer.getCable().equalsIgnoreCase("c"))
		{
			amount = amount + 50;
			a5 = true;
		}
		else if(customer.getCot().equalsIgnoreCase("wc"))
		{
			amount = amount;
			a6 = true;
		}
		if(customer.getWifi().equalsIgnoreCase("w"))
		{
			amount = amount+ 200;
			a7 = true;
		}
		else if(customer.getWifi().equalsIgnoreCase("nw"))
		{
			amount = amount;
			a8 = true;
		}
		if(customer.getLaundry().equalsIgnoreCase("l"))
		{
			amount = amount+ 100;
			a9 = true;
		}
		else if(customer.getLaundry().equalsIgnoreCase("nl"))
		{
			amount = amount;
			a10 = true;
		}
		System.out.println("\nThe total charges is Rs."+amount);
		System.out.println("\nThe services choosen are :");
		this.display();
		}
	private void display() {
		
		if(a3)
		{
			System.out.print("\n       single cot");
		}
		if(a4)
		{
			System.out.print("\n      double cot");
		}
		if(a1)
		{
			 System.out.println(" AC room");
		}
		if(a2)
		{
			 System.out.println(" Non AC room");
		}
		if(a5)
		{
			System.out.println("       Cable connection enabled");
		}
		if(a6)
		{
			System.out.println("       Cable connection not enabled");
		}
		if(a7)
		{
			System.out.println("       Wifi enabled");
		}
		if(a8)
		{
			System.out.println("       Wifi disabled");
		}
		if(a9)
		{
			System.out.println("       With laundry service");
		}
		if(a10)
		{
			System.out.println("       Without laundry service");
		}
	}
	
	public boolean checkStatus(int room) {
		   
		  
		  if(booked[room] == 1)
		  {
			  return true;
		 }
		  else
		  {
			  return false;
		  }
	   }
	public int roomnum() {
		   
		   roomno++;
		   booked[roomno] = 1;
		   return roomno;
	   }
	
} 


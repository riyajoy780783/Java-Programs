package facegarden;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Roombooking extends Main {
	String ac;
	String cot;
	String cable;
	String wifi;
	String laundry;
	static int roomno = 0;
	
	
	public String getAc() {
		return ac;
	}
	public void setAc(String ac) {
		this.ac = ac;
	}
	public String getCot() {
		return cot;
	}
	public void setCot(String cot) {
		this.cot = cot;
	}
	public String getCable() {
		return cable;
	}
	public void setCable(String cable) {
		this.cable = cable;
	}
	public String getWifi() {
		return wifi;
	}
	public void setWifi(String wifi) {
		this.wifi = wifi;
	}
	public String getLaundry() {
		return laundry;
	}
	public void setLaundry(String laundry) {
		this.laundry = laundry;
	}
	
   void Book(String ac,String cot,String cable,String wifi,String laundry) throws IOException {
	   int amount = 0;
	  String str1 = ac; 
	  String str2 = "Ac";
	  String str3 = "NAc";
	  if(str1.equalsIgnoreCase(str2))
	  {
		   amount=amount+1000;
		 
	  }
	  if(str1.equalsIgnoreCase(str3)) {
		  amount= amount+750;
	  }
	  
	  String cot1 = cot;
	  String cot2 = "Single";
	  String cot3 = "Double";
	  if(cot1.equalsIgnoreCase(cot2))
	  {
		  amount= amount+0;
		
	  }
	  if(cot1.equalsIgnoreCase(cot3))
	  {
		  amount =amount+350;
	  }
	  String cab=cable;
	  String cab1="c";
	  String cab2="nc";
	  if(cab.equalsIgnoreCase(cab1))
	  {
		  amount =amount+50;
	  }
	  if(cab.equalsIgnoreCase(cab2))
	  {
		  amount = amount;
	  }
	  String wifi1 = wifi;
	  String wifi2 = "w";
	  String wifi3 = "nw";
	  if(wifi1.equalsIgnoreCase(wifi2))
	  {
		  amount = amount + 200;
	  }
	  if(wifi1.equalsIgnoreCase(wifi3))
	  {
		  amount = amount;
	  }
	  String lan=laundry;
	  String lan1= "L";
	  String lan2="nL";
	  if(lan.equalsIgnoreCase(lan1))
	  {
		  amount = amount+100;
	  }
	  if(lan.equalsIgnoreCase(lan2))
      {
		  amount =amount;
}
	  System.out.println("The total charges is Rs."+amount);
   }
   void display() {
      String cot1 = cot;
	  String cot2 = "Single";
	  String cot3 = "double";
	  if(cot1.equalsIgnoreCase(cot2))
	  {
		  System.out.print("single cot");
		
	  }
	  if(cot1.equalsIgnoreCase(cot3))
	  {
		  System.out.print("double cot");
	  }
   String str1 = ac; 
	  String str2 = "Ac";
	  String str3 = "NAc";
	  if(str1.equalsIgnoreCase(str2))
	  {
		  System.out.println(" AC room");
		 
	  }
	  if(str1.equalsIgnoreCase(str3)) {
		  System.out.println(" NAC room ");
	  }
	  
	  
	  String cab=cable;
	  String cab1="c";
	  String cab2="nc";
	  if(cab.equalsIgnoreCase(cab1))
	  {
		  System.out.println("Cable connection enabled");
	  }
	  if(cab.equalsIgnoreCase(cab2))
	  {
		  System.out.println("Cable connection disabled");
	  }
	  String wifi1 = wifi;
	  String wifi2 = "w";
	  String wifi3 = "nw";
	  if(wifi1.equalsIgnoreCase(wifi2))
	  {
		 System.out.println("Wifi enabled");
	  }
	  if(wifi1.equalsIgnoreCase(wifi3))
	  {
		  System.out.println("Wifi disabled");
	  }
	  String lan=laundry;
	  String lan1= "L";
	  String lan2="nL";
	  if(lan.equalsIgnoreCase(lan1))
	  {
		  System.out.println("With laundry service");
	  }
	  if(lan.equalsIgnoreCase(lan2))
   {
		  System.out.println("Without laundry service");
}
}
   static int booked[] = new int[25];
   int roomnum() {
	   
	   roomno++;
	   booked[roomno] = 1;
	   return roomno;
   }
   boolean checkStatus(int room) {
	   
	  
	  if(booked[room] == 1)
	  {
		  return true;
	 }
	  else
	  {
		  return false;
	  }
   }
}
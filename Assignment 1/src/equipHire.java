/**
 * 
/**
 * @author s3655764
 *Branch of Assignment 1 for implementation of stage 2 requirements
 */

import java.util.*;

class equipHire {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String cust_Name;
		String cust_Address;
		String cust_Phone;
		String cust_Dl;
		String cust_CCnum;
		String cust_CCexp;
		int book_Length;
		String equip_Code;
		String equip_Name="Invalid Code Entered";
		double day_Rate=0;
		double disc_Rate;
		double fin_Charge;
		double fuel_Charge=0;
		
		// User input
		System.out.print("Enter Customer Name: ");
		cust_Name = sc.nextLine();
		System.out.print("Enter Customer Address: ");
		cust_Address = sc.nextLine();
		System.out.print("Enter Customer Phone Number: ");
		cust_Phone = sc.nextLine();
		System.out.print("Enter Customer Drivers Licence: ");
		cust_Dl = sc.nextLine();
		System.out.print("Enter Customer Credit Card Number: ");
		cust_CCnum = sc.nextLine();
		System.out.print("Enter Customer Credit Card Expiry Date: ");
		cust_CCexp = sc.nextLine();
		System.out.print("Enter Booking Length in Days: ");
		book_Length = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Equipment Code: ");
		equip_Code = sc.nextLine();
		System.out.print("Equipment fully refuelled (Y/N)?");
		String refueled = sc.nextLine();
		
		
		//  determine equipment type and day hire rate from equip code
		
		switch(equip_Code){
		    case"DML":
		        equip_Name="Dingo Mini Loader";
		        day_Rate=300;
		        break;
		    case"BSL":
	            equip_Name="Bobcat Skid Steer Loader";
	            day_Rate=400;
	            break;
		    case"KMX":
	            equip_Name="Kubota 1.7T Mini Excavator";
	            day_Rate=450;
	            break;
		    case"KLX":
	            equip_Name="Kubota 5.5T Light Excavator";
	            day_Rate=550;
	            break;
		}
		
		double basic_Charge=(book_Length*day_Rate);
		
		// determine discount (if any) from Booking length
		if (book_Length < 5){
		    disc_Rate=0;
		}
		else if (book_Length > 14){
		    disc_Rate=0.3;
		}
		else{
		    disc_Rate=0.1;
		}
		double discount=(basic_Charge*disc_Rate);
		discount=(discount*-1);
		
		
		// invoice output
		
		System.out.print("Customer Details\r\n");
		System.out.print("----------------\r\n");
		System.out.printf("Name: %50s\r\n",cust_Name);
		System.out.printf("Address: %47s\r\n",cust_Address);
		System.out.printf("Phone Number: %42s\r\n",cust_Phone);
		System.out.printf("DL No: %49s\r\n",cust_Dl);
		System.out.printf("CC Number: %45s\r\n",cust_CCnum);
		System.out.printf("CC expiry: %45s\r\n",cust_CCexp);
		System.out.print("Equipment Hire Details\r\n");
		System.out.print("----------------------\r\n");
		System.out.printf("Equipment Description: %33s\r\n",equip_Name);
		System.out.printf("Booking Length (Days): %33d\r\n",book_Length);
		System.out.printf("Daily Hire Rate: %39.2f\r\n",day_Rate);
		System.out.printf("Base Hire Charge: %38.2f\r\n",basic_Charge);
		System.out.printf("Discount: %46.2f\r\n",discount);
		// work out final charge from basic charge, discount and refueling fee
        fin_Charge=(basic_Charge+discount);
        if (refueled=="Y"){
            fuel_Charge=200;
        }
        fin_Charge=(fin_Charge+fuel_Charge);
        System.out.printf("Fuel Surcharge: %40.2f\r\n",fuel_Charge);
        System.out.printf("Discounted Hire Charge: %32.2f\r\n",fin_Charge);
		
		

	}

}

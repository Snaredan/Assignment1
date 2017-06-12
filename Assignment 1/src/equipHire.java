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
		double day_Rate;
		
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
		// todo: determine equipment type and day hire rate from equip code
		
		double basic_Charge=(book_Length*day_Rate);
		
		// todo: determine discount (if any) from Booking length
		
		// invoice output
		
		System.out.print("Customer Details\r\n");
		System.out.print("----------------\r\n");
		System.out.printf("Name: %30s\r\n",cust_Name);
		System.out.printf("Address: %27s\r\n",cust_Address);
		System.out.printf("Phone Number: %22s\r\n",cust_Phone);
		System.out.printf("DL No: %29s\r\n",cust_Dl);
		System.out.printf("CC Number: %25s\r\n",cust_CCnum);
		System.out.printf("CC expiry: %25s\r\n",cust_CCexp);
		System.out.print("Equipment Hire Details\r\n");
		System.out.print("----------------------\r\n");
		System.out.printf("Equipment Description: %9s\r\n",equip_Code);
		System.out.printf("Booking Length (Days): %9d\r\n",book_Length);
		System.out.printf("Daily Hire Rate: %15f\r\n",day_Rate);
		System.out.printf("Base Hire Charge: %14f\r\n",basic_Charge);
		
		

	}

}

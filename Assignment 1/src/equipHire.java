/**
 * 
/**
 * @author Snarebear
 *
 */

import java.util.*;

class equipHire {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String cust_Name;
		String cust_Address;
		String cust_Phone;
		String cust_Dl;
		String cust_CCnum;
		String cust_CCexp;
		int book_Length;
		String equip_Type;
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
		System.out.print("Enter Equipment Type to be hired: ");
		equip_Type = sc.nextLine();
		System.out.print("Enter Daily Hire Rate: ");
		day_Rate = sc.nextDouble();
		double basic_Charge=(book_Length*day_Rate);
		
		// invoice output
		
		System.out.print("Customer Details");
		System.out.print("----------------");
		System.out.printf("Name: %30s",cust_Name);
		System.out.printf("Address: %27s",cust_Address);
		System.out.printf("Phone Number: %22s",cust_Phone);
		System.out.printf("DL No: %29s",cust_Dl);
		System.out.printf("CC Number: %25s",cust_CCnum);
		System.out.printf("CC expiry: %25s",cust_CCexp);
		System.out.printf("");
		System.out.printf("");
		System.out.printf("");
		System.out.printf("");
		


	}

}

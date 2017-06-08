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
		String cust_address;
		String cust_phone;
		String cust_Dl;
		String cust_CCnum;
		String cust_CCexp;
		int book_Length;
		String equip_Type;
		double day_Rate;
		
		System.out.print("Enter Customer Name: ");
		cust_Name = sc.nextLine();
		System.out.print("Enter Customer Address: ");
		cust_address = sc.nextLine();
		System.out.print("Enter Customer Phone Number: ");
		cust_phone = sc.nextLine();
		System.out.print("Enter Customer Drivers Licence: ");
		cust_Dl = sc.nextLine();
		System.out.print("Enter Customer Credit Card Number: ");
		cust_CCnum = sc.nextLine();
		System.out.print("Enter Customer Credit Card Expiry Date: ");
		cust_CCexp = sc.nextLine();
		System.out.print("Enter Booking Length in Days: ");
		book_Length = sc.nextInt();
		System.out.print("Enter Equipment Type to be hired: ");
		equip_Type = sc.nextLine();
		System.out.print("Enter Daily Hire Rate: ");
		day_Rate = sc.nextDouble();
		double basic_Charge=(book_Length*day_Rate);
		


	}

}

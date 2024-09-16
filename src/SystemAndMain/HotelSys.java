package SystemAndMain;

import java.util.ArrayList;
import java.util.Scanner;

import Has_A.Customer;
import Inheritance.BodrumHotel;
import Inheritance.FethiyeHotel;
import Inheritance.Hotel;
import Inheritance.NazilliHotel;

public class HotelSys {
	private static ArrayList<Hotel> hotel = new ArrayList<>();
	private static ArrayList<Customer> cust = new ArrayList<>();

	
	public static boolean addCustomer(int id,String reservationName,int numofPerson,int numofDay) {
		
		for(int i=0;i<cust.size();i++) {
			if(cust.get(i).getId()==id)
				return false;
		}
		
		Customer c = new Customer(id,reservationName,numofPerson,numofDay);
		cust.add(c);
		return true;
	
	}
	public static void addHotel(int numOfRooms, int luxuryRate, double price, String theme, boolean a, boolean b)
	{
		Hotel hotel1;
		if(luxuryRate==2)
		{
			hotel1=new NazilliHotel(numOfRooms,2,price,theme,a,b);
			hotel1.calculateCharge();
			hotel.add(hotel1);
		}
		else if (luxuryRate==3)
		{
			hotel1=new FethiyeHotel(numOfRooms,2,price,theme,a,b);
			hotel1.calculateCharge();
			hotel.add(hotel1);
		}
		else {
			hotel1=new BodrumHotel(numOfRooms,2,price,theme,a,b);
			hotel1.calculateCharge();
			hotel.add(hotel1);
		}
	}
	
	
	
//	public static boolean removeCustomer() {
//		
//	}
	
	public static String display() {
		String out = "";
		
		for(int i=0; i<cust.size(); i++) {
			out += cust.get(i).toString();
			out += "\n";
			out += hotel.get(i).toString();
			out += "\n";
		}
		return out;
	}
	
	public static int getCustomer(int id) {
		for(int i=0; i<cust.size(); i++) {
			if(cust.get(i).getId()==id)
				return i;
		}
		return -1;
	}
	
	public static boolean removeCustomer(String name) {
		for(int i=0; i<cust.size(); i++) {
			if(cust.get(i).getReservationName().equalsIgnoreCase(name)) {
				System.out.println(cust.get(i).getReservationName() + " is deleted!!\n");
				cust.remove(i);
				hotel.remove(i);
				return true;
			}
		}
		return false;
	}
	
	public static double calculateCharge() {
		double total = 0;
		for(Hotel h : hotel) {
			total += h.getPrice();
		}
		return total;
	}
	
	public static String displaySelected(int index) {
		String out="";
		out+="Customer with id " +cust.get(index).getId() + " is displayed : \n";
		out+=cust.get(index);
		out+=hotel.get(index);
		return out;
	}
}

package Has_A;

import java.util.Scanner;

import Inheritance.BodrumHotel;
import Inheritance.FethiyeHotel;
import Inheritance.NazilliHotel;

public class Customer{
	
	private int id;
	private String reservationName;
	private int numOfPerson;
	private int numOfDay;
	FethiyeHotel fh;
	BodrumHotel bh;
	NazilliHotel nh;
	
	
	public Customer() {
		id = 0;
		reservationName = null;
		numOfPerson = 0;
		numOfDay = 0;
	}
	
	public Customer(int id,String reservationName,int numOfPerson,int numOfDay) {
		this.id = id;
		this.reservationName = reservationName;
		this.numOfPerson = numOfPerson;
		this.numOfDay = numOfDay;
	}

	public int getId() {
		return id;
	}
	
	

	
	public String getReservationName() {
		return reservationName;
	}

	public void getInput() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the ID : ");
		id = input.nextInt();
		input.skip("\\R");
		System.out.println("Enter the reservation name : ");
		reservationName = input.nextLine();
		System.out.println("How many person : ");
		numOfPerson = input.nextInt();
		System.out.println("How many day : ");
		numOfDay = input.nextInt();
	}

	@Override
	public String toString() {
		return "Customer \nId = " + id + "\nReservation Name = " + reservationName + "\nNumber of Person = " + numOfPerson
				+ "\nNumber of Days = " + numOfDay + "\n";
	}
}

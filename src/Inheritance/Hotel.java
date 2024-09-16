package Inheritance;

import java.util.Scanner;

import Interface.CosplayActivity;

public abstract class Hotel implements CosplayActivity {
	public static final int dailyPrice = 500;
	protected int numOfRooms;
	protected int luxuryRate;
	protected double price;
	protected String theme;
	
	public Hotel() {
		numOfRooms = 0;
		luxuryRate = 0;
		price = 0.0;
		theme = null;
	}
	
	public Hotel(int numOfRooms, int luxuryRate, double price, String theme) {
		this.numOfRooms = numOfRooms;
		this.luxuryRate = luxuryRate;
		this.price = price;
		this.theme = theme;
	}
	
	
	
	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public abstract void calculateCharge();


	public void getInput() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of rooms : ");
		numOfRooms = input.nextInt();
	}

	@Override
	public String toString() {
		return "Hotel \nNumber of Rooms = " + numOfRooms + "\nLuxury Rate = " + luxuryRate + "\nPrice = " + price + " TL" + "\nTheme of Activity = "
				+ theme;
	}


}

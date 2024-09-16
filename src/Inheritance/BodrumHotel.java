package Inheritance;

import java.util.Scanner;

public class BodrumHotel extends Hotel{

	private boolean sauna;
	private boolean boatTour;
	
	public BodrumHotel() {
		super();
		sauna = false;
		boatTour = false;
	}
	
	public BodrumHotel(int numOfRooms, int luxuryRate, double price, String theme, boolean sauna, boolean boatTour) {
		super(numOfRooms, luxuryRate, price, theme);
		this.sauna = sauna;
		this.boatTour = boatTour;
	}
	
	
	
	public void getInput() {
		Scanner input = new Scanner(System.in);
		super.getInput();
		System.out.println("Is sauna included ? (True/False)");
		sauna = input.nextBoolean();
		System.out.println("Is boatTour included ? (True/False)");
		boatTour = input.nextBoolean();
		luxuryRate = 7;
	}
	
	@Override
	public void calculateCharge() {
	
		price  = numOfRooms*luxuryRate*dailyPrice;
			if(sauna)
				price += 300;
			if(boatTour) {
				price += 500;
			}
			price *= numOfRooms;
			
		}
	
	@Override
	public void themeOfActivity() {
		Scanner input = new Scanner(System.in);
		System.out.println("What is the theme of cosplay event ? ");
		theme = input.nextLine();
	}

	@Override
	public String toString() {
		return super.toString() + "\nsauna=" + sauna + "\nboatTour=" + boatTour + "\nBodrum Hotel\n-------------------------------\n";
	}
	
}

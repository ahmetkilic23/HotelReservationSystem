package Inheritance;

import java.util.Scanner;

public class FethiyeHotel extends Hotel {
	private boolean extremeSports;
	private boolean spaMassage;
	
	public FethiyeHotel() {
		super();
		extremeSports = false;
		spaMassage = false;
	}
	
	public FethiyeHotel(int numOfRooms,int luxuryRate, double price, String theme, boolean extremeSports, boolean spaMassage) {
		super(numOfRooms, luxuryRate, price, theme);
		this.extremeSports = extremeSports;
		this.spaMassage = spaMassage;
	}

	
	public void getInput() {
		super.getInput();
		Scanner input = new Scanner(System.in);
		System.out.println("Is extreme sports is included (True/False)");
		extremeSports = input.nextBoolean();
		System.out.println("Is spa massage included ? (True/False)");
		spaMassage = input.nextBoolean();
		luxuryRate = 5;
	}
	
	
	@Override
	public void calculateCharge() {
		
		price = numOfRooms*luxuryRate*dailyPrice;
		if(extremeSports)
			price += 1200;
		if(spaMassage) {
			price += 400;
		}
		
	}
	
	@Override
	public void themeOfActivity() {
		Scanner input = new Scanner(System.in);
		System.out.println("What is the theme of cosplay event ? ");
		theme = input.nextLine();
	}

	@Override
	public String toString() {
		return super.toString() + "\nExtreme Sports = " + extremeSports + "\nSpa Massage = " + spaMassage + "\nFethiye Hotel\n-------------------------------\n";
	}
}

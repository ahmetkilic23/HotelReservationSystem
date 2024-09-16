package Inheritance;

import java.util.Scanner;

public class NazilliHotel extends Hotel{
	private boolean gym;
	private boolean childClub;
	
	public NazilliHotel() {
		super();
		gym = false;
		childClub = false;
	}
	
	public NazilliHotel(int numOfRooms,int luxuryRate, double price, String theme, boolean gym, boolean childClub) {
		super(numOfRooms, luxuryRate, price, theme);
		this.gym = gym;
		this.childClub = childClub;
	}

	
	public void getInput() {
		Scanner input = new Scanner(System.in);
		super.getInput();
		System.out.println("Is gym included (with Enes Cakmak) ? (True/False)");
		gym = input.nextBoolean();
		System.out.println("Is childClub included ? (True/False)");
		childClub = input.nextBoolean();
		luxuryRate = 3;
	}

	@Override
	public void calculateCharge() {
		
		price  = numOfRooms*luxuryRate*dailyPrice;
			if(gym)
				price += 400;
			if(childClub) {
				price += 700;
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
		return super.toString() + "\nGYM = " + gym + "\nChild Club = " + childClub + "\nNazilli Hotel\n--------------------------------\n";
	}
}

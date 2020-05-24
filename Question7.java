package assignments.day_4;

public class Question7 {

	public static void main(String[] args) {
		
		int price= 50; // Cost an item between 25 cents and 1 dollar, in 5-cent increments (25, 30, 35, . . . , 90, 95, or 100)
		int singleDollarBill=100;
		int change=singleDollarBill-price;
		int quarters=change/25; 		   //quarters= 25 cents
		int dimes=(change%25)/10; 		   //dime= 10 cents
		int nickles = ((change%25)%10)/5;  //nickles= 5 cents
		System.out.println("Your change is " + quarters + " quarters, " + dimes + " dimes, and " + nickles + " nickles");

	}

}

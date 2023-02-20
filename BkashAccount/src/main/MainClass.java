package main;

public class MainClass {
	public static void main(String args[]) {
		BkashAccount uOne = new BkashAccount();
		BkashAccount uTwo = new BkashAccount();
		
		uOne.name = "Farhad";
		uOne.balance = 500;
		uTwo.name = "Foysal";
		uTwo.balance = 500;
		
		uOne.SendMoney(uTwo, 600f);
		uTwo.SendMoney(uOne, 600f);
		
		System.out.println("Name One: " + uOne.balance);
		System.out.println("Name Two: " + uTwo.balance);
		
		uOne.SendMoney(uTwo, 300f);
		uTwo.SendMoney(uOne, 200f);

		System.out.println("\nAfter SendMoney \nName One: " + uOne.balance);
		System.out.println("Name Two: " + uTwo.balance);
	}
}

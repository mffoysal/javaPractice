package main;

public class BkashAccount {
	String id;
	String phone;
	String name;
	String pin;
	float balance;
	
	void SendMoney(BkashAccount a, float amount) {
		if(balance < amount) {
			System.out.println("Insufficant balance");
		}else {
			balance-=amount;
			a.balance+=amount;
		}
	}
	
}

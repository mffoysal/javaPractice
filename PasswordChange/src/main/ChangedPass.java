package main;
import java.util.Scanner;

public class ChangedPass {
	String id;
	String name;
	String phone;
	String mail;
	int pass;
	
	int changedPassword() {
		Scanner obj = new Scanner(System.in);
		
		System.out.print("Enter the new password: ");
		pass = obj.nextInt();
		return pass;
		
	}
	
}

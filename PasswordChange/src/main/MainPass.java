package main;

public class MainPass {
	public static void main(String args[]) {
		
		ChangedPass uOne = new ChangedPass();
		uOne.name = "Farhad Foysal";
		uOne.phone = "01585855075";
		uOne.pass = 123456;
		
		System.out.println("Updated Password is " + uOne.changedPassword());
		
		System.out.print("Name : " + uOne.name + "\nPhone : " + uOne.phone + "\nPassword : " + uOne.pass);
		
	}
}

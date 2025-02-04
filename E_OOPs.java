package p_W3;

import java.util.Scanner;

public class E_OOPs {
	
	private int bal = 5000;
	
	public int Withdraw(int a) {
		if(bal >= a) {
			return bal -= a;
		}else {
			System.out.println("you have less amount in your bank account");
		}
		return bal;
	}
	
	public int Deposit(int a) {
		return bal += a;
	}
	
	public static void main(String[] args) {
		E_OOPs obj = new E_OOPs();
		Scanner s1 = new Scanner(System.in);
		boolean t=true; 
		do {
		System.out.println("Enter you choice: " );
		System.out.println("press 1 for Withdraw: ");
		System.out.println("press 2 for Deposit: ");
		int ch = s1.nextInt(); 
		System.out.println("Enter the Amount: ");
		int amt = s1.nextInt();
		
		switch (ch) {
		case 1: {
			System.out.println(obj.Withdraw(amt));
			break;
		}
		case 2: {
			System.out.println(obj.Deposit(amt));
			break;
		}
		default:
			System.out.println("Enter the right choice: ");
		}
	
		System.out.println("try again = y || exit to press = x");
		char c= s1.next().charAt(0);
		if(c == 'y') {
			t = true;
		}else if(c == 'x'){
			t = false;
		}
		}while(t);
		System.out.println("thank you for visiting to my bank....('-') better luck next time");
		s1.close();
	}
	
}

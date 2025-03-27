package pck1;

import java.util.Scanner;

public class prg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first,second,third=0;
		int scnd;
		Scanner num = new Scanner(System.in);		
		System.out.println("Please enter first number :");
		first=num.nextInt();		
		System.out.println("Please enter second number :");
		second=num.nextInt();		
		System.out.println("Please enter third number :");
		third=num.nextInt();		
	
		if((second<first && first<third)||(third<first && first<second)) {
			scnd=first;
		}
		else if((first<second && second<third)||(third<second && second<first)) {
			scnd=second;
		}
		else {
			scnd=third;
		}
		System.out.println("The second smallest number is "+scnd);
	}

}

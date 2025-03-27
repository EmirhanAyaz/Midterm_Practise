package pck1;

import java.util.Scanner;

public class prg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ytu=0;
		Scanner s = new Scanner(System.in);	
		System.out.println("Please enter a number");
		ytu=s.nextInt();
		
		for(int i=1 ; i<=ytu ; i++) {
			for(int j=1 ; j<=i ; j++) {
				if((i+j)%2==0) {
					System.out.print(" 1 ");
				}
				else {
					System.out.print(" 0 ");
				}
				
			}
			
			System.out.println(" ");
		}
	
	}

}

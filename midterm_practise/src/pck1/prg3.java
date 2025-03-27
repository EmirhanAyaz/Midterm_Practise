package pck1;

import java.util.Scanner;

public class prg3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  max=0, even = 0 , odd  = 0 ;
		double avg=0 ,sum=0 , a  ;
		Scanner s = new Scanner(System.in);
		System.out.println("How many numbers do you want to add ? ");
		a=s.nextInt();
		for(int i = 1 ; i <= a ; i++ ) {
			Scanner number= new Scanner(System.in);
			System.out.println("Enter a number "+i+" : ");
			int num = number.nextInt();
			sum += num;
			if(num%2==0) {
				even++;
			}
			else {
				odd++;
			}	
		if(max<num) {
			max=num;
		}
		else {
			max=max;
		}
		}
		avg=sum/a;
	System.out.println("Sum of the numbers is " +sum);
	System.out.println("Maximum value of numbers is "+max);
	System.out.println("Average of numbers is "+avg);
	System.out.println("Number of odd numbers is "+odd);
	System.out.println("Number of even numbers is "+even);
	
	
	}
	

}

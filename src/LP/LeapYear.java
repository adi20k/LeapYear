package LP;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Year");
		int n=sc.nextInt();
		if(n>0 && (String.format("%d",n)).length()==4){
			if(((n%4==0) && (n%100!=0)) || (n%400==0)) {
				System.out.println(n+" is Leap Year");
			}else
				System.out.println(n+ " not a Leap Year");
		}else
			System.out.println("Invalid Input");

	}

}

package GreensTech.FirstMaven;

import java.util.Scanner;

public class ReverseString {
	
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Enter the string to be reversed:");
		
		String str= scan.nextLine();
		
		StringBuilder origstr = new StringBuilder(str);
		
		StringBuilder revstr = new StringBuilder(origstr).reverse();
		
		System.out.println(revstr);
		
		
	}

}

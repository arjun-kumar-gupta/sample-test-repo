package Assignment;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		

		String S, rev = "";
	    Scanner s = new Scanner(System.in);

	    System.out.println("Enter a string to reverse");
	    S = s.nextLine();

	    int length = S.length();

	    for (int i = length - 1 ; i >= 0 ; i--)
	    
	      rev = rev + S.charAt(i);

	    System.out.println("Reverse of the string: " + rev);
	  }
	}
	



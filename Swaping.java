package Assignment;

import java.util.Scanner;

public class Swaping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c;
Scanner s= new Scanner(System.in);
System.out.println("Enter Two Number: ");
int a=s.nextInt();
 int b=s.nextInt();
System.out.println(a + " " + b + " are the Two Numbers to be swapped");
c=a;
a=b;
b=c;

System.out.println(a + " " + b + " are the Swapped Numbers");
	}

}

package Assignment;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s= new Scanner(System.in);
System.out.println("Enter a Number: ");
int number=s.nextInt();
if(number % 2 == 0 )
{
	System.out.println(number + " is EVEN");
}
else
{
	System.out.println(number + " is ODD");
}
	}

}

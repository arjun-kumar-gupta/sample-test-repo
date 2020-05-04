package Assignment;

import java.util.Scanner;

public class OddSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int range,sum=0;
Scanner s= new Scanner(System.in);
System.out.println("Enter the Range:");
range=s.nextInt();
for(int i=1;i<=range;i++)
{
	if(i % 2 != 0)
	{
		sum=sum+i;
	}
}
 System.out.println("Sum of all odd number from 1 to " + range +  " is " + sum);
}

}

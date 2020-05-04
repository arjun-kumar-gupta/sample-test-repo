package Assignment;

import java.util.Scanner;

public class Series1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=0;
Scanner s= new Scanner (System.in);	
int range= s.nextInt();

for(int i=2;i<=range;i=i+2)
{
	x=i*i;
	System.out.print(x +" ");
}
 
	}

}

package Assignment;

import java.util.Scanner;

public class Series2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
		int range, a = 1, b = 1,sum=0;
        Scanner s= new Scanner (System.in);
        
        range=s.nextInt();
        
        for (int i = 1; i <= range; ++i)
        {
            System.out.print(a + " ");

           sum = a + b;
            a = b;
            b = sum;
	}
	}
}
	


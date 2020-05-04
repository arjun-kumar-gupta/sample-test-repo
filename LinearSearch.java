package Assignment;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i, num, item, array[];
	      
	      Scanner input = new Scanner(System.in);
	      System.out.println("Enter number of elements:");
	      num = input.nextInt(); 
	     
	      array = new int[num]; 
	      System.out.println("Enter " + num + " integers");
	      
	      for (i = 0; i < num; i++)
	        array[i] = input.nextInt();

	      System.out.println("Enter the search value:");
	      item = input.nextInt();

	      for ( i = 0; i< num; i++)
	      {
	         if (array[i] == item) 
	         {
	           System.out.println(item+" is Found at location "+(i+1));
	           
	           break;
	         }
	      }
	      if (i== num)
	      {
	        System.out.println(item + " Not Found in array.");
	   }
	}
	}



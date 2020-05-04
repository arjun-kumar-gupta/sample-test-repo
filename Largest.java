package Assignment;

import java.util.Scanner;

public class Largest {

	public static void main(String[] args) {
		
		int arr[],num;
		Scanner s= new Scanner (System.in);
		System.out.println("Enter number of elements:");
	      num = s.nextInt(); 
	   
		arr = new int[num];
		System.out.println("Enter " + num + " integers");
		
		for (int i = 0; i < num; i++)
	        arr[i] = s.nextInt();
		int largest = arr[0];
		int secondLargest = arr[0];
		
		System.out.println("The given array is:" );
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		for (int i = 0; i < arr.length; i++) {
 
			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
 
			} else if (arr[i] > secondLargest) {
				secondLargest = arr[i];
 
			}
		}
		
		System.out.println("\n largest number is:" + largest);
		 
		System.out.println("\nSecond largest number is:" + secondLargest);
		
 
	}
	}



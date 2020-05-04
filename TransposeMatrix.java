package Assignment;

import java.util.Scanner;

public class TransposeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b, c, d;

	    Scanner in = new Scanner(System.in);
	    System.out.println("Enter the number of rows and columns of matrix");
	    a = in.nextInt();
	    b = in.nextInt();

	    int matrix[][] = new int[a][b];

	    System.out.println("Enter elements of the matrix");

	    for (c = 0; c < a; c++)
	      for (d = 0; d < b; d++)
	        matrix[c][d] = in.nextInt();

	    int transpose[][] = new int[b][a];

	    for (c = 0; c < a; c++)
	      for (d = 0; d < b; d++)
	        transpose[d][c] = matrix[c][d];

	    System.out.println("Transpose of the matrix:");

	    for (c = 0; c < b; c++)
	    {
	      for (d = 0; d < a; d++)
	        System.out.print(transpose[c][d]+"\t");

	      System.out.print("\n");
	    }
	  }
	}
package Assignment;

import java.util.Scanner;

public class PrimeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp=0,sum=0;
     Scanner s= new Scanner(System.in);
     System.out.println("Enter the Range:");
     int range= s.nextInt();
     System.out.println("Prime Number are: ");
     for(int i=1;i<=range;i++) {
    	 
    	 for(int j=2;j<=i-1;j++)
    	 {
    		 if(i %j ==0)
    		 {
    			 temp=temp+1;
    		 }
    	 }
    	  
    	 if((temp==0) && (i!=1))
    	 {
    		 sum=sum+i;
    		 System.out.print(  i +" ");
    		 
    	 }
    	 else
    	 {
    		 temp=0; 
    	 }
     }
     
     
    
     
	}

}

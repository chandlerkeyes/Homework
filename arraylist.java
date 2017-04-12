package chandelre;

	import java.util.ArrayList;
	import java.util.Scanner;

	public class arraylist
	{
	
	    public static void main(String args[])
	    {
	    	int i;
	    	int j;
	    Scanner keyboard = new Scanner(System.in);
	    int[] array1 = new int[4000];
	    
	    System.out.println("Enter anywhere from 1 to 4000 integers termminate by 0");
	  for ( i=0;i<=3999;i++)
	  { int x=keyboard.nextInt();
	  		if(x==0)
	  		{
	  			break;
	  		}
	  		else
	  		{
	  			array1[i]=x;
	  		}
		  
	  }
	for(j=0; j<=i-1; j++)
	{
	System.out.println("This is forward" +array1[j]);
	}
	for(j=i-1; j>-1; j--)
	{
	 System.out.println("This is backward" +array1[j]);
	}       
	     
	}  
	}    
	    

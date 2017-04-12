import java.util.ArrayList;
import java.util.Scanner;

public class arraylist
{
    public static void main(String args[])
    {
    Scanner keyboard = new Scanner(System.in);
    int[] array1 = new int[4000];
    int i;
    int j;
    System.out.println("Enter anywhere from 1 to 4000 integers termminate by 0");
    for(i=0; i <3999; i++) {
        
        if(keyboard.nextInt()==0)
        {
        break;
        }
        else
        {
            array1[i]=keyboard.nextInt();
        }
}
for(j=0; j<=i; j++)
{
System.out.println("This is forward" +array1[j]);
for(j=i; j>=0; j--)
{
 System.out.println("This is backward" +array1[j]);
}       
}       
}  
}    
         
    
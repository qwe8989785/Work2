package work;
import  java.lang.*;
public class work1  
{         
	public static void main(String args[])
    {
		boolean isPrime ;
		int printtime = 1;
		System.out.print(2+"\t");
		for(int i=2;i<=100;i++)
		{
		   isPrime=true;
		   
		   for(int j=2;j<Math.sqrt(i)+1;j++)
		   {
		    if(i%j==0 )
		    {
			     isPrime=false;
			     break;
		    }
		   }
		   
		   if(isPrime)
		   {
				printtime ++;
				if(printtime == 5)
				{
					System.out.print(i+"\n");
					printtime = 0;
				}
				else
				{
			    System.out.print(i+"\t");
				}
		   }
		   
		}
    
    }
}
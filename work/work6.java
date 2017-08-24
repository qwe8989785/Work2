package work;
import  java.lang.*;
import java.util.*;
public class work6
{         
	
	public static void main(String args[])
    {
        CA X = new CA();
        CB YA = new CB();
        YA.output(X.prime(16));
    } 
}
class CA
{
    public int[] prime(int x)
    {
    	boolean isPrime ;
    	int primeplace[] = new int[x+1];
    	if(x >= 2)
    	primeplace[0] = 2;
    	int y = 1;
    	for(int i=2;i<=x;i++)
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
			   primeplace[y] = i;
			   y++;
		   }
		   
		}
    	return primeplace;
    }
}
class CB extends CA
{		
	public void output(int[] x)
	{
		for(int i=0;i<x.length;i++)
		{
			if(x[i] == 0)
			{
				break;
			}
			System.out.print(x[i]+"\t");
		}
	}
}
package work;
import  java.lang.*;
import java.util.*;
public class work4
{         
	
	public static void main(String args[])
    {
		System.out.print(rdar());
    }
	public static int rdar()
	{
		int x,y = 0;
		for(int i=0;i<100;i++)
		{
			x = (int) (Math.random()*1000+1);
			y = y + x;
		}
		return y / 100;
	}
}
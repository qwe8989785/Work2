package work;
import  java.lang.*;
import java.util.*;
public class work3  
{         
	
	public static void main(String args[])
    {
		int i;
		int Money[][];
		Money = new int[8][];
		for(i=0;i<8;i++)
		{
			Money[i] = new int[7-i];
		}
		Money[0][0] = 30;
		Money[0][1] = 160;
		Money[0][2] = 290;
		Money[0][3] = 700;
		Money[0][4] = 1080;
		Money[0][5] = 1350;
		Money[0][6] = 1490;
		String Station[] = new String[]{"台北","板橋","桃園","新竹","台中","嘉義","台南","左營"};
		System.out.print("\t");
		for( i = 0 ; i < 6 ; i++)
		{
			Money[1][i]	= Money[0][i+1] - Money[0][0];
		}
		for( i = 0; i < 5 ; i++)
		{
			Money[2][i]	= Money[1][i+1] - Money[1][0];
		}
		
		for( i = 0; i < 4 ; i++)
		{
			Money[3][i]	= Money[2][i+1] - Money[2][0];
		}
		
		for( i = 0; i < 3 ; i++)
		{
			Money[4][i]	= Money[3][i+1] - Money[3][0];
		}
		
		for( i = 0; i < 2 ; i++)
		{
			Money[5][i]	= Money[4][i+1] - Money[4][0];
		}
		
		for( i = 0; i < 1 ; i++)
		{
			Money[6][i]	= Money[5][i+1] - Money[5][0];
		}
		
		for(i=0;i<8;i++)
		{
			System.out.print(Station[7-i]+"\t");
		}
		
		System.out.print("\n");
		System.out.print(Station[0]);
		System.out.print("\t");
		for( i = 0 ; i < 7 ; i++)
		{
			System.out.print(Money[0][6-i]+"\t");
		}
		System.out.print(" -");
		
		System.out.print("\n");
		System.out.print(Station[1]);
		System.out.print("\t");
		for( i = 0 ; i < 6 ; i++)
		{
			System.out.print(Money[1][5-i]+"\t");
		}
		System.out.print(" -");
		
		System.out.print("\n");
		System.out.print(Station[2]);
		System.out.print("\t");
		for( i = 0 ; i < 5 ; i++)
		{
			System.out.print(Money[2][4-i]+"\t");
		}
		System.out.print(" -");
		
		System.out.print("\n");
		System.out.print(Station[3]);
		System.out.print("\t");
		for( i = 0 ; i < 4 ; i++)
		{
			System.out.print(Money[3][3-i]+"\t");
		}
		System.out.print(" -");
		
		System.out.print("\n");
		System.out.print(Station[4]);
		System.out.print("\t");
		for( i = 0 ; i < 3 ; i++)
		{
			System.out.print(Money[4][2-i]+"\t");
		}
		System.out.print(" -");
		
		System.out.print("\n");
		System.out.print(Station[5]);
		System.out.print("\t");
		for( i = 0 ; i < 2 ; i++)
		{
			System.out.print(Money[5][1-i]+"\t");
		}
		System.out.print(" -");
		
		System.out.print("\n");
		System.out.print(Station[6]);
		System.out.print("\t");
		System.out.print(Money[6][0]+"\t");
		System.out.print(" -");
		
		System.out.print("\n");
		System.out.print(Station[7]);
		System.out.print("\t");
		System.out.print(" -");
    }
}
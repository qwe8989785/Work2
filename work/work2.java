package work;
import  java.lang.*;
import java.util.*;
public class work2  
{         
	
	public static void main(String args[])
    {
		int Student ;
		int Grades[];
		int PrintT = 0;
		int Grades2[] = new int[11];
		Scanner scan = new Scanner(System.in);
		System.out.print("�п�J�ǥͤH��(�̦h50�H): ");
		Student = scan.nextInt();
		if(Student > 50)
		{
			System.out.println("�H�ƶW�L�F");
		}
		else
		{
			System.out.print("�п�J�ǥͤ���");
			Grades = new int[Student];
			for(int i = 1 ; i <= Student ; i++)
			{
				System.out.print("��"+ i +"�H :");
				Grades[i-1] = scan.nextInt();
			}
			for(int x = 0; x < Student ; x++ )
			{
				switch(Grades[x]/10)
				{
					case 0:
						Grades2[0]++;
						break;
					case 1:
						Grades2[1]++;
						break;
					case 2:
						Grades2[2]++;
						break;
					case 3:
						Grades2[3]++;
						break;
					case 4:
						Grades2[4]++;
						break;
					case 5:
						Grades2[5]++;
						break;
					case 6:
						Grades2[6]++;
						break;
					case 7:
						Grades2[7]++;
						break;
					case 8:
						Grades2[8]++;
						break;
					case 9:
						Grades2[9]++;
						break;
					case 10:
						Grades2[10]++;
						break;
				}
			}
			System.out.println("======�ǥͦ��Z������======");
			
			System.out.print("100:");
			for(PrintT = 0 ; PrintT < Grades2[10];PrintT++)
			{
				System.out.print("=");
			}
			System.out.print("\n");
			
			System.out.print("90~99:");
			for(PrintT = 0 ; PrintT < Grades2[9];PrintT++)
			{
				System.out.print("=");
			}
			System.out.print("\n");
			
			System.out.print("80~89:");
			for(PrintT = 0 ; PrintT < Grades2[8];PrintT++)
			{
				System.out.print("=");
			}
			System.out.print("\n");
			
			System.out.print("70~79:");
			for(PrintT = 0 ; PrintT < Grades2[7];PrintT++)
			{
				System.out.print("=");
			}
			System.out.print("\n");
			
			System.out.print("60~69:");
			for(PrintT = 0 ; PrintT < Grades2[6];PrintT++)
			{
				System.out.print("=");
			}
			System.out.print("\n");
			
			System.out.print("50~59:");
			for(PrintT = 0 ; PrintT < Grades2[5];PrintT++)
			{
				System.out.print("=");
			}
			System.out.print("\n");
			
			System.out.print("40~49:");
			for(PrintT = 0 ; PrintT < Grades2[4];PrintT++)
			{
				System.out.print("=");
			}
			System.out.print("\n");
			
			System.out.print("30~39:");
			for(PrintT = 0 ; PrintT < Grades2[3];PrintT++)
			{
				System.out.print("=");
			}
			System.out.print("\n");
			
			System.out.print("20~29:");
			for(PrintT = 0 ; PrintT < Grades2[2];PrintT++)
			{
				System.out.print("=");
			}
			System.out.print("\n");
			
			System.out.print("10~19:");
			for(PrintT = 0 ; PrintT < Grades2[1];PrintT++)
			{
				System.out.print("=");
			}
			System.out.print("\n");
			
			System.out.print("0~9:");
			for(PrintT = 0 ; PrintT < Grades2[0];PrintT++)
			{
				System.out.print("=");
			}
			System.out.print("\n");
			
		}
    }
    
}
package work;
import  java.lang.*;
import java.util.*;
public class work5
{         
	
	public static void main(String args[])
    {
		CPersonAccount obj = new CPersonAccount(); 
		Scanner scan2 = new Scanner(System.in);
		char runFunc='d'; 
		while(runFunc!='q') 
		{ 
			System.out.print("�п�ܧ@�~"); 
			System.out.print("(i=��J��� s=�̤��~��Ƨ� d=��ܸ�� q=���}):"); 
			runFunc = scan2.nextLine().charAt(0);
	        switch (runFunc)
	        {
	        	case 'i': 
	        	{
		        	obj.inputData(); 
		        	break;
	        	}
	        	case 's': 
	        	{
	        		obj.sortBySalary(); 
	        		break;
	        	}
	        	case 'd': 
	        	{
		        	obj.displayData(); 
		        	break;
	        	}
	        	default: 
	        	{
	        		 break;
	        	}
	        }
		}
  
    } 
}
class CPersonData
{
	public String name;  
    public String degree;
    private String p_id;  
    private int salary;
	public void CPersonData()
    {
        salary = 0;
        name = "~~~~~~~~" ;
        degree = "~~~~~~~~" ;
        p_id = "~~~~~~~~" ;
    }
    public void CPersonData(String a,String b,String c,int d)
    {
    	setName(a); 
    	setDegree(b); 
    	setP_ID(c); 
    	setSalary(d); 
    }
    
    public String getName() 
    { 
    	return name; 
    } 

	public void setName(String name) 
	{ 
		name = name; 
	} 

	public String getDegree() 
	{ 
		return degree; 
	} 

	public void setDegree(String degree) 
	{ 
		degree = degree; 
	} 

	public String getP_ID() 
	{ 
		return p_id; 
	} 

	public void setP_ID(String pID) 
	{ 
		p_id = pID; 
	} 

	public int getSalary() 
	{ 
		return salary; 
	} 

	public void setSalary(int salary)
	{ 
		salary = salary; 
	} 
}
class CPersonAccount
{
	private CPersonData PersonArr[] = new CPersonData[5];
	Scanner scan = new Scanner(System.in);
	int times = 0;
	public void inputData()
	{
		
		System.out.print("�п�J�H�Ƹ��:");
		for(times=0;times<PersonArr.length;times++)
		{
			System.out.println("�п�J�m�W: "); 
			PersonArr[times].setName(scan.next()); 
			System.out.println("�п�J¾�O: "); 
			PersonArr[times].setDegree(scan.next()); 
			System.out.println("�п�J�����Ҧr��: "); 
			PersonArr[times].setP_ID(scan.next()); 
			System.out.println("�п�J���~��: "); 
			PersonArr[times].setSalary(scan.nextInt()); 
		}
	}
	public void displayData()
	{
		for (CPersonData r : PersonArr) 
		{ 
			System.out.println("�m�W :" + r.getName()); 
			System.out.println("¾�O :" + r.getDegree()); 
			System.out.println("���~�� :" + r.getSalary()); 
		} 
	}
	public void sortBySalary() 
	{ 
		CPersonData tmp; 
		for (int i = 0; i < PersonArr.length; i++) 
		{ 
			if (PersonArr[i].getSalary() > PersonArr[i + 1].getSalary()) 
			{ 
				tmp = PersonArr[i]; 
				PersonArr[i] = PersonArr[i + 1]; 
				PersonArr[i + 1] = tmp; 
			} 
		} 
	} 
}
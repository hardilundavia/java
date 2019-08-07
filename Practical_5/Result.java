import java.util.*;
interface Practical
{
	void getpracmarks();
}
interface External extends Practical
{
	void getextMarks();
	void gettw();
}
class Sessionalexam
{
	int marks[][],i;
	public static int sub;
	Sessionalexam()
	{
		sub=i;
		marks=new int[3][sub];
	}
	void getMarks(int ses)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Subject "+i+" Marks of sessional "+ses+" : ");
		for(int i=0;i<sub;i++)
		{
			marks[ses][i]=sc.nextInt();
		}
	}
	float getTotal(int ses)
	{
		float tot=0.0f;
		for(int i=0;i<sub;i++)
		{
			tot=tot+marks[ses][i];
		}
		return tot;
	}
	public void showmarks(int ses)
	{
		for(int i=0;i<sub;i++)
		{
			System.out.println("The marks of sessional" + ses+" is : "+marks[ses][i]);
		}
	}
}
class Resultdemo extends Sessionalexam implements External
{
	public void getpracmarks()
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter Python pracmarks  : ");
		int py=s1.nextint();
		System.out.println("Enter JAVA pracmarks  : ");
		int jv=s1.nextint();
		System.out.println("Enter ISP pracmarks  : ");
		int isp=s1.nextint();
		System.out.println("Enter RTI pracmarks  : ");
		int rti=s1.nextint();
	}
}
class Result
{
	public static void main(String args[])
		{
			int tot,rn,ss;
			String nm;
			Sessionalexam se=new Sessionalexam();
			Sessionalexam se1=new Sessionalexam();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Number of student");
			int n=sc.nextInt();
			for(int i=0;i<n;i++)
			{
				System.out.println("Enter Student Rollno : ");
				rn=sc.nextInt();
				System.out.println("Enter Student name : ");
				nm=sc.next();
				System.out.println("Enter sessionanal exam number : ");
				ss=sc.nextInt();
				se1.getMarks(ss);
				//se.getTotal(ss);
			}
			for(int i=0;i<n;i++)
			{
				System.out.println("Student no : "+rn);
				System.out.println("Student name : "+nm);
				System.out.println("Student Marks : "+rn);
				se1.showmarks(ss);
				se1.getTotal(ss);
				System.out.println("Total : "+tot);
			}
	}
}
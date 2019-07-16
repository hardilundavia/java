import java.util.Scanner;

class Sum
{
	int s1,s2,sum;

	void sum()
	{
		System.out.println("Enter only integer value");
		Scanner s=new Scanner(System.in);
		System.out.println("Enter s1 value : ");
		s1=s.nextInt();
		System.out.println("Enter s2 value : ");
		s2=s.nextInt();
		sum=s1+s2;
		System.out.println("Sum : "+sum);
	}

	void sum(int n1,int n2)
	{
		sum=n1+n2;
		System.out.println("Sum : "+ sum);
	}

	void sum(double d1,double d2)
	{
		double sm;
		sm=d1+d2;
		System.out.println("Sum : "+ sm);
	}

	void sum(int n1)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter s1 value : ");
		s1=s.nextInt();
		sum=s1+n1;
		System.out.println("Sum : "+ sum);
	}

	void sum(float f1,float f2)
	{
		float sm;
		sm=f1+f2;
		System.out.println("Sum : "+ sm);
	}

}

class Calc extends Sum
{
	public static void main(String arg[])
	{
		Sum obj=new Sum();
		obj.sum();
		Scanner s=new Scanner(System.in);
		System.out.println("\nTwo integer arguments\n");
		System.out.println("Enter s1 value : ");
		int s1=s.nextInt();
		System.out.println("Enter s2 value : ");
		int s2=s.nextInt();
		obj.sum(s1,s2);

		System.out.println("\nTwo double arguments\n");
		System.out.println("Enter s3 value : ");
		double s3=s.nextDouble();
		System.out.println("Enter s4 value : ");
		double s4=s.nextDouble();
		obj.sum(s3,s4);

		System.out.println("\none integer arguments\n");
		System.out.println("Enter s5 value : ");
		int s5=s.nextInt();
		obj.sum(s5);

		System.out.println("\nTwo float arguments\n");
		System.out.println("Enter s6 value : ");
		float s6=s.nextFloat();
		System.out.println("Enter s7 value : ");
		float s7=s.nextFloat();
		obj.sum(s6,s7);
	}
}
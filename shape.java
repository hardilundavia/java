import java.util.Scanner;
static final float pi=3.14f;
class circle
{
	//float pi=3.14,r;
	void area(float p,float f1)
	{
		float ar;
		Scanner s =new Scanner(System.in);
		ar=p*(f1*f1);
		System.out.println("Area of circle : " +ar);
	}
}

class triangle
{
	//float hf=0.5;
	void area(float h,float f1,float f2)
	{
		float ar;
		ar=h*f1*f2;
		System.out.println("Area of triangle : " +ar);
	}
}

class rectangle
{
	void area(float l,float b)
	{
		float ar;
		ar=l*b;
		System.out.println("Area of rectangle : " +ar);
	}
}

class shape
{
	public static void main(String arg[])
	{
		final static float pi=3.14f;
		circle obj=new circle();
		Scanner s=new Scanner(System.in);
		System.out.println("\nEnter r value\n");
		float r=s.nextFloat();
		obj.area(pi,r);

		//float hf=0.5;
		final static float hf=0.5f;
		triangle obj1=new triangle();
		//Scanner s=new Scanner(System.in);
		System.out.println("\nEnter height\n");
		float h=s.nextFloat();
		System.out.println("\nEnter Width \n");
		float w=s.nextFloat();
		obj1.area(hf,w,h);

		rectangle obj2=new rectangle();
		//Scanner s=new Scanner(System.in);
		System.out.println("\nEnter l value\n");
		float l=s.nextFloat();
		System.out.println("\nEnter b value\n");
		float b=s.nextFloat();
		obj2.area(l,b);
	}
}

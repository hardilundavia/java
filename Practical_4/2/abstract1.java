import java.util.*;

//this is parent class
abstract class Geometry
{
	abstract float perimeter();
}

/*this is subclass.
which name is Square class.
which have two methods perimeter()
it abstract method of Geometry*/
class Square extends Geometry
{
	public float perimeter()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter length : ");
		float l=s.nextFloat();
		return 4*l;
	}
}
/*this is subclass.
which name is Circle class.
which have two methods perimeter()
it abstract method of Geometry*/
class Circle extends Geometry
{

	public static final float pi=3.14f;
	public float perimeter()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter diameter : ");
		float d=s.nextFloat();
		return pi*d;
	}
}
//this is main method
class abstract1
{
	public static void main(String args[])
	{
		int ch;
		float a;
		//g and b are reference of Geometry class
		Geometry g=new Square();
		Geometry b=new Circle();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter choice : ");
		ch=s.nextInt();
		//if ch==1 then it call square class methods
		if(ch==1)
		{
			a=g.perimeter();
			System.out.println("Square : "+a);
		}
		//if ch==2 then it call circe class methods
		else if(ch==2)
		{
			a=b.perimeter();
			System.out.println("circle : "+a);
		}
		else
		{
			System.out.println("\nEnter choice between 1 and 2\n");
		}
	}
}
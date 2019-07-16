import java.util.Scanner;
public class Rect
{
	public static void main(String a[])
	{
		float ar;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter length value :");
		float l=s.nextFloat();
		System.out.println("Enter width value :");
		float b=s.nextFloat();
		ar=l*b;
		System.out.println("Area = " + ar);
	}
}
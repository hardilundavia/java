//import java.lang.object;
import java.util.*;
public class Str
{
	public static void main(String a[])
	{
		byte b[]={'H','A','R','I'};
		byte c[]={'H','E','L','L','O'};
		String s1=new String(b);
		String s2=new String(c);
		String s3=new String(b,1,3);
		String s4=new String(c,0,4);

		System.out.println("String 1 : "+s1);
		System.out.println("String 2 : "+s2);
		System.out.println("String 3 : "+s3);
		System.out.println("String 4 : "+s4);

		char s5=s1.charAt(3);
		System.out.println("String 5 : "+s5);

		int s6=s2.codePointAt(4);
		System.out.println("String 6 : "+s6);

		int s7=s2.codePointCount(1,3);
		System.out.println("String 7 : "+s7);

		int s8=s1.compareTo(s2);
		System.out.println("String 8 : "+s8);

		String s9=s1.concat(s2);
		System.out.println("String 9 : "+s9);

		boolean s10=s1.contains(s2);
		System.out.println("String 10 : "+s10);

		byte s11[]=s1.getBytes();
		System.out.println("String 11 : "+s11);

		int s12=s1.indexOf('R');
		System.out.println("String 12 : "+s12);

		int s13=s1.length();
		System.out.println("String 13 : "+s13);

		String s14=s1.replace('I','Y');
		System.out.println("String 14 : "+s14);
	}
}
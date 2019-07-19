import java.util.Scanner;
import java.lang.reflect.*;
class Employee
{
	public int no;
	protected String name;
	private float salary;

	Employee(int n,String nm,float sal)
	{
		this.no=n;
		this.name=nm;
		this.salary=sal;
	}

	void display()
	{
		System.out.println("Employee number : "+no);
		System.out.println("Employee name : "+name);
		System.out.println("Employee salary : "+salary);
	}
}

public class Reflectiond
{
	public static void main(String arg[])throws Exception
	{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter employee No : ");
			int n=s.nextInt();
			System.out.println("Enter employee Name : ");
			String nm1=s.next();
			System.out.println("Enter employee Salary : ");
			float sy=s.nextFloat();
			Employee obj=new Employee(n,nm1,sy);
			obj.display();

			Class employee = Employee.class;
			Field[] fields = employee.getDeclaredFields();
			for(Field oneField: fields)
			{
			  Field field = employee.getDeclaredField("no");
			  String getFieldName = oneField.getName();

  			  System.out.println("Field = " + getFieldName+"\ttype="+oneField.getType()+"\tAccess modifier : "+Modifier.toString(oneField.getModifiers()));
  			}
	}
}


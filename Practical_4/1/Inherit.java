//import java.utill.Scanner;
import java.util.*;

class Account
{
	private String custname;
	private int acno;
	private String type;
	private String branch;

	public void getCustInfo()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Name : ");
    	custname=s.next();

     	System.out.println("Enter account number : ");
    	acno=s.nextInt();

  	    System.out.println("Enter accont type : ");
    	type=s.next();

    	System.out.println("Enter Branch name : ");
    	branch=s.next();
	}

	public void displayInfo()
	{

		System.out.println("Name : "+custname+"\n");
		System.out.println("Account number : "+ acno+"\n");
		System.out.println("Acoount Type : "+type+"\n");
		System.out.println("Branch Name : "+branch+"\n");
	}
}

class Saving extends Account
{
	private float amount;
	private float year;
	public static final float rate=3.5f;
	private float calin;
	public void getSavingInfo()
	{
		getCustInfo();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  amount : ");
		amount=sc.nextFloat();

		System.out.println("Enter year : ");
		year=sc.nextFloat();

	}
	public void callntAmt()
	{
		calin=(amount*rate*year)/100;
	}

	public void displayInfo()
	{
		super.displayInfo();
		System.out.println("Interest  : "+calin+"\n");
	}
}

class FixedDeposit extends Account
{
	private float amount;
	private float year;
	private float rate;
	private float calin;
	public void getFDInfo()
	{
		getCustInfo();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  amount : ");
		amount=sc.nextFloat();

		System.out.println("Enter year : ");
		year=sc.nextFloat();

	}

	public void callntAmt()
	{
		if(year<=2)
		{
			rate=6.5f;
			calin=(amount*rate*year)/100;
		}
		else if(year >2 && year<=5)
		{
			rate=7.5f;
			calin=(amount*rate*year)/100;
		}
		else if(year>5 && year<=10)
		{
			rate=8.5f;
			calin=(amount*rate*year)/100;
		}
		else
		{
			rate=9f;
			calin=(amount*rate*year)/100;
		}
	}
	public void displayInfo()
	{
		super.displayInfo();
		System.out.println("Interest  : "+calin+"\n");
	}
}

class Inherit
{
	public static void main(String args[])
	{
		Saving sv=new Saving();
		FixedDeposit fd=new FixedDeposit();
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter  choice : ");
		int ch=s1.nextInt();
		if(ch==1)
		{
			sv.getSavingInfo();
			sv.callntAmt();
			sv.displayInfo();
		}
		else if(ch==2)
		{
			fd.getFDInfo();
			fd.callntAmt();
			fd.displayInfo();
		}
		else
		{
			System.out.println("\nEnter choice between 1 and 2\n");
		}
	}
}
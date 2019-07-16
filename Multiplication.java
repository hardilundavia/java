import java.util.Scanner;

public class Multiplication
{
	public static void main(String args[])
	{
		int r1,r2,c1,c2,k;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter First Matrix row : ");
		r1=s.nextInt();
		System.out.println("Enter First Matrix column : ");
		c1=s.nextInt();
		System.out.println("Enter second Matrix row : ");
		r2=s.nextInt();
		System.out.println("Enter second Matrix column : ");
		c2=s.nextInt();

		if(c1!=r2)
		{
			System.out.println("Matrix multiplication not possible");
			return;
		}

		int mat1[][]=new int[r1][c1];
		int mat2[][]=new int[r2][c2];
		int s1[][]=new int[r1][c2];

		System.out.println("Enter 1st Matrix : ");
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				System.out.println("mat1["+i+"]["+j+"] : ");
				mat1[i][j]=s.nextInt();
			}
		}

		System.out.println("Enter 2nd Matrix : ");
		for(int i=0;i<r2;i++)
		{
			for(int j=0;j<c2;j++)
			{
				System.out.println("mat2["+i+"]["+j+"] : ");
				mat2[i][j]=s.nextInt();
			}
		}
		System.out.println("\nMatrix Multiplication\n");
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				for(k=0;k<r1;k++)
				{
					s1[i][j]=s1[i][j]+mat1[i][k]*mat2[k][j];

				}
			}
		}

		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				System.out.print(s1[i][j]+"\t");
			}
			System.out.println();
		}

	}
}
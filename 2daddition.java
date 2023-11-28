import java.util.Scanner;
class twoDarray
{
public static void main(String ar[])
{

Scanner sc=new Scanner(System.in);
int arr[][]=new int[3][3];
int arr1[][]=new int[3][3];
System.out.println("enter the values for array");
for(int i=0;i<3;i++)// first array element from user
	{
		for(int j=0;j<3;j++)
		{
		arr[i][j]=sc.nextInt();
		}
	}
System.out.println(" values for array");	//display the all element
for(int i=0;i<arr.length;i++)
	{
		System.out.print("[ ");
		for(int j=0;j<arr[i].length;j++)
		{
System.out.print(arr[i][j] + " ");
		}
		System.out.println(" ] ");
	}
	
	System.out.println("enter the values for array1");// first array element from user
for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
		arr1[i][j]=sc.nextInt();
		}
	}
System.out.println(" values for array");	//display the all element
for(int i=0;i<arr1.length;i++)
	{
		System.out.print("[ ");
		for(int j=0;j<arr1[i].length;j++)
		{
System.out.print(arr1[i][j] + " ");
		}
		System.out.println(" ] ");
	}
	
	System.out.println(" sum of 2d array");	//sum of  2d array
for(int i=0;i<arr1.length;i++)
	{
		System.out.print("[ ");
		for(int j=0;j<arr1[i].length;j++)
		{
System.out.print(arr1[i][j] +arr[i][j] + " ");
		}
		System.out.println(" ] ");
	}
	
	
	
}
}
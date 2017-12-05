package Task1;

import java.util.Scanner;
class Sum_array
{
	int size;
	int arr[];
	public void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		size=sc.nextInt();
		arr=new int[size];
		System.out.println("Enter the elements in array:-");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		sc.close();
	}
	int arr1[]= {0};
	public void sum1()
	{
		for(int i=0;i<size;i++)
		{
			arr1[0]+=arr[i];
		}
	}
	public void display()
	{
		System.out.println(arr1[0]);
	}	
}

public class Array_sumofelements {

	public static void main(String[] args) {
		Sum_array s=new Sum_array();
		s.input();
		s.sum1();
		s.display();

	}

}

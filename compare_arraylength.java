package task;
import java.util.Scanner;
class compare{
	int size,size1;
	int arr[];
	int arr1[];
	public void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of first array");
		size=sc.nextInt();
		System.out.println("Enter the size of second array");
		size1=sc.nextInt();
		arr=new int[size];
		arr1=new int[size1];
		System.out.println("Enter the elements of first array");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the elements of second array");
		for(int i=0;i<size1;i++)
		{
			arr1[i]=sc.nextInt();
		}
		sc.close();
	}
	public void compare1()
	{
				if((arr.length)==(arr1.length))
				{
					System.out.println("both the arrays are equal");
				}
				else if((arr.length)<(arr1.length))
				{
					System.out.println("The second array is bigger");
					for(int i=0;i<size1;i++)
					{
						System.out.println(arr1[i]);
					}
				}
				else
					System.out.println("The first array is bigger");
				for(int i=0;i<size;i++)
				{
					System.out.println(arr[i]);
				}
	}
}
public class compare_arraylength {

	public static void main(String[] args) {
		compare c=new compare();
		c.input();
		c.compare1();
	}

}

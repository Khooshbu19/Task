//A program to take input from the user and determine if it is prime or not
package task;
import java.util.Scanner;
class prime{
	int num,f=0;
	public void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:-");
		num=sc.nextInt();
		sc.close();
	}
	public void compute()
	{
		for(int i=2;i<=(num/2);i++)
		{
			if(num % i == 0)
			{
				f=1;
				break;
			}
		}
	}
	public void display()
	{
		if(f == 0)
		{
			System.out.println("The number is prime");
		}
		else
		{
			System.out.println("The number is not prime");
		}
	}
}
public class Prime_number {

	public static void main(String[] args) {
		prime pr=new prime();
		pr.input();
		pr.compute();
		pr.display();
	}

}

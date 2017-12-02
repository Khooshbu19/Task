package task;
import java.util.Scanner;
class Factorial_1
{
	int f=1,num;
	public void input()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number:-");
	num=sc.nextInt();
	sc.close();
	}
	public void compute()
	{
		for(int i=num;i>0;i--)
		{
			f*=i;
		}
	}
	public void display()
	{
		System.out.println("The factorial of "+num+" is:- "+f);
	}
}
public class Factorial {
	public static void main(String[] args) {
		Factorial_1 fb=new Factorial_1();
		fb.input();
		fb.compute();
		fb.display();
		

	}

}

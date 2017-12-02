// A program to check if a name is palindrome or not
package task;
import java.util.Scanner;

class palindrome_1
{
	String str;
	int f=0;
	public void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the name :-");
		str=sc.nextLine();
		sc.close();
	}
	public void check()
	{
		for(int i=0,j=(str.length()-1);i<=(str.length()/2);i++,j--)
		{
			if (str.charAt(i) != str.charAt(j))
			{
				f=1;
				break;
			}
			else
			{
				f=0;
			}
		}
	}
	public void display()
	{
		if(f==0)
		{
			System.out.println("The String is palindrome");
		}
		else
		{
			System.out.println("The String is not palindrome");
		}
	}
}
public class Palindrome { 

	public static void main(String[] args) {
		palindrome_1 pr=new palindrome_1();
		pr.input();
		pr.check();
		pr.display();

	}

}



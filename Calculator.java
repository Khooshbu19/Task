package task;

import java.util.Scanner;

class Calculator_1 {
	public void input() {
		boolean ch;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter your choice\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");
			int c = sc.nextInt();
			switch (c) {
			case 1: {
				System.out.println("Enter the first number");
				int a = sc.nextInt();
				System.out.println("Enter the second number");
				int b = sc.nextInt();
				int r = a + b;
				System.out.println("the result is: " + r);
				break;
			}
			case 2: {
				System.out.println("Enter the first number");
				int a = sc.nextInt();
				System.out.println("Enter the second number");
				int b = sc.nextInt();
				int r = a - b;
				System.out.println("the result is: " + r);
				break;
			}
			case 3: {
				System.out.println("Enter the first number");
				int a = sc.nextInt();
				System.out.println("Enter the second number");
				int b = sc.nextInt();
				int r = a * b;
				System.out.println("the result is: " + r);
				break;
			}
			case 4: {
				System.out.println("Enter the first number");
				int a = sc.nextInt();
				System.out.println("Enter the second number");
				int b = sc.nextInt();
				int r = a / b;
				System.out.println("the result is: " + r);
				break;
			}
			default:
				System.out.println("invalid entry......");
				break;
			}
			System.out.println("Do you want to continue(write true) : ");
			ch = sc.nextBoolean();
		} while (ch == true);
		
		sc.close();
	}
}
public class Calculator {
	
	public static void main(String[] args) {
	
		Calculator_1 cl=new Calculator_1();
		cl.input();
	}

}

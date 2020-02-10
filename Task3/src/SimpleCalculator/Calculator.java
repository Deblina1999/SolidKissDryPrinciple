package SimpleCalculator;
import java.util.Scanner;

public class Calculator {
	public static void main(String s[])
	{
		Scanner sc = new Scanner(System.in);
		Add a = new Add();
		Subtract su = new Subtract();
		Multiply m = new Multiply();
		Divide d = new Divide();
		System.out.println("Enter two numbers");
		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		a.add(n1, n2);
		su.subtract(n1, n2);
		m.multiply(n1, n2);
		d.divide(n1, n2);
		sc.close();
	}

}

package SimpleCalculator;

public class Subtract implements Subtraction{
	public void subtract(double a,double b)
	{
		double result;
		result = a - b;
		System.out.println("Subtraction result of "+a+" and "+b+" is "+result);
	}

}

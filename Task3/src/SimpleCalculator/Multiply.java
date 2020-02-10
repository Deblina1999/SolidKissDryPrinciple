package SimpleCalculator;

public class Multiply implements Multiplication {
	public void multiply(double a,double b)
	{
		double result;
		result = a * b;
		System.out.println("Multiplication result of "+a+" and "+b+" is "+result);
	}

}

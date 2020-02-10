package SimpleCalculator;

public class Divide implements Division{
	public void divide(double a,double b)
	{
		double result;
		result = a / b;
		System.out.println("Division result of "+a+" and "+b+" is "+result);
	}

}

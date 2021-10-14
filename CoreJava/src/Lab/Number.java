package Lab;

import java.lang.Math. *;
import java.lang.Number.*;

public class Number {

	private double db;
	private long lg;
	
	public Number ( )
	{
	db = 108.0d;
	}
	public Number(double d, long l)
	{
	db = d;
	}
	public boolean isZero ( )
	{
	if (db == 0.0)
	return true;
	else
	return false;
	}
	public boolean isPositive ( )
	{
	if(db > 0.0)
	return true;
	else
	return false;
	}
	public boolean isNegative ( )
	{
	if (db < 0.0)
	return true ;
	else
	return false;
	}
	public boolean isOdd( )
	{
	if (db % 2 != 0.0)
	return true;
	else 
	return false;
	}
	public boolean isEven ( )
	{
	if (db % 2 == 0.0)
	return true ;
	else 
	return false;
	}
	public boolean isPrime ( )
	{
	int i, lastn;

	double a;
	boolean flag;
	a = Math.sqrt(db);
	lastn = (int)a;
	flag = true;
	for (i=2; i<lastn; i++)
	{
	if (db != i)
	{
	if( db % i ==0)
	{
	flag = false;
	break;
	}
	}
	}
	if (flag)
	return true;
	else 
	return false;
	}
	public boolean isAmstrong ( )
	{
	if (db == 0.0)
	return true;
	else
	return false;
	}
	
    public double getFactorial()
		 {
    	 int i,fact=1;  
    	 double db=5.00;   
    	  for(i=1;i<=db;i++){    
    	      fact=fact*i;    
    	  }
    	  return fact;
		 }
	
	public double getSqrt()
	{
		double result=Math.sqrt(db);
		return result;
	}
	public double getSqr()
	{
		double result1=Math.pow(db,2);
		return result1;
	}
	public double sumDigits() {
		int number = 12345;
		int sum = 0, digit;
		while (number > 0) {
			digit = number % 10;
			sum = sum + digit;
			number = number / 10;
		}
		return sum;
	}
	public double getReverse( )
	{
	    int db=78654, reverse = 0; 
		while(db != 0)   
		{  
		int remainder = (int) (db%10);  
		reverse = reverse * 10 + remainder;  
		db = db/10;  
		}
		return reverse;  
	}
	   
	public void dispBinary() {
		System.out.println("ByteValue of lg :" + Long.toBinaryString(lg));
	}

	public static void main(String args[]) {
		Number num = new Number();
		double db = 295.98;
		long lg = 123;
		System.out.println("The given number is : " + db);
		System.out.println("isZero " + num.isZero());
		System.out.println("isPositive " + num.isPositive());
		System.out.println("isNegative " + num.isNegative());
		System.out.println("isOdd " + num.isOdd());
		System.out.println("isEven " + num.isEven());
		System.out.println("isPrime " + num.isPrime());
		System.out.println("isAmstrong " + num.isAmstrong());

		System.out.println("---------------------------------");

		System.out.println("getFactorial " + num.getFactorial());
		System.out.println("getSqrt " + num.getSqrt());
		System.out.println("getSqr " + num.getSqr());
		System.out.println("sumDigits " + num.sumDigits());
		System.out.println("getReverse " + num.getReverse());
		
		System.out.println("---------------------------------");
		
		num.dispBinary();

	}

}


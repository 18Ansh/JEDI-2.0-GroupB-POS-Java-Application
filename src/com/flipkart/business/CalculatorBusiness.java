/**
 * 
 */
package com.flipkart.business;

import com.flipkart.demoAbstract.DemoAbstract;

/**
 * @author ansh.agarwal
 *
 */
public class CalculatorBusiness extends DemoAbstract
{
	public int addition(int a, int b)
	{
		return a+b;
	}
	
	public int subtraction(int a, int b)
	{
		return a-b;
	}
	
	public int multiplication(int a, int b)
	{
		return a*b;
	}
	
	public int division(int a, int b)
	{
		return a/b;
	}

	@Override
	public String testHello() 
	{
		// TODO Auto-generated method stub
		return "Hello! I am the implemented method of abstract class";
	}

}

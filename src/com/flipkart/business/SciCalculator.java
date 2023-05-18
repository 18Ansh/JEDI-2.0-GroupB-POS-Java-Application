/**
 * 
 */
package com.flipkart.business;

/**
 * @author ansh.agarwal
 *
 */
public class SciCalculator extends CalculatorBusiness
{
	public double sqrt(int a)
	{
		return Math.sqrt(a);
	}
	
	public double sine(int a)
	{
		return Math.sin(Math.toRadians(a));
	}
	
	public double cosine(int a)
	{
		return Math.cos(Math.toRadians(a));
	}
	
	public double tangent(int a)
	{
		return Math.tan(Math.toRadians(a));
	}
	
	public double exp(int a)
	{
		return Math.exp(a);
	}
}

/**
 * 
 */
package com.flipkart.client;

import com.flipkart.business.CalculatorBusiness;
import com.flipkart.business.SciCalculator;

/**
 * @author ansh.agarwal
 *
 */
public class CalculatorClient 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		SciCalculator scibusiness=new SciCalculator();
		
		System.out.println("Addition of the numbers: "+scibusiness.addition(10,10));
		System.out.println("Subtraction of the numbers: "+scibusiness.subtraction(20,10));
		System.out.println("Multiplication of the numbers: "+scibusiness.multiplication(10,10));
		System.out.println("Division of the numbers: "+scibusiness.division(10,2));
		
		System.out.println("Square root of number is: "+scibusiness.sqrt(50));
		System.out.println("Sine of the number is: "+scibusiness.sine(30));
		System.out.println("Cosine of the number is: "+scibusiness.cosine(60));
		System.out.println("Tangent of the number is: "+scibusiness.tangent(45));
		System.out.println("Exponential of the number is: "+scibusiness.exp(3));
		
		System.out.println(scibusiness.testHello());
		System.out.println(scibusiness.testHi());
	}

}

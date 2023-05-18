/**
 * 
 */
package com.flipkart.bean;

/**
 * @author ansh.agarwal
 *
 */
public class GradeCard 
{
	private int studentID;
	private int semester;
	private float cpi;
	private float calculateCPI()
	{
		System.out.println("CPI has been calculated");
		return cpi;
	}
}

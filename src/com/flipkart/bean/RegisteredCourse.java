/**
 * 
 */
package com.flipkart.bean;

/**
 * @author ansh.agarwal
 *
 */
public class RegisteredCourse 
{
	private String courseCode;
	private int semester;
	private int studentID;
	private String grade;
	public String viewGrade()
	{
		return grade;
	}
	public void dropCourse()
	{
		System.out.println("Course has been dropped");
	}
}

/**
 * 
 */
package com.flipkart.bean;

/**
 * @author ansh.agarwal
 *
 */
public class SemesterRegistration 
{
	private int studentID;
	private int semester;
	private String dateOfJoining;
	public boolean registerCourse()
	{
		System.out.println("Course has been registered.");
		return true;
	}
	public void addCourse()
	{
		System.out.println("Course has been added.");
	}
	public void dropCourse()
	{
		System.out.println("Course has been dropped.");
	}
	public void payFees()
	{
		System.out.println("Fees has been paid.");
	}
	public void viewRegisteredCourses()
	{
		System.out.println("Registered courses have been displayed.");
	}
}

/**
 * 
 */
package com.flipkart.client;

import com.flipkart.business.CustomerBusiness;

/**
 * @author ansh.agarwal
 *
 */
public class CustomerApplicationClient 
{
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//Creating instance of CustomerBusiness class here
		CustomerBusiness business=new CustomerBusiness();
		business.createCustomer();
		business.listCustomer();
		System.out.println(business.updateCustomer(101));
		System.out.println(business.deleteCustomer(101));
	}

}

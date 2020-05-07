package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTest2 {
	  
	/*
	 * @Test(priority = 1) public void login() {
	 * System.out.println("login successfull"); }
	 * 
	 * @Test(priority = 5) public void logout() {
	 * System.out.println("login successfull"); }
	 * 
	 * @Test(priority = 2) public void addVendor() {
	 * System.out.println("Add Vendor successfull"); }
	 * 
	 * @Test (priority = 3) public void addProduct() {
	 * System.out.println("Add Product successfull"); }
	 * 
	 * @Test(priority = 4) public void addCurrency() {
	 * System.out.println("Add Currency successfull"); }
	 */
	
	//-----------------------------------------------------------------------
	
	
	/*
	 * @BeforeClass public 
	 * void login() { 
	 * System.out.println("login successfull"); }
	 * 
	 * @AfterClass public 
	 * void logout() {
	 * System.out.println("login successfull"); }
	 * 
	 * @Test(priority = 1) 
	 * public void addVendor() {
	 * System.out.println("Add Vendor successfull"); }
	 * 
	 * @Test (priority = 2) 
	 * public void addProduct() {
	 * System.out.println("Add Product successfull"); }
	 * 
	 * @Test(priority = 3) 
	 * public void addCurrency() {
	 * System.out.println("Add Currency successfull"); }
	 */
	
	
	//------------------------------------------------------------------------  
	  @Test(priority = 1)
	  public void DeleteVendor() {
		  System.out.println("Delete Vendor successfull");
	  }
	  @Test (priority = 2)
	  public void Deleteproduct() {
		  System.out.println("Delete Product successfull");
	  }
	  @Test(priority = 3)
	  public void DeleteCurrecy() {
		  System.out.println("Delete Currency successfull");
	  }

}

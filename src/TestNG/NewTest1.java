package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest1 {
	
	//execute all test cases of newtest1 and after run all the test cases in newtest2
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
	
	
//----------------------------------------------------------------------
	
	//execute all test cases of newtest1 and after run all the test cases in newtest2

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
	
	
//--------------------------------------------------------------------------------------	
	//this will run login(newtest1) > add vendor(newtest1)> addd product(newtest1)> add currency(newtest1) >
	//delete vendor(newtest2)> delete product(newtest2) > delete currency(newtest2) > logout(newtest1) 
	@BeforeTest
  public void login() {
	  System.out.println("login successfull");
  }
  @AfterTest
  public void logout() {
	  System.out.println("login successfull");
  }
  @Test(priority = 1)
  public void addVendor() {
	  System.out.println("Add Vendor successfull");
  }
  @Test (priority = 2)
  public void addProduct() {
	  System.out.println("Add Product successfull");
  }
  @Test(priority = 3)
  public void addCurrency() {
	  System.out.println("Add Currency successfull");
  }
}

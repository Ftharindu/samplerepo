package TestNG;

import org.testng.annotations.Test;

public class Class3 {
@Test (groups= {"Sanity","Regression"}, priority = 1)
public void login() {
	System.out.println("Login Successful");
}
@Test (groups= {"Sanity","Regression"}, priority = 6)
public void logout() {
	System.out.println("Logout Successful");
}
@Test (groups= {"Sanity"}, priority =2)
public void Search() {
	System.out.println("Search Successful");
}
@Test (groups= {"Regression"}, priority = 3)
public void AdvancedSearch() {
	System.out.println("AdvancedSearch Successful");
}
@Test (groups= {"Regression"}, priority = 4)
public void BillPayment() {
	System.out.println("BillPayment Successful");
}
@Test (groups= {"Sanity","Regression"}, priority = 5)
public void PrepaidRecharge() {
	System.out.println("Prepaid Recharge Successful");
}
}


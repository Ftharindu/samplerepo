package TestNG;

import org.testng.annotations.Test;

public class Class5 {
	  @Test
	  public void testcase5() {
		  long id = Thread.currentThread().getId();
		  System.out.println("Test case 5 succesful" + "Thread count is " + id);
	  }
	  @Test
	  public void testcase6() {
		  long id = Thread.currentThread().getId();
		  System.out.println("Test case 6 succesful" + "Thread count is " + id);  
		  }
	  @Test
	  public void testcase7() {
		  long id = Thread.currentThread().getId();
		  System.out.println("Test case 7 succesful" + "Thread count is " + id);  
		  }
	  @Test
	  public void testcase8() {
		  long id = Thread.currentThread().getId();
		  System.out.println("Test case 8 succesful" + "Thread count is " + id);  
		  }
	}
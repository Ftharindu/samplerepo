package TestNG;

import org.testng.annotations.Test;

public class Class6 {
	 @Test
	  public void testcase9() {
		  long id = Thread.currentThread().getId();
		  System.out.println("Test case 9 succesful" + "Thread count is " + id);
	  }
	  @Test
	  public void testcase10() {
		  long id = Thread.currentThread().getId();
		  System.out.println("Test case 10 succesful" + "Thread count is " + id);  
		  }
	  @Test
	  public void testcase11() {
		  long id = Thread.currentThread().getId();
		  System.out.println("Test case 11 succesful" + "Thread count is " + id);  
		  }
	  @Test
	  public void testcase12() {
		  long id = Thread.currentThread().getId();
		  System.out.println("Test case 12 succesful" + "Thread count is " + id);  
		  }
	}

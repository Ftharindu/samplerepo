package TestNG;

import org.testng.annotations.Test;

public class Class4 {
  @Test
  public void testcase1() {
	  long id = Thread.currentThread().getId();
	  System.out.println("Test case 1 succesful" + "Thread count is " + id);
  }
  @Test
  public void testcase2() {
	  long id = Thread.currentThread().getId();
	  System.out.println("Test case 2 succesful" + "Thread count is " + id);  
	  }
  @Test
  public void testcase3() {
	  long id = Thread.currentThread().getId();
	  System.out.println("Test case 3 succesful" + "Thread count is " + id);  
	  }
  @Test
  public void testcase4() {
	  long id = Thread.currentThread().getId();
	  System.out.println("Test case 4 succesful" + "Thread count is " + id);  
	  }
}

package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Day7_2 {
	int num1=30;
	int num2=10;
  @Test(priority=1)
  public void addition() {
	  int sum =num1+num2;
	  Assert.assertEquals(sum,40); 
  }
  @Test(priority=2)
  public void subraction() {
	  int minus =num1-num2;
	  Assert.assertEquals(minus,20); 
  }
  @Test(priority=3)
  public void multiplication() {
	  int product =num1*num2;
	  Assert.assertEquals(product,300); 
  }
  @Test(priority=4)
  public void division() {
	  int quotion =num1/num2;
	  Assert.assertEquals(quotion,3); 
  }
  
}

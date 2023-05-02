package day9;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class d9project1 {
	int a,b,c;
  @Test(dataProvider = "dp")
  public void add(Integer a,Integer b) {
	  c=a+b;
	  System.out.println("Sum:"+c);
	  Assert.assertEquals(c,15);
  }
  @Test(dataProvider = "dp")
  public void sub(Integer a,Integer b) {
	  c=a-b;
	  System.out.println("Difference:"+c);
	  Assert.assertEquals(c, 5);
  }
  @Test(dataProvider = "dp")
  public void multiply(Integer a,Integer b) {
	  c=a*b;
	  System.out.println("Product:"+c);
	  Assert.assertEquals(c, 50);
  }
  @Test(dataProvider = "dp")
  public void divide(Integer a,Integer b) {
	  c=a/b;
	  System.out.println("Quotient:"+c);
	  Assert.assertEquals(c, 2);
  }
  

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 10, 5 },
      new Object[] { 12, 6},
    };
  }
}

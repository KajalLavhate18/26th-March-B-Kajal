package VerificationUsingTestNg;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertNullUse {
  @Test
  public void myTest() {
	  int a=23;
	  int b=25;
	  //Assert.assertNull(b, "b is not Null TC is failed");
	 // Reporter.log("b is not null TC is PASSED", true);
	  Assert.assertNotNull(b, "b is null TC is failed");
	  Reporter.log("b is not null TC is PASSED", true);
	  
	  
  }
}

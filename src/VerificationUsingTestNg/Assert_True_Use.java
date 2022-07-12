package VerificationUsingTestNg;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_True_Use {
  @Test
  public void myClass() {
	  boolean a=true;
	  boolean b=false;
	  Assert.assertTrue(a,"TC is failed value is false");
	  Reporter.log("TC is PASSED value is false", true);
	  
	  Assert.assertFalse(b,"TC is failed value is false ");
	  Reporter.log("TC is PASSED value is true", a);
  }
}

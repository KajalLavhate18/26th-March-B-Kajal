package VerificationUsingTestNg;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class AssertEqualsUse {
  @Test
  public void myMethod() {
	  
	  String a="Pune";
	  String b="Pune";
	  //Assert.assertEquals(a, b,"a and b values are not matching TC failed");
	 // Reporter.log("a and b values are matching TC PASSED", true);
	  Assert.assertNotEquals(a,b, "a and b are matcging TC is failed");
	  Reporter.log("a and b are not matcging TC is passed", true);;
	  
	  
  }
  
}

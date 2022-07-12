package VerificationUsingTestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MultipleVerification {
  @Test
  public void myMethod() {
	  String a="Kajal";
	  String b="Kajal 1";
	  Assert.assertEquals(a, b ,"TC is failed values are equal");
	  Assert.assertNotNull(b, "TC is failed value is null");
	  
  }
}

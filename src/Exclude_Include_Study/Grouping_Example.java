package Exclude_Include_Study;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Grouping_Example {
	@Test(groups = "sanity")
	  public void a() {
		  Reporter.log("A is sanity",true);
	  }
	  @Test(groups = "regression")
	  public void b() {
		  Reporter.log("B is regression",true);
	  }
	  @Test(groups = "sanity")
	  public void c() {
		  Reporter.log("C is sanity",true);
	  }
}

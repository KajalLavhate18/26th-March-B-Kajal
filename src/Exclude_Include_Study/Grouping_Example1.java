package Exclude_Include_Study;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Grouping_Example1 {
	@Test
	  public void x() {
		  Reporter.log("x",true);
	  }
	  @Test(groups = "regression")
	  public void y() {
		  Reporter.log("y is regression",true);
	  }
	  @Test(groups = "sanity")
	  public void z() {
		  Reporter.log("z is sanity",true);
	  }
}

package Exclude_Include_Study;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Include_study {
	@Test
	  public void x() {
		  Reporter.log("X",true);
	  }
	  @Test
	  public void y() {
		  Reporter.log("Y",true);
	  }
	  @Test
	  public void z() {
		  Reporter.log("Z",true);
	  }
}

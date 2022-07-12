package Exclude_Include_Study;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Exclude_Include {
  @Test
  public void a() {
	  Reporter.log("A",true);
  }
  @Test
  public void b() {
	  Reporter.log("B",true);
  }
  @Test
  public void c() {
	  Reporter.log("C",true);
  }
}

package cucumberHooks;

import io.cucumber.java.*;
import io.cucumber.java.Scenario;

public class HooksExample {

	
	//cucumber hooks acts just like the testNG/Junit test
	
	@Before (order = 1) //order denotes the execution order
	public void setupDriver() {
		System.out.println("driver setup");
	}
	
	//can have multiple before and after for each scenario/step
	
	@Before()
	public void setDB(Scenario s) {
		System.out.println("Scenario: "+s.getName());
	}
	
	@After
	public void tearDown() {
		System.out.println("closed");
	}
	
	@BeforeStep
	public void beforeStep() {
		System.out.println("---- running before each step ----");
	}
	
	
}

package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class GroupExecutionClass {
	

    @Test(groups = "IntegrationTesting")
	public void atestCase_01Test() {
		System.out.println("TestCase_01 Executed");
	}
		@Test(groups = "AdhocTesting" )
		public void atestCase_02Test() {
			System.out.println("TestCase_02 Executed");
		}
			@Test(groups = "SmokeTesting")
			public void atestCase_03Test() {
				System.out.println("TestCase_03 Executed");
				
		
	}

}

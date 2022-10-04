package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class DataProviderInAnotherClass {
@Test(dataProvider = "ticketData", dataProviderClass = DataProviderClass.class)
	public static void bookTicketTest(String src , String dest , int tickets) {
		System.out.println("execute source =>" +",Destiantions =>" +dest);

		
		
	}

}

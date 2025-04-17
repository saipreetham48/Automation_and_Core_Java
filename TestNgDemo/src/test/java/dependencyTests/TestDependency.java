package dependencyTests;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestDependency {
	static String trackingnumber = null;
   // @Ignore
	@Test()
	public void createShipment() {
		System.out.println(5/0);
		System.out.println("createshipment");
		trackingnumber = "Absvbd6567";
	}

	@Test(dependsOnMethods = {"createShipment"} )
	public void trackShipment() throws Exception {
		if (trackingnumber != null)
			System.out.println("trackShipment");
		else
			throw new Exception("Invalid tracking number");
	}

	@Test(dependsOnMethods = {"createShipment"} )
	public void cancelShipment() throws Exception {
		if (trackingnumber != null)
			System.out.println("cancelShipment");
		else
			throw new Exception("Invalid tracking number");

	}

}

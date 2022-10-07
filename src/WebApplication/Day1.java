package WebApplication;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners({Listenerss.class})




public class Day1 {
	
	
	
	
	@Test
	public void Min()

	{
		System.out.println("Min");
		Assert.assertTrue(false);

	}

	@Test(timeOut=1000)
	public void Miniing() throws InterruptedException

	{
		Thread.sleep(2000);
		System.out.println("Miniing");
	}

	@Test(dependsOnMethods="Miniing")
	public void mius()

	{
		System.out.println("mius");

	}

}

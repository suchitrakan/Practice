import org.testng.Assert;
import org.testng.annotations.Test;

public class practiceSess {

	@Test
	public void Running()
	{
		System.out.println("Running");
		System.out.println("My Project is running successfully");

	}
	@Test
	public void fail()
	{
		Assert.assertTrue(false);
	}
}
	
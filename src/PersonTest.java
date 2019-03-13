import org.junit.Assert;
import org.junit.Test;
/**
 * Tests for Person class.
 * 
 * @author Kiley
 *
 */
public class PersonTest {
	
	/**
	 * Test for SickPerson class.
	 */
	@Test
	public void SickPersonTest()
	{
		String name = "Mia";
		int age = 20;
		int severity = 10;
		SickPerson a = new SickPerson(name, age, severity);
		Assert.assertEquals("Name incorrect", "Mia", a.getName());
		Assert.assertEquals("Age is incorrect", 20, a.getAge());
		//Assert.assertEquals("Severity is incorrect", 10, a.getSeverity());
		
		Assert.assertEquals("Mia, a 20-year old.", a.toString());
		
		SickPerson b = new SickPerson("Dude", 20, 6);
		
		Assert.assertEquals(-1, a.compareTo(b));
		Assert.assertEquals(1, b.compareTo(a));
		
		Assert.assertFalse(a.equals(b));
		
		
	}
	
	/**
	 * Test for HealthyPerson class.
	 */
	@Test
	public void HealthyPersonTest()
	{
		String name = "Susanna";
		int age = 26;
		String reason = "Pregnancy";
		HealthyPerson a = new HealthyPerson(name, age, reason);
		Assert.assertEquals("Name incorrect", "Susanna", a.getName());
		Assert.assertEquals("Age is incorrect", 26, a.getAge());
		
		Assert.assertEquals("Susanna, a 26-year old.", a.toString());
		
		HealthyPerson b = new HealthyPerson("Dude", 20, "Checkup");
		
		Assert.assertEquals(15, a.compareTo(b));
		
	}

}

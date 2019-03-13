import org.junit.Assert;
import org.junit.Test;
/**
 * Tests for Hospital class.
 * 
 * @author Kiley
 *
 */
public class HospitalTest {
	
	/**
	 * Test for the StackHospital class.
	 */
	@Test
	public void StackHospitalTest() {
		Person a = new HealthyPerson("Name", 10, "Checkup");
		Person b = new HealthyPerson("Name2", 10, "Checkup");
		Person c = new SickPerson("Name3", 18, 10);
		Person d = new SickPerson("Name4", 20, 9);
		
		StackHospital<Person> h = new StackHospital<Person>();
		h.addPatient(a);
		h.addPatient(b);
		h.addPatient(c);
		h.addPatient(d);
		
		Assert.assertEquals(d, h.nextPatient());
		Assert.assertEquals(4, h.numPatients());
		Assert.assertEquals(d, h.treatNextPatient());
		Assert.assertEquals(3, h.numPatients());
		Assert.assertEquals("StackHospital", h.hospitalType());
		Assert.assertEquals("[Name, a 10-year old., Name2, a 10-year old., Name3, a 18-year old.]", h.allPatientInfo());
		
		Assert.assertEquals("A StackHospital-type hospital with 3 patients.", h.toString());
		
		Animal bb = new Animal("Dog", 10);
		Animal bb2 = new Animal("Cat", 2);
		StackHospital<Animal> h1 = new StackHospital<Animal>();
		h1.addPatient(bb);
		h1.addPatient(bb2);
		Assert.assertEquals(bb2, h1.nextPatient());
		Assert.assertEquals(2, h1.numPatients());
		Assert.assertEquals(bb2, h1.treatNextPatient());
		Assert.assertEquals(1, h1.numPatients());
		Assert.assertEquals("StackHospital", h1.hospitalType());
		Assert.assertEquals("[Name, a 10-year old., Name2, a 10-year old., Name3, a 18-year old.]", h.allPatientInfo());
		
		Assert.assertEquals("A 10-year old Dog.", bb.toString());
		
		Assert.assertEquals(-8, bb.compareTo(bb2));
		
	}
	
	/**
	 * Test for the QueueHospitalClass.
	 */
	@Test
	public void QueueHospitalTest()
	{
		Person a = new HealthyPerson("Name", 10, "Checkup");
		Person b = new HealthyPerson("Name2", 10, "Checkup");
		Person c = new SickPerson("Name3", 18, 10);
		Person d = new SickPerson("Name4", 20, 9);
		
		QueueHospital<Person> h = new QueueHospital<Person>();
		h.addPatient(a);
		h.addPatient(b);
		h.addPatient(c);
		h.addPatient(d);
		
		Assert.assertEquals(a, h.nextPatient());
		Assert.assertEquals(4, h.numPatients());
		Assert.assertEquals(a, h.treatNextPatient());
		Assert.assertEquals(3, h.numPatients());
		Assert.assertEquals("QueueHospital", h.hospitalType());
		Assert.assertEquals("[Name2, a 10-year old., Name3, a 18-year old., Name4, a 20-year old.]", h.allPatientInfo());
		
		Assert.assertEquals("A QueueHospital-type hospital with 3 patients.", h.toString());
		
	}
	
	/**
	 * Test for the PriorityQueueHospital class.
	 */
	@Test
	public void PriorityQueueHosptialTest()
	{
		Person a = new HealthyPerson("Name", 10, "Checkup");
		Person b = new HealthyPerson("Name2", 10, "Checkup");
		Person c = new SickPerson("Name3", 18, 10);
		Person d = new SickPerson("Name4", 20, 9);
		
		PriorityQueueHospital<Person> h = new PriorityQueueHospital<Person>();
		h.addPatient(a);
		h.addPatient(b);
		h.addPatient(c);
		h.addPatient(d);
		
		Assert.assertEquals(a, h.nextPatient());
		Assert.assertEquals(4, h.numPatients());
		Assert.assertEquals(a, h.treatNextPatient());
		Assert.assertEquals(3, h.numPatients());
		Assert.assertEquals("PriorityQueueHospital", h.hospitalType());
		Assert.assertEquals("[Name2, a 10-year old., Name3, a 18-year old., Name4, a 20-year old.]", h.allPatientInfo());
		
		Assert.assertEquals("A PriorityQueueHospital-type hospital with 3 patients.", h.toString());
		
	}

}

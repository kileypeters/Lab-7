/**
 * Class representing a healthy person. Inherits Person.
 * 
 * @author Kiley
 *
 */
public class HealthyPerson extends Person {

	
	//Healthy person's name.
	 
	private String name;
	
	
	//Healthy person's name.
	 
	private int age;
	
	/**
	 * Constructor for a HealthyPerson object.
	 * 
	 * @param name Name of HealthyPerson.
	 * @param age Age of HealthyPerson.
	 * @param reason Reason for HealthyPerson.
	 */
	public HealthyPerson(String name, int age, String reason) {
		super(name, age);
		this.name = name;
		this.age = age;
	}

	@Override
	protected int compareToImpl(Person p) {
	
		
		return this.getName().toLowerCase().compareTo(p.getName().toLowerCase());
	}

	/**
	 * Gives some information about the HealthyPerson.
	 *
	 * @return The string "%s, a %d-year old." with replacements of the Person's name and age.
	 */
	@Override
	public String toString()
	{
		return String.format("%s, a %d-year old.", name, age);
	}
}

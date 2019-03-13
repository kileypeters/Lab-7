/**
 * Class representing a sick person. Inherits person.
 * 
 * @author Kiley
 *
 */
public class SickPerson extends Person {

	//Name of sick person.
	private String name;
	
	//Age of sick person.
	private int age;
	
	//Severity of sick person.
	private int severity;
	
	/**
	 * Constructor for a SickPerson object.
	 * 
	 * @param name Name of SickPerson.
	 * @param age Age of SickPerson.
	 * @param severity Severity of SickPerson.
	 */
	public SickPerson(String name, int age, int severity) {
		super(name, age);
		this.name = name;
		this.age = age;
		this.severity = severity;
	}
	
	/**
	 * Gets the severity of the sick person.
	 * 
	 * @return The SickPerson's severity.
	 */
	private int getSeverity() {
		return severity;
	}


	@Override
	protected int compareToImpl(Person p) {
		
		if (this.getSeverity() > ((SickPerson) p).getSeverity())
		{
			return -1;
		}
		else if (this.getSeverity() < ((SickPerson) p).getSeverity())
		{
			return 1;
		}
		else
		{
			return 0;
		}
		
	}
	
	/**
	 * Gives some information about the SickPerson.
	 *
	 * @return The string "%s, a %d-year old." with replacements of the Person's name and age.
	 */
	@Override
	public String toString()
	{
		return String.format("%s, a %d-year old.", name, age);
	}

}

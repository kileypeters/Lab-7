import java.util.Stack;

/**
 * Class representing the StackHospital. Inherits Hospital.
 * 
 * @author Kiley
 *
 * @param <PatientType>
 */
public class StackHospital<PatientType> extends Hospital<PatientType> {

	//Stack data structure for patients.
	private Stack<PatientType> myStack = new Stack<PatientType>();
	
	@Override
	public void addPatient(PatientType patient) {
		
		myStack.push(patient);
	}

	@Override
	public PatientType nextPatient() {
		
		return myStack.peek();
	}

	@Override
	public PatientType treatNextPatient() {
		PatientType next = myStack.peek();
		myStack.pop();
		
		return next;
	}

	@Override
	public int numPatients() {
		
		return myStack.size();
	}

	@Override
	public String hospitalType() {
		
		return getClass().getName();
	}

	@Override
	public String allPatientInfo() {
		
		
		return myStack.toString();
	}

	

}

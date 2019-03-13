import java.util.LinkedList;
import java.util.Queue;

/**
 * Class to represent the QueueHospital. Inherits hospital.
 * 
 * @author Kiley
 *
 * @param <PatientType>
 */
public class QueueHospital<PatientType> extends Hospital<PatientType> {

	//Queue data structure for patients.
	private Queue<PatientType> myQueue = new LinkedList<PatientType>();
	
	@Override
	public void addPatient(PatientType patient) {
		myQueue.add(patient);
		
	}

	@Override
	public PatientType nextPatient() {
		
		return myQueue.peek();
	}

	@Override
	public PatientType treatNextPatient() {
		PatientType next = myQueue.peek();
		myQueue.remove();
		
		return next;
	}

	@Override
	public int numPatients() {
		
		return myQueue.size();
	}

	@Override
	public String hospitalType() {
		
		return getClass().getName();
	}

	@Override
	public String allPatientInfo() {
		
		return myQueue.toString();
	}


}

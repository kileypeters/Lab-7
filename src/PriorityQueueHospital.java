import java.util.LinkedList;
import java.util.Queue;

/**
 * Class to represent the PriorityQueueHospital. Inherits hospital.
 * 
 * @author Kiley
 *
 * @param <PatientType>
 */
public class PriorityQueueHospital<PatientType extends Comparable<PatientType>> extends Hospital<PatientType> {

	//Queue data structure for patients.
	private Queue<PatientType> myPriorityQueue = new LinkedList<PatientType>();
	
	@Override
	public void addPatient(PatientType patient) {
		myPriorityQueue.add(patient);
		
	}

	@Override
	public PatientType nextPatient() {
		return myPriorityQueue.peek();
	}

	@Override
	public PatientType treatNextPatient() {
		PatientType next = myPriorityQueue.peek();
		myPriorityQueue.remove();
		
		return next;
	}

	@Override
	public int numPatients() {
		
		return myPriorityQueue.size();
	}

	@Override
	public String hospitalType() {
		
		return getClass().getName();
	}

	@Override
	public String allPatientInfo() {
		
		return myPriorityQueue.toString();
	}

	
}

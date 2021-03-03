package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
	public  ArrayList<Doctor> doctors;
	public  ArrayList<Patient> patients;

	public Hospital() {
		doctors = new ArrayList<Doctor>();
		patients = new ArrayList<Patient>();
	}

	public void addPatient(Patient patient) {
		// TODO Auto-generated method stub
		patients.add(patient);
		System.out.println(patients.size());

	}

	public void assignPatientsToDoctors() {
		// TODO Auto-generated method stub
int docIndex=0;
		for (int i = 0; i < patients.size(); i++) {
			try {
				doctors.get(docIndex).assignPatient(patients.get(i));
			} catch (Exception greaterThan3) {
				// TODO: handle exception
				docIndex++;
				i--;
			}
		}

	}

	public List<Patient> getPatients() {
		// TODO Auto-generated method stub
		return patients;
	}

	public List<Doctor> getDoctors() {
		// TODO Auto-generated method stub
		return doctors;
	}

	public void addDoctor(Surgeon surgeon) {
		// TODO Auto-generated method stub
		doctors.add(surgeon);
	}

	public void addDoctor(GeneralPractitioner generalPractitioner) {
		// TODO Auto-generated method stub
		doctors.add(generalPractitioner);
	}

}

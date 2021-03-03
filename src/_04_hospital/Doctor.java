package _04_hospital;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import java.util.ArrayList;
import java.util.List;

public class Doctor {
ArrayList<Patient> patients;
static boolean doMed=true;
boolean houseCalls=false;
boolean gpHouseCalls=true;
	public Doctor(){
		patients= new ArrayList<Patient>();
	}
	public boolean performsSurgery() {
		// TODO Auto-generated method stub
		return false;
	}

	public void assignPatient(Patient max) throws GreaterThan3 {
		// TODO Auto-generated method stub
	
	if (patients.size()<3) {
		patients.add(max);
	}else {
		throw new GreaterThan3();
	}
		
	}

	public void doMedicine() {
		// TODO Auto-generated method stub
doMed=true;
for (int i = 0; i < patients.size(); i++) {
	patients.get(i).medicineCaredFor();
}

	}


	public List<Patient> getPatients() {
		// TODO Auto-generated method stub
		return patients;
	}
	public boolean makesHouseCalls() {
		// TODO Auto-generated method stub

return false;
}

}

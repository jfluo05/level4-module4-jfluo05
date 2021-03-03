package _04_hospital;

public class Patient {
boolean checkPulseBoolean;
boolean medicinePerformed=false;
static boolean fcf;
	public boolean feelsCaredFor() {
		
		// TODO Auto-generated method stub
		fcf = false;
		if (checkPulseBoolean==true) {
			fcf=true;
		}
		if (medicinePerformed==true) {
			fcf=true;
		}
		return fcf;
	}

	public void checkPulse() {
		// TODO Auto-generated method stub
		 checkPulseBoolean=true;
	}
 public void medicineCaredFor() {
	medicinePerformed=true;
	 
 }
}

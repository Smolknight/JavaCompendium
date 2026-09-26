package own_practice;

import java.util.Scanner;

public class ClinicalDataTypes {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		boolean IsWellVisit;
		String PatientFullName;
		String tempStr;
		int PatientAge;
		double PatientWeightKg;
		char PatientSAB; //SAB stands for sex assigend at birth
		
		System.out.println("Hello and thanking for testing our new pateint record system");
		System.out.println("Let's start with marking if today's visit is a well visit \nWrite true or false");
		
		IsWellVisit = scnr.nextBoolean();
		
		System.out.println("Now please enter the pateint's full name");
		
		tempStr = scnr.nextLine();
		PatientFullName = scnr.nextLine();
		
		System.out.println("Type in the patient's weight in Kilograms(Kg)");
		
		PatientWeightKg = scnr.nextDouble();
		
		System.out.println("Enter the patient's age");
		
		PatientAge = scnr.nextInt();
		
		System.out.println("Final question, enter the patient's sex assigned at birth \nM for male and F for female");
		
		tempStr = scnr.nextLine();
		PatientSAB = scnr.nextLine().charAt(0);
		
		System.out.println("Please confirm if the patient's infomation is correct\n");
		System.out.println("Is today a well visit?\t" + IsWellVisit + "\nPatient's full name:\t" + PatientFullName + "\nPatient's age:\t" + PatientAge + "\nPateint's weight in kilograms:\t" + PatientWeightKg + "\nPatient's sex assigned at birth (M for male and F for female):\t"+PatientSAB);
		System.out.println("Thank you for using our new patient record system");
		/* I learned how to declare variables for boolean, string, int, double, and char.
		 * I also learned which scanner methods to use to retrieve different data types.
		 * 
		 */
	}

}

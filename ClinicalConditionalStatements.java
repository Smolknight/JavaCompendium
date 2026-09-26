package own_practice;

import java.util.Scanner;

public class ClinicalConditionalStatements {

	public static void main(String[] args) {
		
		class wellsExam{
			static Scanner scnr = new Scanner(System.in); //static makes scanner available for entire class without needing an instance of wellsExam
			
			public static int TestResult(double points) { //public allows anything to access method, static means no object required, int tells method returns int data type
				int score = -1;
				
				if(points >= 0 && points < 2) { // points must be between 0 and 1
					score = 0;
				}else if(points >= 2 && points < 6.5) { // points must be between 2 and 6
					
					if(points >= 4) { // pulmonary embolism likely when 4 and above
						score = 2;
					}else {
						score = 1;
					}
					
				}else if(points >= 6.5 && points <= 12.5) {
					score = 3;
				};
				
				return score;
			};
			
			public static boolean isPointsValid(double points) {
				boolean notValid = false;
				System.out.println(points);
				if(!(points >= 0.0) || points > 12.5){ //checks if points outside of 0-12.5 range
					notValid = true;
				}
				return notValid;
				
			};
		};
		
		Scanner scnr = new Scanner(System.in);
		
		double points;
		int age,score, heartBPM;
		boolean arePointsValid;
		
		System.out.println("Hello tester, welcome to our heart health system\nPlease enter patient age");
		age = scnr.nextInt(); //gets pateint's age
		
		System.out.println("Enter patient's heart rate (BPM)");
		heartBPM = scnr.nextInt();//gets pateint's age
		
		if(heartBPM > 99 || heartBPM < 60) {
			System.out.println("ALERT: Patient's heart rate is unhealthy");
		}
		
		if(age >= 20) { //further testing needed if patient is 20 or older
			System.out.println("Check the patient's blood pressure, blood cholesterol, and blood glucose");
			
			System.out.println("Calculate the probability of pulmonary embolism using the Wells' criteria\nEnter point total");
			points = scnr.nextDouble();
			
			while(wellsExam.isPointsValid(points)) { //checks if points in range, repeats if not
				System.out.println("missing or invalid point total, point total must be between 0 and 12.5\nResubmit point total");
				points = scnr.nextDouble();
			}
			
			
			
//			switch(score) {
//			case 0:
//				System.out.println("low risk, pulmonary embolism unlikely");
//				break;
//			case 1:
//				System.out.println("moderate risk, pulmonary embolism unlikely");
//				break;
//			case 2:
//				System.out.println("moderate risk, pulmonary embolism likely");
//				break;
//			case 3:
//				System.out.println("high risk, pulmonary embolism likely");
//				break;
//			default:
//				System.out.println("Error: missing or invalid points submitted\nResubmit point total");
//				
//			}
				
		}else {
			System.out.println("Check patient's weight and BMI");
		};
		
		
		

	}

}

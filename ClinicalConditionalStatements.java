package own_practice;

import java.util.Scanner;

/*
 * Date: 9/3/26
 * Purpose: Showing understanding using conditional statements in Java
 */

/* if statement: line 65-67
 * if else statement: line 69-104
 * nested if statement: line 32-36
 * if-else-if-else: line 28-38
 */

public class ClinicalConditionalStatements {

	public static void main(String[] args) {

		class wellsExam{
			public static int TestResult(double points) { //public allows anything to access method, static means no object required, int tells method returns int data type
				int score = -1;

				if(points >= 0 && points < 2) { // points must be between 0 and 1
					score = 0;
				}else if(points >= 2 && points < 6.5) { // points must be between 2 and 6.4

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
				if(!(points >= 0.0) || points > 12.5){ //checks if points outside of 0-12.5 range
					notValid = true;
				}
				return notValid;

			};
		};

		Scanner scnr = new Scanner(System.in);

		double points;
		int age,score, heartBPM;

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

			while(wellsExam.isPointsValid(points)) { //checks if points in range, repeats until points in range. While loop checks conditional before next iteration
				System.out.println("missing or invalid point total, point total must be between 0 and 12.5\nResubmit point total");
				points = scnr.nextDouble();
			}

			score = wellsExam.TestResult(points);



			switch(score) {
			case 0:
				System.out.println("low risk, pulmonary embolism unlikely");
				break;
			case 1:
				System.out.println("moderate risk, pulmonary embolism unlikely");
				break;
			case 2:
				System.out.println("moderate risk, pulmonary embolism likely");
				break;
			case 3:
				System.out.println("high risk, pulmonary embolism likely");
				break;
			default:
				System.out.println("Error: scoring return -1, please contact support");

			}

		}else {
			System.out.println("Check patient's weight and BMI");
		};

		System.out.println("end of program");
		/* I learned how to use conditional statements in java.
		 * I learned how to apply conditional statements for practical use.
		 *
		 * --------------Online resources used---------------------------
		 * Wells' Criteria scoring system: https://www.mdcalc.com/calc/115/wells-criteria-pulmonary-embolism
		 * Java class method: https://www.w3schools.com/java/java_class_methods.asp
		 * Java method parameters: https://www.w3schools.com/java/java_methods_param.asp
		 * Java modifiers: https://www.w3schools.com/java/java_non_modifiers.asp
		 * Java while loop: https://www.w3schools.com/java/java_while_loop.asp
		 * Java public keyword: https://www.w3schools.com/java/ref_keyword_public.asp
		 */

	}

}

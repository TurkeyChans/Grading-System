import java.util.Scanner;

public class Grades2 {
		   public static void main (String[] args) {
			   Scanner scnr = new Scanner(System.in);
			   		int gradeNum = 0;
			         int total = 0;
			         int A = 0;
			         int A_min = 0;
			         int B_plus = 0;
			         int B = 0;
			         int B_min = 0;
			         int C_plus = 0;
			         int C = 0;
			         int C_min = 0;
			         int D = 0;
			         int F = 0;
			         
			         while (gradeNum > -1) {
			        	 System.out.println("Enter a grade: ");
			        	 gradeNum = scnr.nextInt();
				         if(gradeNum >= 93) {
				        	 A += 1;
				        	 total += 1;
				         }
				         else if(gradeNum >= 90) {
				        	 A_min += 1;
				        	 total += 1;
				         }
				         else if(gradeNum >= 90) {
				        	 A_min += 1;
				        	 total += 1;
				         }
				         else if(gradeNum >= 87) {
				        	 B_plus += 1;
				        	 total += 1;
				         }
				         else if(gradeNum >= 83) {
				        	 B += 1;
				        	 total += 1;
				         }
				         else if(gradeNum >= 80) {
				        	 B_min += 1;
				        	 total += 1;
				         }
				         else if(gradeNum >= 77) {
				        	 C_plus += 1;
				        	 total += 1;
				         }
				         else if(gradeNum >= 73) {
				        	 C += 1;
				        	 total += 1;
				         }
				         else if(gradeNum >= 70) {
				        	 C_min += 1;
				        	 total += 1;
				         }
				         else if(gradeNum >= 60) {
				        	 D += 1;
				        	 total += 1;
				         }
				         else if(gradeNum >= 0) {
				        	 F += 1;
				        	 total += 1;
				         }
			         	
			         }
			         System.out.println("Total number of grades = " + total);
			         System.out.println("Number of A's  = " + A );
			         System.out.println("Number of A-'s = " + A_min );
			         System.out.println("Number of B+'s = " + B_plus );
			         System.out.println("Number of B's  = " + B );
			         System.out.println("Number of B-'s = " + B_min );
			         System.out.println("Number of C+'s = " + C_plus );
			         System.out.println("Number of C's  = " + C );
			         System.out.println("Number of C-'s = " + C_min );
			         System.out.println("Number of D's  = " + D );
			         System.out.println("Number of F's  = " + F );
			      }
}
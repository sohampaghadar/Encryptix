package encryptix;

import java.util.Scanner;

public class EncryptixTask2 {

 public static void main(String[] args) {
  
  System.out.print("Enter The number of Subjects : ");
  Scanner scanner = new Scanner(System.in);
  int Subjects = scanner.nextInt();
  
  int TotalMarks = 0;
  
  int i = 1;
  while(i <= Subjects) {
   System.out.println("Enter marks obtained in subject " + i + "(out of 100): ");
   int marks = scanner.nextInt();
   TotalMarks += marks;
   i++;
  
  }
  
  double percentage = (double) TotalMarks / Subjects;
  
  String Grade;
  if(percentage >= 90) {
   Grade = "A+";
  }
  else if(percentage >= 80) {
   Grade = "A";
  }
  else if(percentage >= 70) {
   Grade = "B";
  }
  else if(percentage >= 60) {
   Grade = "C";
   }
  else if(percentage >= 50) {
   Grade = "D";
   }
  else {
   Grade = "F";
   }
  System.out.println("Your Result is :");
  System.out.println("Total Marks: "+TotalMarks);
  System.out.println("Percentage: "+ String.format("%.2f", percentage) + "%");
  System.out.println("Grade: "+ Grade);
  
  if(Grade == "F") {
   System.out.println("You Have Failed");
   
  }else {
   System.out.println("You Pass");
  }
 }
}
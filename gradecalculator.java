package project2;

import java.util.Scanner;

public class gradecalculator {
    public static void main(string [] args) {
        Scanner ar =new Scanner(System.in);
        System.out.print("Enter your total number of subject  = ");
        int numsubject =ar.nextInt();
        if (numsubject <= 0) {
            System.out.println("please enter your valid number of the subject ");
            return ;
            
        }

        int totalmarks =0;
        int maxmarkspersubject =100;

        for(int i = 1; i <= numsubject ; i++){
            System.out.println("ENter your marks obtained in subject " + i + " (out of 100 ): ");
            int marks = ar.nextInt();
             
            if (marks < 0 || marks > maxmarkspersubject) {
                System.out.println("marks shoud be  :");
                i--;
            }
             else{
                totalmarks += marks;

             }
        }
    
        double averagepercentage = (double)totalmarks / (numsubject * maxmarkspersubject )*100;
        System.out.println("Total marks  obtained to be  = " + totalmarks );

        String grade;

        if (averagepercentage >= 90) {
            grade = "A+";
            
        }
       else if (averagepercentage >= 80){
         grade = "A";

        }
        else if (averagepercentage >= 70) {
            grade = "B";
            
        }
        else if (averagepercentage >= 60) {
            grade = "C+";
            
        }
        else if(averagepercentage >= 50){
            grade = "C";
        }
        else if (averagepercentage >= 40){
            grade = "D+";
        }
        else if (averagepercentage >= 30) {
            grade = "D";
            
        }
        else{
            System.out.println("Fail this  student  (' under 30 % marks this students ')");
            grade = "F";
        }

        System.out.println("Print the grade point  = " + grade);


    }
    
}

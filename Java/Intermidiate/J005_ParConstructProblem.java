
/*

Parameterized Constructor
Create a program to assign a student's grade based on the exam score.

Grading Criteria: If the score is

greater than or equal to 90, grade is A.
greater than or equal to 80, grade is B.
less than 80, grade is C.
Step1

Create a class named StudentResult with fields: score and grade and a method assignGrade().
Create a constructor with an integer parameter named score of int type and assign it to the score field.
Create a method named assignGrade() that assigns grades to students based on the score.
Step 2

Create the main() method inside the Main class.
Get an integer input for the variable score.
Create an object of Student with the argument score.
Call the assignGrade() method using the object.
Print the value of grade for the object.
Example
Test Input

84
Expected Output

B

*/

import java.util.Scanner;

class StudentResult{
    char grade;
    int score;

    void assignGrade(){
        if(score >= 90){
            grade = 'A';
        }
        else if(score >=80 && score <90){
            grade = 'B';
        }
        else{
            grade = 'C';
        }
    }

    StudentResult(int score){
        this.score = score;
    }

}

public class J005_ParConstructProblem {
    public static void main(String[] args){
        System.out.println("Enter your marks:");
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        StudentResult sr = new StudentResult(score);

        sr.assignGrade();
        System.out.println("Grade : "+sr.grade);

        sc.close();
    }
}

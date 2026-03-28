/*
Challenge: Make a Decision with If and Else
Test your understanding of Java Conditions by completing a small coding challenge.

Instructions
Inside main(), complete the following steps:
Declare an int variable named age and assign it a value
Use an if statement with the >= operator to check if age is 18 or older
If the condition is true, print Allowed
Otherwise, print Not allowed
*/
public class J006_IfElse {
    public static void main(String [] args){
        int age = 30;
        if(age >= 18){
            System.out.println("Allowed");
        }
        else{
            System.out.println("Not allowed");
        }
    }
}

/*
    Challenge: Fix Customer Order
    Test your understanding of Java Switch by completing a small coding challenge.

    Instructions
    A customer wants to order Coffee.
    The code in the editor is incomplete. Fix it by inserting the missing values so the program prints the correct order.

    Change choice to the correct number for Coffee (see the comments).
    Insert choice inside switch().
    Replace each case: with the correct number.
    Use two break statements (one for each case).
    Move System.out.println("Invalid choice") into a default: case.
*/

public class J007_Switch {
    public static void main(String [] args){
        int choice = 2;

        // 1 = Coffee
        // 2 = Tea

    switch (choice) {
      case 1:
        System.out.println("You ordered Coffee");
        break;
      case 2:
        System.out.println("You ordered Tea");
        break;
      default:
        System.out.println("Invalid choice");
        break;
    }
    }
    
}

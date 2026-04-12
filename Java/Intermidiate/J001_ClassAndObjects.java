
import java.util.Scanner;

public class J001_ClassAndObjects {
    String name;
    
    public static void main(String[] args) {
        
        // get input values for name1 and name2
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Name :");
        String name1 = input.nextLine();
        System.out.println("Enter Name :");
        String name2 = input.nextLine();
        
        // create objects person1 and person2
        J001_ClassAndObjects P1 = new J001_ClassAndObjects();
        J001_ClassAndObjects P2 = new J001_ClassAndObjects();
        
        // assign values of name for both objects
        P1.name = name1;
        P2.name = name2;
        
        // print values
        System.out.println(P1.name);
        System.out.println(P2.name);

        input.close();
    }
}


// Student Class
class StudentDetails {
    
    String name;
    int score;
    
    StudentDetails(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

// Main Class
public class J004_ParameterisedConstructor {
    public static void main(String[] args) {
        
        // create objects
        StudentDetails student1 = new StudentDetails("Jack", 78);
        StudentDetails student2 = new StudentDetails("Rosa", 32);
        
        // print fields for student1
        System.out.println("---First Student---");
        System.out.println("Name: " + student1.name);
        System.out.println("Score: " + student1.score);
        
        // print fields for student2
        System.out.println("---Second Student---");
        System.out.println("Name: " + student2.name);
        System.out.println("Score: " + student2.score);
    }
}


// Parent Class
class CommonMan {
    public void displayInfo() {
        System.out.println("I am a Common Man.");
    }
}

// extend Student from Person and override displayInfo()
class CollegeStudent extends CommonMan {

    public void displayInfo() {
        System.out.println("I am a College Student.");
    }
}

// extend Employee from CommonMan and override displayInfo()
class Employee extends CommonMan {
     public void displayInfo() {
        System.out.println("I am an Employee.");
    }
}

class J010_HierarchicalInheritance {
    public static void main(String[] args) {

        // create objects of Student and Employee class
        CollegeStudent student1 = new CollegeStudent();
        Employee employee1 = new Employee();

        // call displayInfo() using student1
        student1.displayInfo();


        // call displayInfo() using employee1
        employee1.displayInfo();

    }
}




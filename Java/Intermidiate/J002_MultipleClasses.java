
//Student Class
class Student {

    String name;
    int score;

    void checkPassFail(String name, int score) {

        if (score >= 35) {
            System.out.println(name + " passed the exam.");
        } else {
            System.out.println(name + " failed the exam.");
        }
    }
}

//Main Class
public class J002_MultipleClasses {

    public static void main(String[] args) {

        // create first object
        Student student1 = new Student();
        student1.name = "Jack";
        student1.score = 78;

        // call checkPassFail with name and score of student1
        student1.checkPassFail(student1.name, student1.score);

        // create second object
        Student student2 = new Student();
        student2.name = "Rosa";
        student2.score = 32;

        // call checkPassFail with name and score of student2
        student2.checkPassFail(student2.name, student2.score);
    }
}
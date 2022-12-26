public class copyConstructor {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name = "name";
        s1.roll = 123;
        s1.password = 12345;
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s2 = new Student(s1);
        s2.password = 1234567;
        s1.marks[2] = 100;              // this change would bee seen in s2 
        for(int i=0; i<3; i++) {        // because marks is passed by reference
            System.out.print(s2.marks[i] + " ");
        }
    }
}

class Student {
    String name;
    int roll;
    int password;
    int marks[];

    Student() {
        marks = new int[3];
    }

    // shallow copy constructor (by reference):
    // Student(Student s) {
    //     marks = new int[3];
    //     this.name = s.name;
    //     this.roll = s.roll;
    //     this.marks = s.marks;
    // }

    // deep copy constructor (no reference):
    Student(Student s) {
        marks = new int[3];
        this.name = s.name;
        this.roll = s.roll;

        for(int i=0; i<3; i++) {
            this.marks[i] = s.marks[i];
        }
    }
}

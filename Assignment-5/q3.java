// 3. A HighSchool application has two classes: the Person superclass and the student subclass.
// Using inheritance, in this lab you will create two new classes, Teacher and College Student.
// A Teacher will be like Person but will have additional properties such as salary
// (the amount the teacher earns) and subject (e.g. “Computer Science”, “Chemistry”, “English”, “Other”).
// The CollegeStudent class will extend the Student class by adding a year (current level in college)
// and major (e.g. “Electrical Engineering”, “Communications”, “Undeclared”).

class Person {

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Student extends Person {

    String idNum;
    double gpa;

    public Student(String name, int age, String idNum, double gpa) {
        super(name, age);
        this.idNum = idNum;
        this.gpa = gpa;
    }
}

class Teacher extends Person {

    double salary;
    String subject;

    public Teacher(String name, int age, double salary, String subject) {
        super(name, age);
        this.salary = salary;
        this.subject = subject;
    }
}

class CollegeStudent extends Student {

    int year;
    String major;

    public CollegeStudent(String name, int age, String idNum, double gpa, int year, String major) {
        super(name, age, idNum, gpa);
        this.year = year;
        this.major = major;
    }
}

public class q3 {

    public static void main(String[] args) {
        Teacher t = new Teacher("Alex", 45, 12.25, "Computer Science");
        Student s = new Student("Foo", 12, "12345", 6.7);
        CollegeStudent cs = new CollegeStudent("Bar", 17, "56789", 9.7, 2, "CS");
    }
}

/*
Teacher: Alex
Age: 45
Salary: 12.25
Subject: COmputer Science

Student: Foo
Age: 12
ID: 12345
GPA: 6.7

College Student: Bar
Age: 17
ID: 56789
GPA: 9.7
Year: 2
Major:CS
*/

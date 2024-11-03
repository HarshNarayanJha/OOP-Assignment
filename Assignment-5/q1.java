// 1. Write a Patient class which inherits from the Person class. Patient can again be two types: indoor and outdoor.
// The Patient class requires the following:
// a) a variable to store the patient ID for
// b) a variable to store the department of hospital
// c) a variable to store the ward of hospital
// d) a variable to store the patient 's date of joining the hospital
// e) a variable to store the patient 's address
// f) a variable to store the medical fees that the patient pays.
// g) constructor methods, which initialize the variables
// h) a method to calculate the medical fees (for both indoor and outdoor patient)

class Person {

    String name;
    int age;
    String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}

class Patient extends Person {

    String patientID;
    String department;
    String ward;
    String dateOfJoining;
    String address;
    double medicalFees;
    boolean isIndoor;

    public Patient(
        String name,
        int age,
        String gender,
        String patientID,
        String department,
        String ward,
        String dateOfJoining,
        String address,
        boolean isIndoor
    ) {
        super(name, age, gender);
        this.patientID = patientID;
        this.department = department;
        this.ward = ward;
        this.dateOfJoining = dateOfJoining;
        this.address = address;
        this.isIndoor = isIndoor;
    }

    public double calculateMedicalFees() {
        if (isIndoor) {
            // Indoor patient fees calculation
            medicalFees = 1000.0; // Base fee
            medicalFees += 500.0; // Ward charges
            medicalFees += 200.0; // Nursing charges
        } else {
            // Outdoor patient fees calculation
            medicalFees = 500.0; // Base consultation fee
            medicalFees += 100.0; // Medicine charges
        }
        return medicalFees;
    }
}

public class q1 {

    public static void main(String[] args) {
        // Create an indoor patient
        Patient indoorPatient = new Patient(
            "John Doe",
            35,
            "Male",
            "P001",
            "Cardiology",
            "Ward A",
            "2023-07-01",
            "123 Main St",
            true
        );

        // Create an outdoor patient
        Patient outdoorPatient = new Patient(
            "Jane Smith",
            28,
            "Female",
            "P002",
            "Orthopedics",
            "N/A",
            "2023-07-02",
            "456 Oak Ave",
            false
        );

        // Calculate and display fees for indoor patient
        System.out.println("Indoor Patient Details:");
        System.out.println("Patient ID: " + indoorPatient.patientID);
        System.out.println("Department: " + indoorPatient.department);
        System.out.println("Medical Fees: ₹" + indoorPatient.calculateMedicalFees());

        System.out.println();

        // Calculate and display fees for outdoor patient
        System.out.println("Outdoor Patient Details:");
        System.out.println("Patient ID: " + outdoorPatient.patientID);
        System.out.println("Department: " + outdoorPatient.department);
        System.out.println("Medical Fees: ₹" + outdoorPatient.calculateMedicalFees());
    }
}
/* Output

Indoor Patient Details:
Patient ID: P001
Department: Cardiology
Medical Fees: $1700.0

Outdoor Patient Details:
Patient ID: P002
Department: Orthopedics
Medical Fees: $600.0

*/

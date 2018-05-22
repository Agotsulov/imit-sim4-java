public class Student extends Human{

    private String university;
    private String faculty;
    private String specialty;

    public Student(String lastName, String middleName, String fistName, int age, Gender gender, String university, String faculty, String specialty) {
        super(lastName, middleName, fistName, age, gender);
        this.university = university;
        this.faculty = faculty;
        this.specialty = specialty;
    }
}

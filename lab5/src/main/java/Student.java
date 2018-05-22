public class Student extends Human {

    private String nameSchool;

    public Student(String name, String nameSchool) {
        super(name);
        this.nameSchool = nameSchool;
    }

    public String getNameSchool() {
        return nameSchool;
    }

    public void setNameSchool(String nameSchool) {
        this.nameSchool = nameSchool;
    }
}

public class Student extends Human {

    private String nameFaculty;

    public Student(String lastName, String firstName, String middleName, int age, String nameFaculty) {
        super(lastName, firstName, middleName, age);
        this.nameFaculty = nameFaculty;
    }

    public String getNameFaculty() {
        return nameFaculty;
    }

    public void setNameFaculty(String nameFaculty) {
        this.nameFaculty = nameFaculty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        if (!super.equals(o)) return false;

        Student student = (Student) o;

        return nameFaculty != null ? nameFaculty.equals(student.nameFaculty) : student.nameFaculty == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (nameFaculty != null ? nameFaculty.hashCode() : 0);
        return result;
    }
}

public class Human implements Comparable<Human>{

    private String firstName;
    private String lastName;
    private String middleName;

    private int age;


    public Human(String lastName, String firstName, String middleName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFullName(){
        return getFirstName() + " " + getLastName() + " " + getMiddleName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human)) return false;

        Human human = (Human) o;

        if (getAge() != human.getAge()) return false;
        if (getFirstName() != null ? !getFirstName().equals(human.getFirstName()) : human.getFirstName() != null)
            return false;
        if (getLastName() != null ? !getLastName().equals(human.getLastName()) : human.getLastName() != null)
            return false;
        return getMiddleName() != null ? getMiddleName().equals(human.getMiddleName()) : human.getMiddleName() == null;
    }

    @Override
    public int hashCode() {
        int result = getFirstName() != null ? getFirstName().hashCode() : 0;
        result = 31 * result + (getLastName() != null ? getLastName().hashCode() : 0);
        result = 31 * result + (getMiddleName() != null ? getMiddleName().hashCode() : 0);
        result = 31 * result + getAge();
        return result;
    }

    public int compareTo(Human human) {
        return getFullName().compareTo(human.getFullName());
    }
}

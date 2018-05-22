public class Human {

    private String name;

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static String getWordHuman() {
        return "Human";
    }


    public static void setNofing(int a) {
        System.out.println(a);
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setNameAndNickname(String name, String nickname) {
        this.name = name + "\"" + nickname + "\"";
    }


    public int setName(int a) {
        return a;
    }

    public static void setPrintName(String name) {
        System.out.println(name);
    }

    public boolean isTrue() {
        return true;
    }

    public Boolean hasFalse() {
        return false;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                '}';
    }
}

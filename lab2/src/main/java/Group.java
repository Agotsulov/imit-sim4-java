import java.util.Arrays;

public class Group {

    private int number;
    private int data[];

    public Group(int number, int ... data) {
        this.number = number;
//        this.data = data;
        this.data = new int[data.length];
        for(int i = 0;i < data.length;i++)
            this.data[i] = data[i];
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Group)) return false;

        Group group = (Group) o;

        if (getNumber() != group.getNumber()) return false;
        return Arrays.equals(getData(), group.getData());
    }

    @Override
    public int hashCode() {
        int result = getNumber();
        result = 31 * result + Arrays.hashCode(getData());
        return result;
    }
}

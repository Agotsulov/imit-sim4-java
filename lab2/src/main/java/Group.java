import java.util.Arrays;

public class Group {

    private int id;
    private int data[];

    public Group(int id, int ... data) {
        this.id = id;
        this.data = new int[data.length];
        for(int i = 0;i < data.length;i++)
            this.data[i] = data[i];
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

        if (getId() != group.getId()) return false;
        return Arrays.equals(getData(), group.getData());
    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + Arrays.hashCode(getData());
        return result;
    }
}

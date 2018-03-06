import java.util.Iterator;

public class Data implements Iterable {

    private String name;
    private Group groups[];

    public Data(String name, Group ... groups) {
        this.name = name;
        this.groups = groups;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Group[] getGroups() {
        return groups;
    }

    public void setGroups(Group[] groups) {
        this.groups = groups;
    }

    public Iterator iterator() {
        return new DataIterator(this);
    }
}

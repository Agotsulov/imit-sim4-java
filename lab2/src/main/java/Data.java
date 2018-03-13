import java.util.Iterator;

public class Data implements Iterable {

    private String name;
    private Group groups[];

    public Data(String name, Group ... groups) {
        this.name = name;
        this.groups = new Group[groups.length];
        for(int i = 0;i < groups.length;i++)
            this.groups[i] = new Group(groups[i].getNumber(), groups[i].getData());
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
        for(int i = 0;i < groups.length;i++)
            this.groups[i] = new Group(groups[i].getNumber(), groups[i].getData());
    }

    public Iterator iterator() {
        return new DataIterator(this);
    }
}

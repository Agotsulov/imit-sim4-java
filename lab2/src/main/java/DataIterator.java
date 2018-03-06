import java.util.Iterator;

public class DataIterator implements Iterator{

    private int index = 0;
    private int groupIndex = 0;
    private int currentIndex = 0;
    private int max = 0;
    private Data data;
    private Group currentGroup;


    public DataIterator(Data data){
        this.data = data;
        for(Group g:data.getGroups())
            max += g.getData().length;
        currentGroup = data.getGroups()[groupIndex];
    }

    public boolean hasNext() {
        return (data.getGroups().length == groupIndex);
    }

    public Integer next() {
        if(hasNext()) {
            int result = data.getGroups()[groupIndex].getData()[currentIndex];
            currentIndex++;
            if(currentIndex >= data.getGroups()[groupIndex].getData().length)
                groupIndex++;
            return result;
        } else
            return null;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}

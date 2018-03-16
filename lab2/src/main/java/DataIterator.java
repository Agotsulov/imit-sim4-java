import java.util.Iterator;

public class DataIterator implements Iterator{

    private int groupIndex = 0;
    private int currentIndex = 0;
    private Data data;

    public DataIterator(Data data){
        this.data = data;
    }

    public boolean hasNext() {
        return !(groupIndex >= data.getGroups().length);
    }

    public Integer next() {
        if(hasNext()) {
            int result = data.getGroups()[groupIndex].getData()[currentIndex];
            //System.out.println(" i = " + currentIndex + " g = " + groupIndex + " v = " + result);
            currentIndex++;
            if(currentIndex >= data.getGroups()[groupIndex].getData().length) {
                groupIndex++;
                currentIndex = 0;
            }
            return result;
        } else
            return null;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }

    public int currentGroup(){ return groupIndex; }
}

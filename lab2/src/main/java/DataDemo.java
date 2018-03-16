import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DataDemo {

    public static List<Integer> getAll(Data data){
        Set<Integer> last = new HashSet<Integer>();
        DataIterator dataIterator = (DataIterator) data.iterator();

        while( (dataIterator.hasNext()) && (dataIterator.currentGroup() == 0) )
            last.add(dataIterator.next());

        int lastGroup = 1;
        Set<Integer> current = new HashSet<Integer>();
        while( (dataIterator.hasNext()) ){
            if(dataIterator.currentGroup() == lastGroup) {
                current.add(dataIterator.next());
            } else {
                Set<Integer> merger = new HashSet<Integer>();
                for(int i:current)
                    if(last.contains(i))
                        merger.add(i);
                last = merger;
                current.clear();
                lastGroup = dataIterator.currentGroup();
            }
        }

        Set<Integer> merger = new HashSet<Integer>();
        for(int i:current)
            if(last.contains(i))
                merger.add(i);
        last = merger;

        return new ArrayList<Integer>(last);
    }
}

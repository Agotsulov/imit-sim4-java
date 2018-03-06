import java.util.ArrayList;
import java.util.List;

public class DataDemo {

    public static List<Integer> getAll(Data data){
        List<Integer> result = new ArrayList<Integer>();
        DataIterator dataIterator = (DataIterator) data.iterator();
        while(dataIterator.hasNext())
            result.add(dataIterator.next());
        return result;
    }
}

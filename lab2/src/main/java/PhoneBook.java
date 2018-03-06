import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PhoneBook extends HashMap<Human, String> {

    public List<String> getAll(Human human){
        List<String> result = new ArrayList<String>();
        for(Human h:this.keySet())
            if(h.equals(human)) result.add(get(h));
        return result;
    }

}

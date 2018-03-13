import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook extends HashMap<Human, List<String>> {

    public void put(Human key, String number){
        for(Human h:keySet())
            if(h.equals(key)) {
                get(h).add(number);
                return;
            }
        List<String> blay = new ArrayList<String>();
        blay.add(number);
        super.put(key, blay);
    }

    public void remove(Human key,String number){
        get(key).remove(number);
    }

    public Human find(String number){
        for (Map.Entry<Human, List<String>> pair : this.entrySet())
            for(String n:pair.getValue())
                if(n.equals(number)) return pair.getKey();
        return null;
    }
}

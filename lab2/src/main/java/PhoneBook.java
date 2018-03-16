import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook extends HashMap<Human, List<String>> {

    public void put(Human key, String number){
        if(this.containsKey(key)){
            this.get(key).add(number);
        } else {
            List<String> numbers = new ArrayList<String>();
            numbers.add(number);
            this.put(key, numbers);
        }
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

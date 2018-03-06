import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ListDemo {

    public int found(List<String> strings, char symbol){
        int result = 0;
        for(String s:strings)
            if(s.startsWith(symbol + ""))
                result++;
        return result;
    }

    public List<Human> found(List<Human> humans, Human human){
        List<Human> result = new ArrayList<Human>();
        for(Human h:humans)
            if(h.getLastName().equals(human.getLastName()))
                result.add(h);
        return result;
    }


    public List<Human> remove(List<Human> humans, Human human){
        List<Human> result = new ArrayList<Human>(humans);
        result.remove(human);
        return result;
    }

    public List<Set<Integer>> found(List<Set<Integer>> sets,Set<Integer> set){
        List<Set<Integer>> result = new ArrayList<Set<Integer>>();
        for(Set<Integer> s:sets)
            if(s.retainAll(set)) result.add(s);
        return result;
    }

    public List<Human> foundWithMaxAge(List<Human> humans){
        List<Human> result = new ArrayList<Human>();
        int maxAge = 0;
        for(Human h:humans)
            if(h.getAge() > maxAge){
                result.clear();
                maxAge = h.getAge();
                result.add(h);
            } else if(h.getAge() == maxAge)
                result.add(h);
        return result;
    }

    public List<Human> found(Map<Integer, Human> humans, Set<Integer> numbers){
        List<Human> result = new ArrayList<Human>();
        for(Integer i:numbers)
            result.add(humans.get(i));
        return result;
    }

    public List<Integer> found(Map<Integer, Human> humans){
        List<Integer> result = new ArrayList<Integer>();
        for(Integer i:humans.keySet())
            if(humans.get(i).getAge() >= 18) result.add(i);
        return result;
    }


}

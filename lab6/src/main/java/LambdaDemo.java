import java.util.List;

public class LambdaDemo {

    public static final Universal<String,Integer> length = String::length;
    public static final Universal<String,Character> find = s -> {
        if(s.length() != 0)
            return s.charAt(0);
        else
            return '\0';

    };
    public static final Universal<String,Boolean> checkSpaces = s -> (s.split(" ").length <= 1);
    public static final Universal<String,Integer> countWords = s -> (s.split(",").length);
    public static final Universal<Human,Integer> getAge = h -> (h.getAge());
    public static final Universal<List<Human>,Boolean> compareHumans = (t) ->
            (t.get(0).getLastName().equals(t.get(1).getLastName()));
    public static final Universal<Human,String> getFullName = h ->
            (h.getLastName() + " " + h.getMiddleName() + " " + h.getFirstName());
    public static final Universal<Human,Human> getOlderHuman = h ->
            (new Human(h.getLastName(),h.getMiddleName(),h.getFirstName(),h.getAge() + 1,h.getGender()));
    public static final UniversalWithInt<List<Human>,Boolean> checkHumansOlderThenAge= (humans, maxAge) -> {
        for(Object h:humans)
            if((h instanceof Human) && (((Human) h).getAge() > maxAge))
                return false;
        return true;
    };

    @FunctionalInterface
    interface Universal<T, E>{
        E f(T t);
    }

    @FunctionalInterface
    interface UniversalWithInt<T, E>{
        E f(T t, int number);
    }



}

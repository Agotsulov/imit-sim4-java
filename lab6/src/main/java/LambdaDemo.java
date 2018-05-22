import java.util.List;

public class LambdaDemo {

    public static final IntOperator length = String::length;
    public static final FindOperator find = s -> {
        if(s.length() != 0)
            return s.charAt(0);
        else
            return '\0';

    };
    public static final CheckOperator checkSpaces = s -> (s.split(" ").length <= 1);
    public static final IntOperator countWords = s -> (s.split(",").length);
    public static final IntHumanOperator getAge = h -> (h.getAge());
    public static final BooleanTwoHumanOperator compareHumans = (h1, h2) ->
            (h1.getLastName().equals(h2.getLastName()));
    public static final StringHumanOperator getFullName = h ->
            (h.getLastName() + " " + h.getMiddleName() + " " + h.getFirstName());
    public static final HumanHumanOperator getOlderHuman = h ->
            (new Human(h.getLastName(),h.getMiddleName(),h.getFirstName(),h.getAge() + 1,h.getGender()));
    public static final BooleanListHumanOperator checkHumansOlderThenAge= (humans,maxAge) -> {
        for(Object h:humans)
            if((h instanceof Human) && (((Human) h).getAge() > maxAge))
                return false;
        return true;
    };

    @FunctionalInterface
    interface IntOperator {
        int doit(String s);
    }

    @FunctionalInterface
    interface FindOperator{
        char doit(String s);
    }

    @FunctionalInterface
    interface CheckOperator{
        boolean doit(String s);
    }

    @FunctionalInterface
    interface IntHumanOperator<T extends Human> {
        int doit(T h);
    }

    @FunctionalInterface
    interface BooleanTwoHumanOperator<T extends Human> {
        boolean doit(T h1,T h2);
    }

    @FunctionalInterface
    interface StringHumanOperator<T extends Human> {
        String doit(T h);
    }

    @FunctionalInterface
    interface HumanHumanOperator<T extends Human> {
        Human doit(T h);
    }

    @FunctionalInterface
    interface BooleanListHumanOperator<T extends Human> {
        boolean doit(List<T> humans , int maxAge);
    }


}

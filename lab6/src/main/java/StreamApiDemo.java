import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiDemo extends LambdaDemo {

    public static final Universal<List<Object>,List<Object>> removeNullObjects = (t) -> t.stream()
                .filter(Objects::nonNull)
                .collect(Collectors.toList());

    public static final Universal<Set<Integer>,Long> findPositive = (t) ->
            t.stream().filter(x -> (x > 0)).count();

    public static final Universal<List<Object>,List<Object>> findLastThree = (list) ->
        list.stream().skip(list.size() - 3).collect(Collectors.toList());

    public static final Universal<List<Integer>,Integer> findEven = (list) ->
        list.stream().filter(i -> (i % 2 == 0)).findFirst().get();

    public static final Universal<int[],List<Integer>> setSquare = (a) ->
          Arrays.stream(a)
                .map(i -> (i * i))
                  .distinct()
                  .boxed()
                .collect(Collectors.toList());

    public static final Universal<List<String>,List<String>> ascendingNotVoidStrings = (list) ->
        list.stream().filter(Objects::nonNull).filter(s -> (s.length() != 0)).sorted().collect(Collectors.toList());
    public static final Universal<Set<String>,List<String>> descendinglyStrings = (set) ->
        new ArrayList<>(set).stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());

    public static final Universal<Set<Integer>,Integer> sumSquare = (set) ->
        set.stream()
                .mapToInt(i -> (i * i))
                .sum();

    public static final Universal<Collection<Human>,Integer> maxAge = (collection) ->
        collection.stream().max((Human h1, Human h2) -> (h1.getAge() - h2.getAge())).get().getAge();

    public static final Universal<List<Human>,List<Human>> sortGengerAge =
            (List<Human> collection) ->
       collection.stream().sorted((Human h1,Human h2) -> {
            if(h1.getGender() == h2.getGender()) return 0;
            else if((h1.getGender() == Gender.MAN) && (h2.getGender() == Gender.WOMAN)) return 1;
            return -1;
        }).collect(Collectors.toList()).stream()
               .sorted((Human h1,Human h2) -> (h1.getAge() - h2.getAge())).collect(Collectors.toList());







    @FunctionalInterface
    interface UniversalVoid<T>{
        void f(T t);
    }

}

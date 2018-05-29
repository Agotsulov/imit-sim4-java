import java.util.ArrayList;
import java.util.List;

public class LambdaRunner {

    public static <T, E> E doSomething(LambdaDemo.Universal<T,E> o,T s){
        return o.f(s);
    }

    public static <T, E> E doSomethingWithInt(LambdaDemo.UniversalWithInt<T,E> o,T s, int i){
        return o.f(s, i);
    }


    public static int getIntString(LambdaDemo.Universal<String,Integer> o,String s){
        return o.f(s); //1 4
    }

    public static char getFirstSymbol(LambdaDemo.Universal<String,Character> o, String s){
        return o.f(s);
    }

    public static boolean checkSpaces(LambdaDemo.Universal<String,Boolean> o,String s){
        return o.f(s);
    }

    public static int getAge(LambdaDemo.Universal<Human,Integer> o, Human h){
        return o.f(h);
    }

    public static boolean checkNamesake(LambdaDemo.Universal<List<Human>,Boolean> o, Human h1, Human h2){
        List<Human> list = new ArrayList<>();
        list.add(h1);
        list.add(h2);
        return o.f(list);
    }

    public static String getFullName(LambdaDemo.Universal<Human,String> o, Human h){
        return o.f(h);
    }

    public static Human getHumanOlder(LambdaDemo.Universal<Human,Human> o, Human h){
        return o.f(h);
    }

    public static boolean checkMaxAgeHumans(LambdaDemo.UniversalWithInt<List<Human>,Boolean> o, List<Human> humans, int maxAge){
        return o.f(humans, maxAge);
    }
}

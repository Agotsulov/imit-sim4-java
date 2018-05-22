import java.util.List;

public class LambdaRunner {

    public static int getIntString(LambdaDemo.IntOperator o,String s){
        return o.doit(s); //1 4
    }

    public static char getFirstSymbol(LambdaDemo.FindOperator o, String s){
        return o.doit(s);
    }

    public static boolean checkSpaces(LambdaDemo.CheckOperator o,String s){
        return o.doit(s);
    }



    public static int getAge(LambdaDemo.IntHumanOperator o, Human h){
        return o.doit(h);
    }

    public static boolean checkNamesake(LambdaDemo.BooleanTwoHumanOperator o, Human h1, Human h2){
        return o.doit(h1, h2);
    }

    public static String getFullName(LambdaDemo.StringHumanOperator o, Human h){
        return o.doit(h);
    }

    public static Human getHumanOlder(LambdaDemo.HumanHumanOperator o, Human h){
        return o.doit(h);
    }

    public static boolean checkMaxAgeHumans(LambdaDemo.BooleanListHumanOperator o, List<Human> humans, int maxAge){
        return o.doit(humans, maxAge);
    }
}

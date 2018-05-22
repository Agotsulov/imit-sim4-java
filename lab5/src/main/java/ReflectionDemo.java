import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import java.lang.reflect.Type;


public class ReflectionDemo {

    public static int findHumans(List<?> objects){
        int result = 0;
        for(int i = 0;i < objects.size();i++) {
            if(objects.get(i) instanceof Human)
                result++;
        }
        return result;
    }


    public static List<String> getMethods(Object o){
        List<String> names = new ArrayList<String>();

        Method[] methods = o.getClass().getDeclaredMethods();

        for(Method m:methods)
            names.add(m.getName());

        if(!o.getClass().getName().equals("java.lang.Class"))
            names.addAll(getMethods(o.getClass().getSuperclass()));

        return names;
    }


    public static List<String> getPublicMethods(Class c){
        List<String> names = new ArrayList<String>();

        Method[] methods = c.getDeclaredMethods();

        for(Method m:methods)
            if(m.getModifiers() == Modifier.PUBLIC)
                names.add(m.getName());

        return names;
    }

    public static int findAndUseExecutable(List<?> objects){
        int result = 0;
        for(int i = 0;i < objects.size();i++) {
            if(objects.get(i) instanceof Executable) {
                ((Executable) objects.get(i)).execute();
                result++;
            }
        }
        return result;
    }

    public static List<String> getGettessAndSetters(Object o){
        List<String> names = new ArrayList<String>();

        Method[] methods = o.getClass().getDeclaredMethods();

        for(Method m:methods){
            if(m.getModifiers() == Modifier.PUBLIC) {
                String s = m.getName().substring(0, 3);
                if (
                        ((s.equals("get"))
                        && (m.getParameters().length == 0)
                        && (!m.getReturnType().getName().equals("void"))
                        ) || (
                                ((s.substring(0,2).equals("is")) || (s.equals("has")))
                                        && (m.getParameters().length == 0)
                                        && ((m.getReturnType().getName().equals("boolean")) || (m.getReturnType().getName().equals("java.lang.Boolean"))
                                )

                        ) || (
                                (s.equals("set"))
                                        && (m.getReturnType().getName().equals("void"))
                                        && (m.getParameters().length == 1))
                        ){
                    names.add(m.getName());
                }
            }
        }
        return names;
    }

}

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ReflectionDemoTest {

    @Test
    public void findHumans() {
        List<Object> objects = new ArrayList<Object>();

        objects.add(new Animal("Dog"));
        objects.add(new Animal("Cat"));

        List<Object> expected = new ArrayList<Object>();

        expected.add(new Human("Ivan"));
        expected.add(new Human("Idiot"));
        expected.add(new Human("Igor"));

        expected.add(new Student("A","OMGU"));
        expected.add(new Student("D","OMGU"));

        objects.addAll(expected);

        assertEquals(expected.size(), ReflectionDemo.findHumans(objects));
    }

    @Test
    public void getMethods() {
        System.out.println(ReflectionDemo.getMethods(new Human("AAA")));
    }


    @Test
    public void getPublicMethods() {
        System.out.println(ReflectionDemo.getPublicMethods(Human.class));
    }

    @Test
    public void findAndUseExecutable(){
        List<Object> objects = new ArrayList<Object>();

        objects.add(new Animal("Dog"));
        objects.add(new Animal("Cat"));

        objects.add(new Human("Ivan"));
        objects.add(new Human("Idiot"));
        objects.add(new Human("Igor"));

        objects.add(new Student("A","OMGU"));
        objects.add(new Student("D","OMGU"));

        List<Executable> expected = new ArrayList<Executable>();

        expected.add(new PrintConsole("LOL"));
        expected.add(new PrintConsole("I HATE CPP"));

        objects.addAll(expected);

        assertEquals(expected.size(), ReflectionDemo.findAndUseExecutable(objects));
    }


    @Test
    public void getGettessAndSetters() {
        System.out.println(ReflectionDemo.getGettessAndSetters(new Human("AAA")));
    }
}
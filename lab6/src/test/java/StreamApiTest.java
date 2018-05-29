import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

public class StreamApiTest {

    @Test
    public void testRemoveNullObjects() {
        List<Object> objects = new ArrayList<>();
        objects.add(null);
        objects.add(null);
        objects.add(new Human("aga","aga","aga",15,Gender.MAN));
        objects.add(new Human("ahashga","aga","aga",15,Gender.MAN));
        objects.add(new Human("aaggaga","aga","aga",15,Gender.MAN));
        objects.add(new Human("aafaga","aga","aga",15,Gender.MAN));
        objects.add(null);


        assertEquals(4, StreamApiDemo.removeNullObjects.f(objects).size());
    }

    @Test
    public void testFindFirstPositive(){
        Set<Integer> integers = new HashSet<>();

        integers.add(-12412);
        integers.add(0);
        integers.add(-3);
        integers.add(12);
        integers.add(-6);
        integers.add(0);
        integers.add(0);
        integers.add(-4);
        integers.add(15212);

        long result = StreamApiDemo.findPositive.f(integers);
        assertEquals(2, result);
    }

    @Test
    public void testFindLastThree(){
        List<Object> integers = new ArrayList<>();

        integers.add(-12412);
        integers.add(0);
        integers.add(-3);
        integers.add(12);
        integers.add(-6);
        integers.add(0);
        integers.add(0);
        integers.add(-4);
        integers.add(15212);

        List<Object> result = StreamApiDemo.findLastThree.f(integers);

        List<Object> expect = new ArrayList<>();

        expect.add(0);
        expect.add(-4);
        expect.add(15212);

        assertEquals(expect, result);
    }

    @Test
    public void testFindEven(){
        List<Integer> integers = new ArrayList<>();

        integers.add(1);
        integers.add(-3);
        integers.add(12);
        integers.add(-6);
        integers.add(0);
        integers.add(0);
        integers.add(-4);
        integers.add(15212);

        int result = StreamApiDemo.findEven.f(integers);

        assertEquals(12, result);
    }

    @Test
    public void testAscendingNotVoidStrings(){
        List<String> strings = new ArrayList<>();

        strings.add("aadafa");
        strings.add("aa");
        strings.add("ab");
        strings.add(null);
        strings.add("");
        strings.add("");
        strings.add("b");


        List<String> expect = new ArrayList<>();

        expect.add("aa");
        expect.add("aadafa");
        expect.add("ab");
        expect.add("b");

        assertEquals(expect , StreamApiDemo.ascendingNotVoidStrings.f(strings));
    }

    @Test
    public void testDescendinglyStrings(){
        Set<String> strings = new HashSet<>();

        strings.add("aadafa");
        strings.add("aa");
        strings.add("ab");
        strings.add("");
        strings.add("b");


        List<String> expect = new ArrayList<>();


        expect.add("b");
        expect.add("ab");
        expect.add("aadafa");
        expect.add("aa");
        expect.add("");

        assertEquals(expect , StreamApiDemo.descendinglyStrings.f(strings));
    }

    @Test
    public void testMaxAge(){
        List<Human> humans = new ArrayList<>();
        humans.add(new Human("aga","aga","aga",15,Gender.MAN));
        humans.add(new Human("ahashga","aga","aga",74,Gender.MAN));
        humans.add(new Human("aaggaga","aga","aga",100,Gender.MAN));
        humans.add(new Human("aafaga","aga","aga",11,Gender.MAN));

        int result = StreamApiDemo.maxAge.f(humans);

        assertEquals(100, result);
    }

    @Test
    public void testSortGenderAge(){
        List<Human> humans = new ArrayList<>();
        humans.add(new Human("aga","aga","aga",15,Gender.MAN));
        humans.add(new Human("ahashga","aga","aga",74,Gender.MAN));
        humans.add(new Human("aaggaga","aga","aga",100,Gender.WOMAN));
        humans.add(new Human("aafaga","aga","aga",11,Gender.MAN));
        humans.add(new Human("aafaga","aga","aga",11,Gender.WOMAN));

        List<Human> result = StreamApiDemo.sortGengerAge.f(humans);

        result.stream().forEach(System.out::println);

        //assertEquals(100, result);
    }

    @Test
    public void testSetSquare(){
        int[] a = {5,1,6,3};

        List<Integer> result = StreamApiDemo.setSquare.f(a);

        List<Integer> expect = new ArrayList<>();

        expect.add(25);
        expect.add(1);
        expect.add(36);
        expect.add(9);

        assertEquals(expect,result);
    }

    @Test
    public void testSumSquare(){
        Set<Integer> integers = new HashSet<>();

        integers.add(5);
        integers.add(5);
        integers.add(2);

        int result = StreamApiDemo.sumSquare.f(integers);

        assertEquals( 29 , result);
    }

}



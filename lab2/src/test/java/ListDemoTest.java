import org.junit.Test;

import javax.swing.event.ListDataEvent;
import java.util.*;

import static org.junit.Assert.*;

public class ListDemoTest {

    @Test
    public void found() throws Exception {
        List<String> in = new ArrayList<String>();
        in.add("abab");
        in.add("124b");
        in.add("a125b");
        in.add("a");
        in.add("");
        in.add("gaaaaaaaaa");
        in.add("ga");
        assertEquals(3,ListDemo.found(in, 'a'));
        in.add("aaaaa");
        assertEquals(4,ListDemo.found(in, 'a'));
    }

    @Test
    public void found1() throws Exception {
        List<Human> in = new ArrayList<Human>();
        List<Human> expect = new ArrayList<Human>();
        List<Human> result;

        in.add(new Human("agag","aagfd","bvcx",51));
        in.add(new Human("aaa","aasfbvd","bbvcx",10));
        in.add(new Human("61g","gfdshgfd","bgasgvcx",116));
        in.add(new Human("aaa","aash","bvcbx",3164));
        in.add(new Human("32515g","aagfd","bvcx",1));
        in.add(new Human("sfb","aagfd","vcxzbb",2146));
        in.add(new Human("a","aanxcxvgfd","cx124",33));
        in.add(new Human("aa","axbvxcagfd","bvcsdgsx",56));
        in.add(new Human("aaa","aagxvbcxvbfd","bsdhvcx",1));

        expect.add(new Human("aaa","aasfbvd","bbvcx",10));
        expect.add(new Human("aaa","aash","bvcbx",3164));
        expect.add(new Human("aaa","aagxvbcxvbfd","bsdhvcx",1));


        result = ListDemo.found(in,new Human("aaa","bbb","bbb",3));

        assertArrayEquals(expect.toArray(), result.toArray());
    }

    @Test
    public void remove() throws Exception {
        List<Human> in = new ArrayList<Human>();
        List<Human> expect;
        List<Human> result;

        in.add(new Human("agag","aagfd","bvcx",51));
        in.add(new Human("aaa","aasfbvd","bbvcx",10));
        in.add(new Human("61g","gfdshgfd","bgasgvcx",116));
        in.add(new Human("aaa","aash","bvcbx",3164));
        in.add(new Human("32515g","aagfd","bvcx",1));
        in.add(new Human("sfb","aagfd","vcxzbb",2146));
        in.add(new Human("a","aanxcxvgfd","cx124",33));
        in.add(new Human("aa","axbvxcagfd","bvcsdgsx",56));
        in.add(new Human("aaa","aagxvbcxvbfd","bsdhvcx",1));

        expect = new ArrayList<Human>(in);
        expect.remove(new Human("aaa","aagxvbcxvbfd","bsdhvcx",1));

        result = ListDemo.remove(in, new Human("aaa","aagxvbcxvbfd","bsdhvcx",1));

        assertEquals(9, in.size());
        assertEquals(expect.size(), result.size());
        assertArrayEquals(expect.toArray(), result.toArray());
    }

    @Test
    public void found2() throws Exception {
        List<Set<Integer>> in = new ArrayList<Set<Integer>>();
        List<Set<Integer>> expect = new ArrayList<Set<Integer>>();

        Set<Integer> a1 = new HashSet<Integer>();
        a1.add(5);
        a1.add(3);
        a1.add(2);

        Set<Integer> a2 = new HashSet<Integer>();
        a2.add(33333);
        a2.add(3333);
        a2.add(333);
        a2.add(333);
        a2.add(33);

        Set<Integer> a3 = new HashSet<Integer>();
        a3.add(125);
        a3.add(0);

        Set<Integer> a4 = new HashSet<Integer>();
        a4.add(8);
        a4.add(5);
        a4.add(-6);
        a4.add(0);

        in.add(a1);
        in.add(a2);
        in.add(a3);
        in.add(a4);

        expect.add(a1);
        expect.add(a2);

        Set<Integer> other = new HashSet<Integer>();
        other.add(0);

        List<Set<Integer>> result = ListDemo.found(in, other);

        assertArrayEquals(expect.toArray(), result.toArray());
    }

    @Test
    public void foundWithMaxAge() throws Exception {
        List<Human> in = new ArrayList<Human>();
        List<Human> expect = new ArrayList<Human>();

        in.add(new Student("aaa","b","c",5,"imit"));
        in.add(new Student("asbfdgasda","b","c",32,"imit"));
        in.add(new Student("bbba","kha","c",32,"imit"));
        in.add(new Student("bbb","g","6",7,"FucKN"));
        in.add(new Human("badsbbsa","BAsdbash","Absdbasb",32));

        expect.add(new Student("asbfdgasda","b","c",32,"imit"));
        expect.add(new Student("bbba","kha","c",32,"imit"));
        expect.add(new Human("badsbbsa","BAsdbash","Absdbasb",32));

        assertArrayEquals(expect.toArray(),ListDemo.foundWithMaxAge(in).toArray());
    }

    @Test
    public void found3() throws Exception {
        Map<Integer, Human> in = new HashMap<Integer, Human>();
        List<Human> expect = new ArrayList<Human>();

        in.put(1,new Human("aaa","bbb","ads",5));
        in.put(7,new Human("aashgdha","bsahbb","aagss",19));
        in.put(6,new Human("arhsfa","bbsahb","gad",54));
        in.put(235,new Human("125a","ahsfhsafhbbb","@",21));

        expect.add(new Human("aashgdha","bsahbb","aagss",19));
        expect.add(new Human("125a","ahsfhsafhbbb","@",21));

        Set<Integer> numbers = new HashSet<Integer>();
        numbers.add(7);
        numbers.add(235);

        assertArrayEquals(expect.toArray(), ListDemo.found(in, numbers).toArray());
    }

    @Test
    public void foundMore18() throws Exception {
        Map<Integer, Human> in = new HashMap<Integer, Human>();
        List<Integer> expect = new ArrayList<Integer>();

        in.put(1,new Human("aaa","bbb","ads",5));
        in.put(7,new Human("aashgdha","bsahbb","aagss",19));
        in.put(6,new Human("arhsfa","bbsahb","gad",54));
        in.put(235,new Human("125a","ahsfhsafhbbb","@",18));

        expect.add(6);
        expect.add(7);
        expect.add(235);

        assertArrayEquals(expect.toArray(), ListDemo.foundMore18(in).toArray());
    }

    @Test
    public void sort() throws Exception {
        Set<Human> in = new HashSet<Human>();
        List<Human> expect = new ArrayList<Human>();

        in.add(new Student("aaa","b","c",5,"imit"));
        in.add(new Student("asbfdgasda","b","c",32,"imit"));
        in.add(new Student("bbba","kha","c",32,"imit"));
        in.add(new Student("bbb","g","6",7,"FucKN"));
        in.add(new Human("badsbbsa","BAsdbash","Absdbasb",32));

        expect.add(new Student("bbb","g","6",7,"FucKN"));
        expect.add(new Student("asbfdgasda","b","c",32,"imit"));
        expect.add(new Student("bbba","kha","c",32,"imit"));
        expect.add(new Student("aaa","b","c",5,"imit"));
        expect.add(new Human("badsbbsa","BAsdbash","Absdbasb",32));

        assertArrayEquals(expect.toArray(),ListDemo.sort(in).toArray());
    }

}
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class LambdaRunnerTest {

    @Test
    public void getLengthString() {
        assertEquals(10,LambdaRunner.getIntString(LambdaDemo.length, "1234567890"));
    }

    @Test
    public void getFirstSymbol() {
        assertEquals('1',LambdaRunner.getFirstSymbol(LambdaDemo.find, "1234567890"));
        assertEquals('\0',LambdaRunner.getFirstSymbol(LambdaDemo.find, ""));
    }

    @Test
    public void checkSpaces() {
        assertFalse(LambdaRunner.checkSpaces(LambdaDemo.checkSpaces, "12 34567890"));
        assertTrue(LambdaRunner.checkSpaces(LambdaDemo.checkSpaces, "1234567890"));
    }

    @Test
    public void getCountWords() {
        assertEquals(3,LambdaRunner.getIntString(LambdaDemo.countWords, "123,456,7890"));
    }

    @Test
    public void getAge() {
        assertEquals(10,
                LambdaRunner.getAge(LambdaDemo.getAge,
                        new Human("a","b","c",10,Gender.MAN)));
        assertEquals(22,
                LambdaRunner.getAge(LambdaDemo.getAge,
                        new Student("a","b","c",22,Gender.MAN,
                                "ab","abb","abab")));

    }

    @Test
    public void checkNamesake() {
        assertTrue(
                LambdaRunner.checkNamesake(LambdaDemo.compareHumans,
                        new Human("a","b","c",10,Gender.MAN),
                        new Human("a","abba","aba",23,Gender.WOMAN)));
        assertFalse(
                LambdaRunner.checkNamesake(LambdaDemo.compareHumans,
                        new Human("baba","b","c",10,Gender.MAN),
                        new Human("a","abba","ababa",23,Gender.WOMAN)));

    }

    @org.junit.Test
    public void getFullName() {
        assertEquals("a b cd",
                LambdaRunner.getFullName(LambdaDemo.getFullName,
                        new Human("a","b","cd",10,Gender.MAN)));
    }

    @org.junit.Test
    public void getHumanOlder() {
        assertEquals(11,(LambdaRunner.getHumanOlder(LambdaDemo.getOlderHuman,
                new Human("a","b","c",10,Gender.MAN))).getAge());
    }

    @org.junit.Test
    public void checkMaxAgeHumans() {
        List<Human> humans = new ArrayList<>();
        humans.add(new Human("a","b","c",10,Gender.MAN));
        humans.add(new Human("agadga","asgdgadb","czbzz",21,Gender.MAN));
        humans.add(new Human("adgsaga","agdbzb","cbzbzx3",32,Gender.MAN));

        assertTrue(LambdaRunner.checkMaxAgeHumans(LambdaDemo.checkHumansOlderThenAge, humans, 100));
        assertFalse(LambdaRunner.checkMaxAgeHumans(LambdaDemo.checkHumansOlderThenAge, humans, 10));
    }
}
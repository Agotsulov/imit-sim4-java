import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class DataDemoTest {
    @Test
    public void getAll() throws Exception {
        Group group1 = new Group(3,142,41,1,6,7,-12154124,-12154124);
        Group group2 = new Group(6,1522,1,11,7,4124,-12154124);
        Group group3 = new Group(5,532,7,1,1,-12154124);
        Group group4 = new Group(2,1,7);

        Data data = new Data("Test1", group1,group2,group3,group4);
        assertArrayEquals(new Integer[]{1,7},DataDemo.getAll(data).toArray());

        data = new Data("Test2",group1,group2,group3);
        assertArrayEquals(new Integer[]{1,-12154124,7},DataDemo.getAll(data).toArray());

        Group group5 = new Group(0,0);
        data = new Data("Test3",group1,group5);
        assertArrayEquals(new Integer[]{},DataDemo.getAll(data).toArray());

    }

}
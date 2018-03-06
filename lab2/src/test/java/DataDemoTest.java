import org.junit.Test;

import static org.junit.Assert.*;

public class DataDemoTest {
    @Test
    public void getAll() throws Exception {
        Group group1 = new Group(3,142,41,35,6,7);
        Group group2 = new Group(6,1522,1,11,123,4124);
        Group group3 = new Group(5,532,7,0);
        Data data = new Data("Test", group1,group2,group3);
        System.out.println(DataDemo.getAll(data));
    }

}
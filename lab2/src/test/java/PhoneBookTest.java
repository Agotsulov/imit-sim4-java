import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class PhoneBookTest {
    @Test
    public void getAll() throws Exception {
        PhoneBook pb = new PhoneBook();
        Human h1 = new Human("z","pft,kfcz","gbcfnm",33);
        Human h2 = new Human("t,fyst","lkby.obt","ntcns",14);
        Human h3 = new Human("aaaaa","rhbr","leib",93);


        pb.put(h2,"8124347534751244");
        pb.put(h1,"81241244");
        pb.put(h3,"815374");
        pb.put(h3,"814357534741244");
        pb.put(h1,"81345345241244");

        List<String> expect = new ArrayList<String>();

        expect.add("81241244");
        expect.add("81345345241244");

        assertArrayEquals(expect.toArray(), pb.get(h1).toArray());

        pb.remove(h1, "81241244");

        expect.remove("81241244");

        assertArrayEquals(expect.toArray(), pb.get(h1).toArray());
    }

}
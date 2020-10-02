
package kpo_lab2_1;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class KPO_lab2_1Test {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;


    @Test
    public void testWords() {
        String[] expResult = {"lac", "cul", "mul", "lab"};
        String[] result = KPO_lab2_1.words("lac cul mul lab");
        assertArrayEquals(expResult, result);
    }

    @Test
    public void testWords2() {
        String[] expResult = {"lat", "cul"};
        String[] result = KPO_lab2_1.words("lat cul");
        assertArrayEquals(expResult, result);
    }

    @Test
    public void testWords3() {
        String[] expResult = {"laba"};
        String[] result = KPO_lab2_1.words("laba");
        assertArrayEquals(expResult, result);
    }

    @Test
    public void testWords4() {
        String[] expResult = {""};
        String[] result = KPO_lab2_1.words("");
        Assert.assertArrayEquals(expResult, result);
    }

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @Test
    public void testConclusion() {
        String[] expResult = {"lac", "cul", "mul", "lab"};
        KPO_lab2_1.conclusion(expResult);
        Assert.assertEquals("lac cul\ncul lac\ncul lab\nmul lac\nmul lab\n", outContent.toString());
    }
    @Test
    public void testConclusion2() {
        String[] expResult = {""};
        KPO_lab2_1.conclusion(expResult);
        Assert.assertEquals("", outContent.toString());
    }
    @Test
    public void testConclusion3() {
        String[] expResult = {"123", "321"};
        KPO_lab2_1.conclusion(expResult);
        Assert.assertEquals("123 321\n321 123\n", outContent.toString());
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

}

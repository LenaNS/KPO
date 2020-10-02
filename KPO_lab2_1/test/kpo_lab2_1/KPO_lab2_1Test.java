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

    //Тест для проверки результата деления строки на 4-е слова
    @Test
    public void testWords4InLine() {
        String[] expResult = {"lac", "cul", "mul", "lab"};
        String[] result = KPO_lab2_1.words("lac cul mul lab");
        assertArrayEquals(expResult, result);
    }

    //Тест для проверки результата деления строки на 2 слова
    @Test
    public void testWords2InLine() {
        String[] expResult = {"lat", "cul"};
        String[] result = KPO_lab2_1.words("lat cul");
        assertArrayEquals(expResult, result);
    }

    //Тест для проверки результата деления строки на одно слова
    @Test
    public void testWords1InLine() {
        String[] expResult = {"laba"};
        String[] result = KPO_lab2_1.words("laba");
        assertArrayEquals(expResult, result);
    }

    //Тест для проверки результата деления пустой строки
    @Test
    public void testWordsEmptyString() {
        String[] expResult = {""};
        String[] result = KPO_lab2_1.words("");
        Assert.assertArrayEquals(expResult, result);
    }

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    //Тест для проверки резултата сравнения 4-ех слов
    @Test
    public void testConclusion4InLine() {
        String[] expResult = {"lac", "cul", "mul", "lab"};
        KPO_lab2_1.conclusion(expResult);
        Assert.assertEquals("lac cul\ncul lac\ncul lab\nmul lac\nmul lab\n", outContent.toString());
    }

    //Тест для проверки резултата сравнения 1-ого слова
    @Test
    public void testConclusion1InLine() {
        String[] expResult = {"laba"};
        KPO_lab2_1.conclusion(expResult);
        Assert.assertEquals("", outContent.toString());
    }

    //Тест для проверки резултата сравнения пустой строки
    @Test
    public void testConclusionEmptyString() {
        String[] expResult = {""};
        KPO_lab2_1.conclusion(expResult);
        Assert.assertEquals("", outContent.toString());
    }

    //Тест для проверки резултата сравнения 2-ух слов
    @Test
    public void testConclusion2InLine() {
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

package kpo_lab2_5;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class KPO_lab2_5Test {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    //Тест проверяет, что метод делит строку на три слова
    @Test
    public void testWords3InLine() {
        String[] expResult = {"111123", "3374", "85722"};
        String[] result = KPO_lab2_5.words("111123 3374 85722");
        assertArrayEquals(expResult, result);
    }

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    //Тест проверяет, что метод выводит наибольшую последовательность идущих подряд цифр и её длину
    @Test
    public void testComparisonWords() {
        String[] expResult = {"111123", "3374", "85722"};
        KPO_lab2_5.comparisonWords(expResult);
        Assert.assertEquals("Вывод:111123 6\n", outContent.toString());
    }

//Тест проверяет, что при пстой строке метод выведет ноль    
    @Test
    public void testComparisonWordsEmptyString() {
        String[] expResult = {""};
        KPO_lab2_5.comparisonWords(expResult);
        Assert.assertEquals("Вывод: 0\n", outContent.toString());
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

}

package kpo_lab2_4;

import java.io.File;
import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;

public class KPO_lab2_4Test {

    //Тест проверяет, что файл существует
    @Test
    public void testReaderFileExists() {
        File f = new File("lab2_4.txt");
        ArrayList<String> list = KPO_lab2_4.readerFile(f);
        Assert.assertNotNull(list);
    }

    //Тест проверяет, что файл не пустой
    @Test
    public void testReaderFileNotEmpty() {
        File f = new File("lab2_2.txt");
        ArrayList<String> list = KPO_lab2_4.readerFile(f);
        ArrayList<String> list1 = new ArrayList<String>();
        Assert.assertNotEquals(list1, list);
    }

    //Тест проверяет, что файл существует
    @Test
    public void testWriteFileExists() {
        File f = new File("laba2_4_1.txt");
        ArrayList<String> list = KPO_lab2_4.readerFile(f);
        Assert.assertNull(list);
    }

    //Тест проверяет, что файл не пустой
    @Test
    public void testWriteFileNotEmpty() {
        File f = new File("lab2_4_1.txt");
        ArrayList<String> list = KPO_lab2_4.readerFile(f);
        ArrayList<String> list1 = new ArrayList<String>();
        Assert.assertNotEquals(list1, list);
    }

}

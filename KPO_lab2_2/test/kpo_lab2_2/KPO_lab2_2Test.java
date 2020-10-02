package kpo_lab2_2;

import java.io.File;
import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;

public class KPO_lab2_2Test {

    //Тест проверяет, что файл существует
    @Test
    public void testReaderFileExists() {
        File f = new File("lab2_2.txt");
        ArrayList<String> list = KPO_lab2_2.readerFile(f);
        Assert.assertNotNull(list);
    }
    
    //Тест проверяет, что файл не существует
   @Test    
        public void testReaderFileNotExists() {
        File f = new File("laba2_2.txt");
        ArrayList<String> list = KPO_lab2_2.readerFile(f);
        Assert.assertNull(list);
    }
   
    //Тест проверяет, что файл не пустой
   @Test    
        public void testReaderFileNotEmpty() {
        File f = new File("lab2_2.txt");
        ArrayList<String> list = KPO_lab2_2.readerFile(f);
        ArrayList<String> list1 = new ArrayList<String>();        
        Assert.assertNotEquals(list1, list);
    }
    
    //Тест проверяет, что файл пустой
   @Test    
        public void testReaderFileEmpty() {
        File f = new File("lab2.txt");
        ArrayList<String> list = KPO_lab2_2.readerFile(f);
        ArrayList<String> list1 = new ArrayList<String>();        
        Assert.assertEquals(list1, list);
    }

     //Тест проверяет, что файл существует
    @Test
    public void testWriteFileExists() {
         File f = new File("laba2_2.txt");
        ArrayList<String> list = KPO_lab2_2.readerFile(f);
        Assert.assertNull(list);
    }
    
     //Тест проверяет, что файл не существует
    @Test
    public void testWriteFileNotExists() {
        File f = new File("laba2_2.txt");
        ArrayList<String> list = KPO_lab2_2.readerFile(f);
        Assert.assertNull(list);
    }
    
     //Тест проверяет, что файл не пустой
    @Test
    public void testWriteFileNotEmpty() {
        File f = new File("lab2_2.txt");
        ArrayList<String> list = KPO_lab2_2.readerFile(f);
        ArrayList<String> list1 = new ArrayList<String>();        
        Assert.assertNotEquals(list1, list);
    }
    
     //Тест проверяет, что файл пустой
    @Test
    public void testWriteFileEmpty() {
        File f = new File("lab2.txt");
        ArrayList<String> list = KPO_lab2_2.readerFile(f);
        ArrayList<String> list1 = new ArrayList<String>();        
        Assert.assertEquals(list1, list);
    }

}

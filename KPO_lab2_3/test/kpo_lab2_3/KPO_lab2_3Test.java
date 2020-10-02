package kpo_lab2_3;

import java.io.File;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class KPO_lab2_3Test {

    //Тест проверяет, что размерность матрицы равна 4 
    @Test
    public void testLengthArray() {
        File f = new File("lab2_3.txt");
        int lengthAr = KPO_lab2_3.lengthArray(f);
        assertEquals(4, lengthAr);
    }

    //Тест проверяет, что файл не пустой
    @Test
    public void testArrayOperationFileNotEmpty() {
        File f = new File("lab2_3.txt");
        String[][] array = KPO_lab2_3.arrayOperation(4, f);
        String[][] array1 = new String[4][4];
        Assert.assertNotEquals(array1, array);              
    }
    
    //Тест проверяет, что метод правильно считал из файла
    @Test
    public void testArrayOperation() {
        File f = new File("lab2_3.txt");
        String[][] array = KPO_lab2_3.arrayOperation(4, f);
        String[][] array1 = {{"2", "5", "6", "1"}, {"1", "8", "2", "9"}, {"1", "1", "4", "6"}, {"9", "5", "3", "2"}};
        Assert.assertNotEquals(array1, array);
    }

}

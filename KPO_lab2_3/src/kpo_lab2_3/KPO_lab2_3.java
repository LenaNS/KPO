package kpo_lab2_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class KPO_lab2_3 { 

    public static void main(String[] args) {
        File f = new File("lab2_3.txt");
        int lengthAr = lengthArray(f);
        String[][] mas = arrayOperation(lengthAr, f);
        outputArray(mas);
        transpositionArray(mas);

    }

//Поиск длины массива
    public static int lengthArray(File f) {
        int num = 0;
        Scanner reader = null;
        try {
            reader = new Scanner(f);
            while (reader.hasNextLine()) {
                reader.nextLine();
                num++;
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(KPO_lab2_3.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (reader != null) {
                reader.close();
            }
            return num;
        }
    }

//Считывания масссива из файла
    public static String[][] arrayOperation(int num, File f) {
        String[][] array = new String[num][num];
        Scanner reader = null;
        try {
            reader = new Scanner(f);
            while (reader.hasNextLine()) {
                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array[i].length; j++) {
                        array[i][j] = reader.next();
                    }

                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(KPO_lab2_3.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            //Закрываем поток
            if (reader != null) {
                reader.close();
            }
            return array;
        }

    }
    
//Вывод исходной матрицы
    public static void outputArray(String[][] array) {
        System.out.println("Исходная матрица:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%3s", array[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

//Транспонирование и вывод исходной матрицы 
    public static void transpositionArray(String[][] array) {
       System.out.println("Транспонированная матрица:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%3s", array[j][i]);
            }
            System.out.println();
        }
        System.out.println();
    }
}

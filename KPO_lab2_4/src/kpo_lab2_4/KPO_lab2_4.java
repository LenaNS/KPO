package kpo_lab2_4;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class KPO_lab2_4 {

    static File f = new File("lab2_4.txt");
    static String template = "огонь";

    public static void main(String[] args) {
        ArrayList<String> l = readerFile();
        String text = "";
        for (String str : l) {
            text += str + " ";
        }
        //Разделение строки по словам
        String[] array = text.split(" ");
        System.out.println("Разделение на слова:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        writeFile(array);
    }

    public static ArrayList<String> readerFile() {
        Scanner reader = null;
        ArrayList<String> list = null;
        try {
            reader = new Scanner(f);
            list = new ArrayList<>();
            String str;
            //Читаем из файла по сторчно
            while (reader.hasNextLine()) {
                //Запоминаем строки
                str = reader.nextLine();
                list.add(str);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(KPO_lab2_4.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            //Закрываем поток
            if (reader != null) {
                reader.close();
            }
            return list;
        }
    }

//Поиск совпавшего слова со словом образцом и запись его в другой файл
    public static void writeFile(String[] array) {
        File f1 = new File("lab2_4_1.txt");
        FileWriter fw = null;
        BufferedWriter bw = null;
        PrintWriter pw = null;
        try {
            fw = new FileWriter(f1);
            bw = new BufferedWriter(fw);
            pw = new PrintWriter(bw);
            for (String str : array) {
                if (str.equals(template)) {
                    pw.println(str);
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(KPO_lab2_4.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (pw != null) {
                pw.close();
            }
        }
    }
}

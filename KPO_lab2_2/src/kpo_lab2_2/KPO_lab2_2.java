package kpo_lab2_2;

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

public class KPO_lab2_2 {

    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("lab2_2.txt");
        ArrayList<String> l = readerFile(f);
        writeFile(l, f);
    }

    public static ArrayList<String> readerFile(File f) {
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
                //Меняем слова public на слово private 
                list.add(str.replaceAll("public", "private"));
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(KPO_lab2_2.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            //Закрываем поток
            if (reader != null) {
                reader.close();
            }
            return list;
        }
    }

    //Перезаписываем файл
    public static void writeFile(ArrayList<String> list, File f) {
        FileWriter fw = null;
        BufferedWriter bw = null;
        PrintWriter pw = null;
        try {
            fw = new FileWriter(f);
            bw = new BufferedWriter(fw);
            pw = new PrintWriter(bw);
            for (String str : list) {
                pw.println(str);
            }
        } catch (IOException ex) {
            Logger.getLogger(KPO_lab2_2.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (pw != null) {
                pw.close();
            }
        }
    }
}

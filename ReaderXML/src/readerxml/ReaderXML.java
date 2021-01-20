
package readerxml;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReaderXML {
    public static ArrayList<String> fileReader(File fileXML) {
      Scanner reader = null;
      ArrayList<String> list = null;
       try {
            reader = new Scanner(fileXML);
            list = new ArrayList<>();
            String str;
            //Читаем из файла по сторчно
            while (reader.hasNextLine()) {
                //Запоминаем строки
                str = reader.nextLine();
                list.add(str);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ReaderXML.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            //Закрываем поток
            if (reader != null) {
                reader.close();
            }
            return list;
        }
      
    }
    
}

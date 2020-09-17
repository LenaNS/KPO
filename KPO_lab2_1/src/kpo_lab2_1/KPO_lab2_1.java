package kpo_lab2_1;

import java.util.Scanner;

public class KPO_lab2_1 {

    public static void main(String[] args) {
        conclusion(words());
    }

//Ввод слов через пробел
    public static String inputText() {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        return str;
    }
    
//Деление текста на слова
    public static String[] words() {
        String str1 = inputText();
        String[] strArray = str1.split(" ");
        return strArray;
    }

//Перебо слов в массиве и сравнение последней буквы одного слова с первой буквой другого слова
    public static void conclusion(String[] strArray) {
        for (int i = 0; i < strArray.length; i++) {
            for (int j = 0; j < strArray.length; j++) {
                if (i != j) {
                    if (strArray[i].substring(strArray[i].length() - 1).equals(strArray[j].substring(0, 1))) {
                        //Вывод слов с совпавшими буквами             
                        System.out.println(strArray[i] + " " + strArray[j]);
                    }
                }
            }
        }
    }
}

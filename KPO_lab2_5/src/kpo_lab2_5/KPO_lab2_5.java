package kpo_lab2_5;

import java.util.Scanner;

public class KPO_lab2_5 {

    public static void main(String[] args) {
        comparisonWords(words());
    }

    //Ввод строки
    public static String inputWords() {
        System.out.println("Введите строку:");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        return str;
    }

    //Разделение строки на слова
    public static String[] words() {
        String str1 = inputWords();
        String[] strArray = str1.split(" ");
        return strArray;
    }

    //Поиск в строке наибольшего числа цифр, идущих подряд       
    public static void comparisonWords(String[] strArray) {
        String str = strArray[0];
        for (int i = 0; i < strArray.length; i++) {
            if (str.length() < (strArray[i].length())) {
                str = strArray[i];
            }
        }
        System.out.println("Вывод:" + str + " " + str.length());
    }
}

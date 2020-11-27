package kpo_lab9;

public class SynAnalyzer {

    static boolean syn;

    public SynAnalyzer(String originalCode) {
        syntacticalAnalyzer(originalCode);
    }

    public static void syntacticalAnalyzer(String originalCode) {
        syn = true; //Проводим синтаксический анализ;
        System.out.println("Я класс SynAnalyzer. Я провёл синтаксический анализ");
    }

}

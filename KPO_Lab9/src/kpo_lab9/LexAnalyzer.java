package kpo_lab9;

public class LexAnalyzer {
    static boolean lex;
    public LexAnalyzer(String originalCode) {
        lexicalAnalyzer(originalCode);
    }

    public static void lexicalAnalyzer(String originalCode) {
        //Проводим лексический анализ;
        lex = true; 
        System.out.println("Я класс LexAnalyzer. Я провёл лексический анализ");
    }

}

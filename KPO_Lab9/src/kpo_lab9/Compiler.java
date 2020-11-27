package kpo_lab9;

public class Compiler {

    static private String originalCode;
    static private String objectCode;

    public Compiler(String filePath) {
        //Получение исходного кода из файла;
        originalCode = "";

    }

    public static String generationCode() {
        LexAnalyzer lexAnalyzer = new LexAnalyzer(originalCode);
        SynAnalyzer synAnalyzer = new SynAnalyzer(originalCode);
        if (lexAnalyzer.lex & synAnalyzer.syn) {
            //Получение объектного кода;
            objectCode = "";
            System.out.println("Я класс Compiler. Я сгенерировал объектный код");
        } else {
            objectCode = "Ошибка";
        }
        return objectCode;
    }

}

package abstractFactory;

import java.util.HashMap;
import java.util.Map;

public class PolishEnglishTranslator implements Polish{
    private Map<String, String> wordsMap = new HashMap<>();

    @Override
    public String translateToPolish(String word) {
        wordsMap.put("Programming", "Programowanie");
        wordsMap.put("Implements", "Implementować");
        wordsMap.put("Class", "Klasa");
        wordsMap.put("Method", "Metoda");
        wordsMap.put("Field", "Pole");
        wordsMap.put("Access modifier", "Modyfikator dostępu");

        return wordsMap.get(word);
    }
}

package abstractFactory;

import java.util.HashMap;
import java.util.Map;

public class EnglishGermanTranslator implements German {
    private Map<String, String> wordsMap = new HashMap<>();
    @Override
    public String translateToEnglish(String word) {
        wordsMap.put("Programming", "Programmierung");
        wordsMap.put("Implements", "Implementiert");
        wordsMap.put("Class", "Klasse");
        wordsMap.put("Method", "Methode");
        wordsMap.put("Field", "Feld");
        wordsMap.put("Access modifier", "Zugriffsmodifizierer");

        return wordsMap.get(word);
    }
}

package low_level_design.designpatterns.structural_design_pattern.flyweight_design_pattern.wordprocessor.correct;

import java.util.HashMap;
import java.util.Map;

public class LetterFactory {
    private static Map<Character, ILetter> characterCache = new HashMap<>();

    public static ILetter createLetter(char characterValue) {
        if (characterCache.containsKey(characterValue)) {
            return characterCache.get(characterValue);
        } else {
            DocumentCharacter character = new DocumentCharacter(characterValue, "Arial", 10);
            characterCache.put(characterValue, character);
            return character;
        }
    }
}

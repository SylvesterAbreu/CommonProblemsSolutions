package stringUtils;

import java.util.LinkedList;
import java.util.List;

public class SylvesterStringUtils {

    public String reverse(String original) {
        final StringBuilder reverser = new StringBuilder(original);
        final StringBuilder stringReversed = reverser.reverse();
        return stringReversed.toString();
    }

    public String removeWhiteSpaces(String original) {
        return new RemoveWhiteSpaces(original).remove();
    }

    public boolean hasDuplicates(String original) {
        if (original == null) {
            return false;
        }
        final List<Character> characters = new LinkedList<>();
        for (int i = 0; i < original.length(); i++ ) {
            final char currentCharacter = original.charAt(i);
            if (characters.contains(currentCharacter)) {
                return true;
            }
            characters.add(currentCharacter);
        }
        return false;
    }
}

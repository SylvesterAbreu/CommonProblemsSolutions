package stringUtils;

import java.util.LinkedList;
import java.util.List;

class LookForDuplicates {
    private final String original;

    LookForDuplicates(String original) {
        this.original = original;
    }

    public boolean hasDuplicates() {
        return original != null && haveDuplicates(original);
    }

    private boolean haveDuplicates(String original) {
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

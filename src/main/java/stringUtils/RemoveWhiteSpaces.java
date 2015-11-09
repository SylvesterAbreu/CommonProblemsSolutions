package stringUtils;


class RemoveWhiteSpaces {

    private static final char SINGLE_SPACE_CHARACTER = ' ';
    private final String original;

    public RemoveWhiteSpaces(String original) {
        this.original = original;
    }

    String remove() {
        final StringBuilder noWhiteSpaces = new StringBuilder();

        for (int characterPosition =0;  characterPosition < original.length(); characterPosition++){
            appendNonWhiteSpaces(noWhiteSpaces, characterPosition);
        }
        return noWhiteSpaces.toString();
    }

    private void appendNonWhiteSpaces(StringBuilder noWhiteSpaces, int characterPosition) {
        final char characterAtCurrentPosition = original.charAt(characterPosition);

        if (hasNoSingleSpace(characterAtCurrentPosition)) {
            noWhiteSpaces.append(characterAtCurrentPosition);
        }
    }

    private boolean hasNoSingleSpace(char characterAtCurrentPosition) {
        final char singleSpace = SINGLE_SPACE_CHARACTER;

        return singleSpace != characterAtCurrentPosition;
    }
}

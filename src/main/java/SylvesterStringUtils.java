
public class SylvesterStringUtils {

    public String reverse(String original) {
        final StringBuilder reverser = new StringBuilder(original);
        final StringBuilder stringReversed = reverser.reverse();
        return stringReversed.toString();
    }

    public String removeWhiteSpaces(String original) {
        StringBuilder noWhiteSpaces = new StringBuilder();
        
        for (int i =0;  i < original.length(); i++){
            noWhiteSpaces = appendNonWhiteSpaces(original, noWhiteSpaces, i);
        }
        return noWhiteSpaces.toString();
    }

    private StringBuilder appendNonWhiteSpaces(String original, StringBuilder noWhiteSpaces, int i) {
        final char characterAtCurrentPosition = original.charAt(i);
        
        if (hasNoSingleSpace(characterAtCurrentPosition)) {
            noWhiteSpaces.append(characterAtCurrentPosition);
        }
        return noWhiteSpaces;
    }

    private boolean hasNoSingleSpace(char characterAtCurrentPosition) {
        final char singleSpace = ' ';
        
        return singleSpace != characterAtCurrentPosition;
    }
}

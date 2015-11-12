package stringUtils;

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
        return new LookForDuplicates(original).hasDuplicates();
    }
}

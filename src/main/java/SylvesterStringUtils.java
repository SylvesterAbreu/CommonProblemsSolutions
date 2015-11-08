
public class SylvesterStringUtils {

    public String reverse(String original) {
        final StringBuilder reverser = new StringBuilder(original);
        final StringBuilder stringReversed = reverser.reverse();
        return stringReversed.toString();
    }
}

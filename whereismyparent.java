import java.util.Arrays;

/**
 * Created by Eugene on 12/23/2017.
 */
public class whereismyparent {
    static String findChildren(final String text) {
        String[] sorted = text.split("");
        Arrays.sort(sorted);
        Arrays.sort(sorted, String.CASE_INSENSITIVE_ORDER);
        return String.join("", sorted);
    }

    //didn't do this but useful solution for later
}

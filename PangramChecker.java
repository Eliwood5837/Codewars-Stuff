/**
 * Created by Eugene on 12/20/2017.
 */

public class PangramChecker {
    public static boolean check(String sentence){
        //code

        int i=0;
        for(char c : sentence.toCharArray()) {
            int x = Character.toUpperCase(c);
            if (x >= 'A' && x <= 'Z') {
                i |= 1 << (x - 'A');
            }
        }
        if (i == (i | ((1 << (1 + 'Z' - 'A')) - 1))) {

            return true;

        }
        else{
            return false;
        }

    }
    /* better soln
    for (char c = 'a'; c<='z'; c++)
            if (!sentence.toLowerCase().contains("" + c))
                return false;
        return true;*/

    public static void main(String args[]){

        String b = "The quick brown fox jups over the lazy dog";
        System.out.println(check(b));
    }
}

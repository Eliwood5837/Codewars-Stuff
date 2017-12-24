import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Eugene on 12/23/2017.
 */
public class DRoot {
    public static int digital_root(int n) {
        String number = Integer.toString(n);
        if(number.length()<2){
            return n;
        }
        else{
            int newnum = digits(n);
            return digital_root(newnum);
        }
    }
    public static int digits (int i){
        List<Integer> digits = new ArrayList<>();
        int finalsum=0;
        while(i>0){
            digits.add(i%10);
            i/=10;
        }
        for(int j =0;j<digits.size();j++) {
            finalsum += digits.get(j);
        }
        return finalsum;
    }

    //best solution: return (n != 0 && n%9 == 0) ? 9 : n % 9;
}

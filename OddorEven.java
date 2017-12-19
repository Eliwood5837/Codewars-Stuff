/**
 * Created by Eugene on 12/18/2017.
 */
public class OddorEven {
    public static String oddOrEven (int[] array) {
        // your code
        int thefinal=0;
        for(int i =0;i<array.length;i++){
            thefinal+=array[i];
        }
        if(thefinal%2==0){
            return "even";
        }
        else{
            return "odd";
        }
    }


    /* static String oddOrEven(final int[] array) {
        return stream(array).sum() % 2 == 0 ? "even" : "odd";
    }*/
}

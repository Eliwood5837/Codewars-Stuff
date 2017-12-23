/**
 * Created by Eugene on 12/23/2017.
 */
public class BitCounting {
    public static int countBits(int n){
        int counter=0;
        String binary = Integer.toBinaryString(n);
        for(int i =0;i<binary.length();i++){
            if(binary.charAt(i)=='1'){
                counter++;
            }
        }
        return counter;
    }
    // better soln:     return Integer.bitCount(n);


}

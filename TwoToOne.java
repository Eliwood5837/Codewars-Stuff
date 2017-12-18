import java.util.Arrays;

/**
 * Created by Eugene on 12/18/2017.
 */
public class TwoToOne {

    public static String longest (String s1, String s2) {
        // your code
        String finalstring="";
        char firstarr[] = s1.toCharArray();
        char secondarr[]=s2.toCharArray();
        //Arrays.sort(firstarr);
        //Arrays.sort(secondarr);
        for(int i =0;i<firstarr.length;i++){
            if(!finalstring.contains(Character.toString(firstarr[i]))){
                finalstring+=firstarr[i];
            }
        }
        for(int i =0;i<secondarr.length;i++){
            if(!finalstring.contains(Character.toString(secondarr[i]))){
                finalstring+=secondarr[i];
            }
        }
        char thefinal[] = finalstring.toCharArray();
        Arrays.sort(thefinal);
        finalstring = new String(thefinal);
        return finalstring;
    }



}

import java.util.Arrays;
import java.util.LinkedList;

/**
 * Created by Eugene on 12/20/2017.
 */
public class ReversedWords {

    public static String reverseWords(String str){
        String thefinal="";
        LinkedList<String>test=new LinkedList<String>();
        String arr[]=str.split(" ");
        for(int i =0;i<arr.length;i++){
            test.addFirst(arr[i]);
        }
        for(int i =0;i<test.size();i++){
            thefinal+=test.get(i);
            thefinal+=" ";
        }
        thefinal.trim();

        return thefinal;
    }
}

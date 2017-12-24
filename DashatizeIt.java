import com.sun.deploy.util.ArrayUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Eugene on 12/23/2017.
 */
public class DashatizeIt {
    public static String dashatize(int num) {
        String finalstring="";
        String newstring = Integer.toString(num);
        List<String> theList= new ArrayList<String>(Arrays.asList(newstring.split("")));
        for(int i =0;i<theList.size();i++){
            char c = theList.get(i).charAt(0);
            if(Character.isDigit(c)){
                if(i==0){
                    theList.add(0, "-");
                    theList.add(i + 2, "-");
                }
                else {
                    theList.add(i - 1, "-");
                    theList.add(i + 1, "-");
                }
            }
        }
        for(String s : theList){
            finalstring+=s;
        }
        return finalstring;
    }

    public static void main (String args[]){
        int num = 1234;
        System.out.println(dashatize(num));
    }
}

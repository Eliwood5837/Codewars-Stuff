/**
 * Created by Eugene on 12/18/2017.
 */
public class Kata {

    public static String replaceNth(String text, int n, char oldValue, char newValue)
    {
        //n is every nth that needs to be replaced
        char arr[] = text.toCharArray();
        if(n<=0){
            return text;
        }
        else{
            int count =0;
            //StringBuilder result = new StringBuilder(text);

            for(int i =0;i<text.length();i++){
                //result.setCharAt(i,newValue);
                if(arr[i]==oldValue){
                    count++;
                }
                if(count%n==0&&arr[i]==oldValue){
                    arr[i]=newValue;
                    count =0;
                }
            }
        }
        text = new String(arr);
        return text;
    }
}

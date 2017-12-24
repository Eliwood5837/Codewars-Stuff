/**
 * Created by Eugene on 12/23/2017.
 */
public class Solution {
    public static String vowels = "aeiou";
    public static int indexOfFirstVowel(String word){
        for(int i =0;i<word.length();i++){
            if(vowels.contains(String.valueOf(word.charAt(i)))){
                return i;
            }

        }

        return -1;
    }
    public static boolean isAlt(String word) {
        //make note that 'y' should not be treated as vowel
        //your code here
        boolean yes=false;
        int firstvowel = indexOfFirstVowel(word);
        if(firstvowel!=-1){
            for(int i = firstvowel;i<word.length();i+=2){
                if(isVowel(word.charAt(i))){
                    yes = true;
                }
                else{
                    yes = false;
                }
                if(yes==false){
                    return yes;
                }
            }
        }
        return yes;
    }

    public static boolean isVowel(char a){
        if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'){
            return true;
        }
        else{
            return false;
        }
    }
}

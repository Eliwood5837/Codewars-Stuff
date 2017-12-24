
public class CalculateRotation {
    static int shiftedDiff(String first, String second){
        int counter=0;

        while(!first.equals(second)){
            first = first.charAt(first.length() - 1) + first.substring(0, first.length() - 1);
            counter++;
        }


        return counter;
    }

}

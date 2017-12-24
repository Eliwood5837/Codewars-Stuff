import java.util.Arrays;

/**
 * Created by Eugene on 12/18/2017.
 */
public class sortarray {
    public static int[] sortArray(int[] array) {
        for(int i =0;i<array.length;i++) {
            if(array[i]%2!=0){
                for(int j =0;j<array.length;j++){
                    if(array[i]<array[j]&&array[j]%2!=0){
                        //int temp=array[i];
                        //array[i]=array[j];
                        //array[j]=temp;
                        int temp = array[j];
                        array[j]=array[i];
                        array[i]=temp;
                    }
                }
            }
        }
        return array;
    }


    /*// Sort the odd numbers only
    final int[] sortedOdd = Arrays.stream(array).filter(e -> e % 2 == 1).sorted().toArray();

    // Then merge them back into original array
    for (int j = 0, s = 0; j < array.length; j++) {
      if (array[j] % 2 == 1) array[j] = sortedOdd[s++];
    }

    return array;*/
}

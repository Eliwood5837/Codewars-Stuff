/**
 * Created by Eugene on 12/18/2017.
 */
public class Arge {

    public static int nbYear(int p0, double percent, int aug, int p) {
        // your code
        int years=0;
        percent = percent/100;
        while(p0<p){
            p0=p0+(int)(p0*percent)+aug;
            years++;
        }
        return years;
    }


}

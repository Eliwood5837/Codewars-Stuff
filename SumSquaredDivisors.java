import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.List;

/**
 * Created by Eugene on 12/20/2017.
 */
public class SumSquaredDivisors {

    public static void main (String args[]){

        long a = 1;
        long b = 42;
        System.out.println(listSquared(a,b));

    }
    public static String[] listSquared(long m, long n) {
        List<String[]> biglist;
        String temp[]=new String[2];
        // your code
        long i=m;
        while(i<=n){

           if(ifsquare(i)){
                //return i+" IS SQUARE";
               //getsquare(i);
               System.out.println(i+" IS SQUARE"+getsquare(i));
           }

           i++;

        }

        //return "monkey";
        return temp;
    }



    public static Boolean ifsquare(long n){
        double temp;
        int sumofdivsq=0;
        for(int i =1;i<=n;i++){
            if(n%i==0){
                temp=Math.pow(i,2);
                sumofdivsq+=temp;
            }
        }
        double sqrt = Math.sqrt(sumofdivsq);
        int x = (int)sqrt;
        if(Math.pow(sqrt,2)==Math.pow(x,2)){
            return true;
        }
        else{
            return false;
        }
    }

    public static String getsquare(long n){
        double temp;
        int sumofdivsq=0;
        for(int i =1;i<=n;i++){
            if(n%i==0){
                temp=Math.pow(i,2);
                sumofdivsq+=temp;
            }
        }


        return Integer.toString(sumofdivsq);
    }
}

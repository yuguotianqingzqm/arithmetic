package sort;

import java.text.DecimalFormat;

public class a {
    public static void main(String[] args) {
        int i=2;
        double f=3;
        f=i;
        System.out.println(fun(9));

    }
    static double  fun(int m){
        double z=0;
        for (int i = 1; i <=m; i++) {
            z+=chufa(1,2*i);
        }
        return z;
    }
    static double chufa(double i,double z){
        DecimalFormat decimalFormat = new DecimalFormat("0.000000");

        return  Double.parseDouble(decimalFormat.format( (float)i/z));
    }
}

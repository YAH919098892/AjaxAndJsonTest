package test;

import java.text.NumberFormat;

public class Tes {


    public static void main(String[] args) {
//        NumberFormat nf=NumberFormat.getCurrencyInstance();
//        nf.setMaximumFractionDigits(1);
//        System.out.println(nf.format(0.667));
//        System.out.println();
double num =0.667, val=7;
        System.out.println(num);
        System.out.println(String.format("%.2f",(float)num-(float)val));

    }
}

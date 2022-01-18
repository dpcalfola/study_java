package formatClass;

import java.text.DecimalFormat;

public class FormatClass {
    public static void main(String[] args) {
        double num = 1234567.89;

        DecimalFormat df = new DecimalFormat("0");
        System.out.println(df.format(num));
        //1234568

        df = new DecimalFormat("0.0");
        System.out.println(df.format(num));
        //1234567.9

        df = new DecimalFormat("000000.00000");
        System.out.println(df.format(num));
        //1234567.89000


        // 중요 !!
        df = new DecimalFormat("00000000000000.00000");
        System.out.println(df.format(num));
        //00000001234567.89000

        df = new DecimalFormat("#");
        System.out.println(df.format(num));
        //1234568

        df = new DecimalFormat("######.#####");
        System.out.println(df.format(num));
        //1234567.89

        // 중요 !!
        df = new DecimalFormat("################.#####");
        System.out.println(df.format(num));
        //1234567.89


        df = new DecimalFormat("#.0");
        System.out.println(df.format(num));
        //1234567.9

        df = new DecimalFormat("+#.0");
        System.out.println(df.format(num));
        //+1234567.9

        df = new DecimalFormat("-#.0");
        System.out.println(df.format(num));
        //-1234567.9

        df = new DecimalFormat("#,###.0");
        System.out.println(df.format(num));
        //1,234,567.9

        df = new DecimalFormat("0.0E0");
        System.out.println(df.format(num));
        //1.2E6

        df = new DecimalFormat("+#,### ; -#,###");
        System.out.println(df.format(num));
        //+1,234,568

        df = new DecimalFormat("#.# %");
        System.out.println(df.format(num));
        //123456789%


        df = new DecimalFormat("\u00A4 #.###");
        System.out.println(df.format(num));
        //₩1234567.89

    }
}

















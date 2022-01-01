package method.tv;

import java.sql.SQLOutput;

public class TvMain {

    public static void main(String[] args) {

        Tv c1 = new Tv();


        System.out.println("\n< Default Condition >\n");

        System.out.println("power : " + c1.power);
        System.out.println("channel NO. : " + c1.channel);
        System.out.println("volume : " + c1.vol);
        System.out.println("volume off status : " + c1.mute);


        System.out.println("\n< ---------------- Control ---------------- >");

        // before power on
        c1.channelUp();
        c1.channelUp();


        c1.setPowerOnOff();
        // after power on


        c1.channelDown(); // 256
        c1.channelDown(); // 255
        c1.channelUp(); // 256
        c1.setmute(); // true
        c1.volUp(); // 1
        c1.volUp(); // 2
        c1.volDown(); // 1


        System.out.println("\n< After Control Status >\n");


        System.out.println("power : " + c1.power);
        System.out.println("channel NO. : " + c1.channel);
        System.out.println("volume : " + c1.vol);
        System.out.println("volume off status : " + c1.mute);

    }


}

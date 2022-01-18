package dateClass;

import java.util.Calendar;

public class CalendarClass {
    public static void main(String[] args) {
        // getInstance <=== 싱글턴 패턴
        Calendar now = Calendar.getInstance();

        int year = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH) + 1;
        int day = now.get(Calendar.DAY_OF_MONTH);

        System.out.println(year + "년 ");
        System.out.println(month + "월 ");
        System.out.println(day + "일 ");


        int amPm = now.get(Calendar.AM_PM);
        String strAmPm = null;
        if(amPm == Calendar.AM){
            strAmPm = "오전";
        }else{
            strAmPm = "오후";
        }
        System.out.println(strAmPm + " ");

        int hour = now.get(Calendar.HOUR);
        int minute = now.get(Calendar.MINUTE);
        int second = now.get(Calendar.SECOND);

        System.out.println(hour + "시 ");
        System.out.println(minute + "분 ");
        System.out.println(second + "초 ");
    }
}

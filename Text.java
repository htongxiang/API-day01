package 测试包;

import homework.Text1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Text{

    public static void main(String args[]) {
        SimpleDateFormat datefomat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        Calendar cal = Calendar.getInstance();
        cal.set(2021, 2, 13);
        System.out.println("保质期" + datefomat.format(cal.getTime()));
        cal.add(Calendar.DATE, 48);
        System.out.println("过期日" + datefomat.format(cal.getTime()));
        cal.add(Calendar.DATE, -7);
        System.out.println("过期日是上一周" + datefomat.format(cal.getTime()));
        cal.set(Calendar.DAY_OF_WEEK, 5);
        Date date = cal.getTime();
        System.out.println("促销日" + datefomat.format(date));
        String d = "2021-5-6 09:99:52 531";
        Date date5 = null;
        try {
             date5 = datefomat.parse(d);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(datefomat.format(date5));


    }
}
package cl.ione.hackerrank.Algorithms;

import android.icu.text.SimpleDateFormat;
import android.util.Log;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.Date;

public class TimeConversion {

    public TimeConversion() {
        brain("07:05:45PM");
    }

    private static void brain(String time) {
        String mLogName = "hacks";

        String split[] = time.split(":");
        int hh, mm, ss;
        hh = Integer.parseInt(split[0]);
        mm = Integer.parseInt(split[1]);
        ss = Integer.parseInt(split[2].substring(0, 2));

        if(split[2].substring(2, 4).equals("AM") && hh == 12) {
            hh = 0;
        }
        else if(split[2].substring(2, 4).equals("PM") && hh < 12) {
            hh += 12;
        }

        System.out.printf("%02d:%02d:%02d", hh, mm, ss);
        DecimalFormat formatter = new DecimalFormat("00");
        Log.v(mLogName, formatter.format(hh) + ":" + formatter.format(mm) + ":" + formatter.format(ss));
    }
}

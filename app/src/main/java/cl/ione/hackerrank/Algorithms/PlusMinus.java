package cl.ione.hackerrank.Algorithms;

import android.util.Log;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class PlusMinus {

    public PlusMinus() {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(1);
        arr.add(0);
        arr.add(-1);
        arr.add(-2);
        brain(arr);
    }

    private static void brain(List<Integer> arr)
    {
        String mLogName = "hacks";
        int czero = 0, cpos = 0, cneg = 0;
        for (int n : arr) {
            if (n == 0) {
                czero++;
            } else if (n > 0) {
                cpos++;
            } else {
                cneg++;
            }
        }
        DecimalFormat formatter = new DecimalFormat("0.000000");
        Log.v(mLogName, formatter.format((double) cpos / arr.size()));
        Log.v(mLogName, formatter.format((double) cneg / arr.size()));
        Log.v(mLogName, formatter.format((double) czero / arr.size()));
    }
}

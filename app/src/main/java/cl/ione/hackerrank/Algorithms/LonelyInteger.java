package cl.ione.hackerrank.Algorithms;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class LonelyInteger {

    public LonelyInteger() {
        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(3);
        a.add(2);
        a.add(1);
        brain(a);
    }

    private static void brain(List<Integer> a)
    {
        String mLogName = "hacks";
        List<Integer> b = a;
        for (int itemA : a) {
            int count = 0;
            for (int itemB : b) {
                if (itemA == itemB) {
                    count ++;
                }
            }
            if (count == 1) {
                Log.v(mLogName, String.valueOf(itemA));
            }
        }
    }
}

package cl.ione.hackerrank.Algorithms;

import android.util.Log;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MiniMaxSum {

    public MiniMaxSum() {
        List<Integer> arr = new ArrayList<>();
        arr.add(793810624);
        arr.add(895642170);
        arr.add(685903712);
        arr.add(623789054);
        arr.add(468592370);
        brain(arr);
    }

    private static void brain(List<Integer> arr)
    {
        String mLogName = "hacks";
        Collections.sort(arr);
        long n1 = 0, n2 = 0;
        for (int i = 0; i <= 3; i++) {
            n1 += arr.get(i);
        }
        for (int i = 1; i <= 4; i++) {
            n2 += arr.get(i);
        }
        Log.v(mLogName, n1 + " " + n2);
    }
}

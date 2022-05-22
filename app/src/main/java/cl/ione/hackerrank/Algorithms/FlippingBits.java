package cl.ione.hackerrank.Algorithms;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntBinaryOperator;

public class FlippingBits {

    public FlippingBits() {
        List<Integer> n = new ArrayList<>();
        n.add(3);
        n.add(2147483647);
        n.add(1);
        n.add(0);
        brain(n);
    }

    private static void brain(List<Integer> n)
    {
        String mLogName = "hacks";
        for (long item : n)
        {
            String binary = Long.toBinaryString(item);
            String[] bin32 = String
                    .format("%32s", binary)
                    .replaceAll(" ", "0")
                    .split("");

            StringBuilder flipping = new StringBuilder();
            for (String bin : bin32) {
                flipping.append(bin.equals("0") ? "1" : "0");
            }
            Log.v(mLogName, String.valueOf(Long.parseLong(flipping.toString(), 2)));
        }
    }
}

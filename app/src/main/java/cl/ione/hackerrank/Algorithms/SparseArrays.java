package cl.ione.hackerrank.Algorithms;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class SparseArrays {

    public SparseArrays() {
        List<String> strings = new ArrayList<>();
        strings.add("4");
        strings.add("aba");
        strings.add("baba");
        strings.add("aba");
        strings.add("xzxb");
        strings.add("3");
        strings.add("aba");
        strings.add("xzxb");
        strings.add("ab");

        List<String> queries = new ArrayList<>();
        queries.add("aba");
        queries.add("xzxb");
        queries.add("3");
        queries.add("ab");
        queries.add("1");
        queries.add("2");
        queries.add("dv");
        queries.add("gv");
        queries.add("er");
        brain(strings, queries);
    }

    private static void brain(List<String> strings, List<String> queries)
    {
        String mLogName = "hacks";
        List<Integer> total = new ArrayList<>();
        for (String itemQ : queries) {
            int count = 0;
            for (String itemS : strings) {
                if (itemQ.equals(itemS)) {
                    count ++;
                }
            }
            total.add(count);
        }
        for (int n : total) {
            Log.v(mLogName, String.valueOf(n));
        }
    }
}

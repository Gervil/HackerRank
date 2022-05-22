package cl.ione.hackerrank;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import cl.ione.hackerrank.Algorithms.MiniMaxSum;
import cl.ione.hackerrank.Algorithms.PlusMinus;
import cl.ione.hackerrank.Algorithms.TimeConversion;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //PlusMinus
//        PlusMinus plusMinus = new PlusMinus();

        //Mini-Max Sum
//        MiniMaxSum miniMaxSum = new MiniMaxSum();

        //Time Conversion
        TimeConversion timeConversion = new TimeConversion();
    }
}
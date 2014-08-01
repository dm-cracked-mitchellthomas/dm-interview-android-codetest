package com.demandmedia.android_test_2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    public TextView tv;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        tv = (TextView) findViewById(R.id.tvText);
        tv.setText("");
    }

    @Override
    public void onStart() {
        super.onStart();

        funWithStrings();
        //sumInt(123);
        //isPrime(9);
    }

    /*
     * remove all the letters that exist in str1 from str2
     * and store the result into the variable "result"
     */
    public void funWithStrings()
    {
        String result = "";

        String str1 = "mary had a little lamb";
        String str2 = "abcdefghijklmnopqrstuvwxyz";

        //--------- your code here --------//


        //---------------------------------//

        // * display result onscreen
        tv.setText(result);
    }


    /*
     * sum int
     * set the value of the variable "sum" to the sum of the numbers in "num"
     */
    public void sumInt(double num) {

        int sum = 0;

        //--------- your code here --------//


        //---------------------------------//

        // * display result onscreen
        tv.setText(String.valueOf(sum));
    }

    /*
     * Is this a prime?
     * programmatically determine if the value of "num" is prime
      * set the value of isPrime
     */
    public void isPrime(int num) {

        Boolean isPrime = false;

        //--------- your code here --------//





        //---------------------------------//

        // * display result onscreen
        tv.setText(String.valueOf(isPrime));
    }
}

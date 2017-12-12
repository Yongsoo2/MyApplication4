package test.pyo.com.myapplication;

import android.util.Log;

/**
 * Created by pyo on 2017-11-29.
 */

public class OverloadingTest {

    public static void test(){
        Log.e("매개변수 X", "매개변수 X");
    }

    public static void test(int a, int b){
        Log.e("매개변수 :", "" + a + ", " + b);
    }

    public static void test(String c){
        Log.e("매개변수 :", c);
    }
}

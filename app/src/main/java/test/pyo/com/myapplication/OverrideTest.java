package test.pyo.com.myapplication;

import android.util.Log;

/**
 * Created by pyo on 2017-11-29.
 */

public class OverrideTest extends Test{
    @Override
    public void test() {
        Log.e("Override Test", "override");
        super.test();
    }
}

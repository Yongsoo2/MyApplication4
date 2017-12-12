package test.pyo.com.myapplication;

import android.graphics.Bitmap;
import android.util.Log;

/**
 * Created by pyo on 2017-12-04.
 */

public class BitmapResize {

    public static Bitmap resizeBitmap(Bitmap bitmap, int maxResolution) {

        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int newWidth = 0, newHeight = 0;
        float rate = 0.0f;

        if (width > height) {
            if (maxResolution < width) {
                rate = maxResolution / (float) width;
                newHeight = (int) (height * rate);
                newWidth = maxResolution;
            }
        } else {
            if (maxResolution < height) {
                rate = maxResolution / (float) height;
                newWidth = (int) (width * rate);
                newHeight = maxResolution;
            }
        }

        if (newWidth == 0 || newHeight == 0)
            return bitmap;
        Log.e("resize width :", String.valueOf(newWidth));
        Log.e("resize height :", String.valueOf(newHeight));

        return Bitmap.createScaledBitmap(bitmap, newWidth, newHeight, true);
    }
}

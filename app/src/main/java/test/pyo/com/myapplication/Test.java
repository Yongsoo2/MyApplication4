package test.pyo.com.myapplication;

import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by pyo on 2017-11-29.
 */

public class Test {
    public void test(){
        String test = "test method";
        Log.e("Test class", test);
    }

    // EditText에 TextView 숨김 처리
    public void textViewHide(final EditText editText, final TextView textView){
        editText.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                if ( i == keyEvent.KEYCODE_DEL){
                    textView.setVisibility(View.GONE);
                }
                return false;
            }
        });

        // editText 변화시
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                String s = editable.toString();

                if (s.equals("")){
                    editText.setOnKeyListener(new View.OnKeyListener() {
                        @Override
                        public boolean onKey(View view, int i, KeyEvent keyEvent) {
                            if (i == keyEvent.KEYCODE_DEL) {
                                textView.setVisibility(View.GONE);
                            }
                            return false;
                        }
                    });
                }
            }
        });

    }




}

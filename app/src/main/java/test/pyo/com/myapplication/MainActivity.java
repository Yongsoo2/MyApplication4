package test.pyo.com.myapplication;

import android.graphics.Rect;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private EditText editText;

    private Rect rect = new Rect();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.text_tv);
        editText = (EditText) findViewById(R.id.edit);

        findViewById(R.id.btn).setOnClickListener(clickListener);
        findViewById(R.id.log_btn).setOnClickListener(clickListener);

        this.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);

        OverloadingTest test = new OverloadingTest();
        OverrideTest overrideTest = new OverrideTest();
        overrideTest.test();
        test.test();
        test.test(1,2);
        test.test("ccc");

    }

    private View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            switch (view.getId()) {
                case R.id.btn:
                    textView.setText("Hi Hi Hi");
                    break;

                case R.id.log_btn:
                    Log.e("log btn click :", textView.getText().toString());
                    Log.e("key board bottom :", String.valueOf(rect.bottom));
                    Log.e("key board top :", String.valueOf(rect.top));
                    Log.e("key board left :", String.valueOf(rect.left));
                    Log.e("key board right :", String.valueOf(rect.right));
                    break;
            }
        }
    };
}

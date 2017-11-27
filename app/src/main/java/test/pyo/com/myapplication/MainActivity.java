package test.pyo.com.myapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.text_tv);

        findViewById(R.id.btn).setOnClickListener(clickListener);
        findViewById(R.id.log_btn).setOnClickListener(clickListener);

    }

    private View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.btn :
                    textView.setText("Hi Hi Hi");
                    textView.setTextColor(Color.parseColor(String.valueOf(R.color.colorAccent)));
                    break;

                case R.id.log_btn :
                    Log.e("log btn click :", textView.getText().toString());
                    break;
            }
        }
    };
}

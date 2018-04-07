package com.lifeistech.android.count;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    int number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView)findViewById(R.id.textView);

        number = 0;
        textView.setText("0");
    }

    public void plus(View v){
        number = number + 1;
        textView.setText(String.valueOf(number));
    }

    public void minus(View v){
        number = number - 1;
        textView.setText(String.valueOf(number));
    }
}

package com.lifeistech.android.count;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /*

    Step1 : ①~⑥の従って，コードを書いてみよう！(Step1はググルの禁止です！ググるときはメンターに宣言してね！)
    Step2 : Step1が終わって時間があまったら、以下のことをしよう！ここからはググってもOK!!!
        Ex1 : カウントのテキストの色を変更する
        Ex2 : ボタンの背景の色を変更する(xmlファイルを変更してもOK)
        Ex3 : 全体の背景の色を変更する(xmlファイルを変更してもOK)
    Step3 : Step2が終わって時間が余ったら、以下のことをしよう！ここからはググってもOK!!!
        Super1 : 偶数のときだけ、カウントのテキストの色が変わる
        Super2 : 3の倍数のときだけ、ボタンの背景の色が変わる
        Super3 : 5の倍数のときだけ、全体の背景の色が変わる

    */

    // ① 変数の宣言

    TextView textView;
    int number;

    RelativeLayout relativeLayout;
    Button plusButton;
    Button minusButton;
    Button clearButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ② xmlファイルのidとの紐づけ

        textView = (TextView)findViewById(R.id.textView);

        relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);
        plusButton = (Button)findViewById(R.id.plus);
        minusButton = (Button)findViewById(R.id.minus);
        clearButton = (Button) findViewById(R.id.clear);

        textView.setTextColor(Color.parseColor("#000000")); // Black

        plusButton.setBackgroundColor(Color.parseColor("#9E9E9E")); // Grey
        minusButton.setBackgroundColor(Color.parseColor("#9E9E9E")); // Grey
        clearButton.setBackgroundColor(Color.parseColor("#9E9E9E")); // Grey

        relativeLayout.setBackgroundColor(Color.parseColor("#FFFFFF")); // White


        // ③ 変数の初期化
        number = 0;
    }


    // ④ plusメソッドの中身を実装
    public void plus(View v){
        number = number + 1;
        textView.setText(String.valueOf(number));
        changeTextColor();
        changeButtonColor();
        changeBackgroundColor();
    }

    // ⑤ minusメソッドの中身を実装
    public void minus(View v){
        number = number - 1;
        textView.setText(String.valueOf(number));
        changeTextColor();
        changeButtonColor();
        changeBackgroundColor();
    }

    // ⑥clearメソッドの中身を実装
    public void clear(View v){
        number = 0;
        textView.setText(String.valueOf(number));
        changeTextColor();
        changeButtonColor();
        changeBackgroundColor();
    }

    // Ex1/Super1
    public void changeTextColor(){
        // numberが偶数だったら -> 2で割り切れたら
        if(number % 2 == 0){
            textView.setTextColor(Color.parseColor("#f44336")); // Red
        }else{
            textView.setTextColor(Color.parseColor("#000000")); // Black
        }
    }

    // Ex2/Super2
    public void changeButtonColor(){
        if(number % 3 == 0){
            plusButton.setBackgroundColor(Color.parseColor("#E91E63")); // Pink
            minusButton.setBackgroundColor(Color.parseColor("#2196F3")); // Blue
            clearButton.setBackgroundColor(Color.parseColor("#4CAF50")); // Green
        }else{
            plusButton.setBackgroundColor(Color.parseColor("#9E9E9E")); // Grey
            minusButton.setBackgroundColor(Color.parseColor("#9E9E9E")); // Grey
            clearButton.setBackgroundColor(Color.parseColor("#9E9E9E")); // Grey
        }
    }

    // Ex3/Super3
    public void changeBackgroundColor(){
        if(number % 5 == 0){
            relativeLayout.setBackgroundColor(Color.parseColor("#FFF176")); // Yellow
        }else{
            relativeLayout.setBackgroundColor(Color.parseColor("#FFFFFF")); // White
        }
    }

}

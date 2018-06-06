package com.lifeistech.android.count;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /*

    Step1 : ①~⑥の従って，コードを書いてみよう！(Step1はググルの禁止です！ググるときはメンターに宣言してね！)
    Step2 : Step1が終わって時間があまったら、以下のことをしよう！ここからはググってもOK!!!
        Ex1 : カウントのテキストの色を変更する
        Ex2 : ボタンの背景の色を変更する
        Ex3 : 全体の背景の色を変更する
    Step3 : Step2が終わって時間が余ったら、以下のことをしよう！ここからはググってもOK!!!
        Super1 : 偶数のときだけ、カウントのテキストの色が変わる
        Super2 : 3の倍数のときだけ、ボタンの背景の色が変わる
        Super3 : 5の倍数のときだけ、全体の背景の色が変わる

    */

    // ① 変数の宣言

    TextView textView;
    int number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ② xmlファイルのidとの紐づけ

        textView = (TextView)findViewById(R.id.textView);

        // ③ 変数の初期化
        number = 0;
    }


    // ④ plusメソッドの中身を実装
    public void plus(View v){
        number = number + 1;
        textView.setText(String.valueOf(number));
    }

    // ⑤ minusメソッドの中身を実装
    public void minus(View v){
        number = number - 1;
        textView.setText(String.valueOf(number));
    }

    // ⑥clearメソッドの中身を実装
    public void clear(View v){
        number = 0;
        textView.setText(String.valueOf(number));
    }
}

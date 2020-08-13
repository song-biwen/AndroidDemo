package com.qilongtu.asdemo1;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class RadioGroupActivity extends AppCompatActivity {

    private TextView textView;
    private RadioGroup radioGroup;
    private RadioButton radioButtonYingyue,radioButtonTiYu,radioButtonWuDao,radioButtonKanShu;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.uradiogroup);


        textView = findViewById(R.id.textview3);
        radioGroup = findViewById(R.id.radiogroup);
        radioButtonYingyue = findViewById(R.id.radiobuttonyingyue);
        radioButtonTiYu = findViewById(R.id.radiobuttontiyue);
        radioButtonWuDao = findViewById(R.id.radiobuttonwudao);
        radioButtonKanShu = findViewById(R.id.radiobuttonkanshu);


        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                String text = "我最喜欢的运动是：";
                if (i == radioButtonYingyue.getId()) {
                    text += radioButtonYingyue.getText().toString();
                }
                if (i == radioButtonTiYu.getId()) {
                    text += radioButtonTiYu.getText().toString();
                }
                if (i == radioButtonWuDao.getId()) {
                    text += radioButtonWuDao.getText().toString();
                }
                if (i == radioButtonKanShu.getId()) {
                    text += radioButtonKanShu.getText().toString();
                }

                textView.setText(text);
            }
        });

    }
}

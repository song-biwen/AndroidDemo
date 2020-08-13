package com.qilongtu.asdemo1;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class UHomeActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    private CheckBox yingyue;
    private CheckBox lvyou;
    private CheckBox youxi;
    private CheckBox kandianying;
    private Button button;
    private TextView textview;
    ArrayList<String> hobbies = new ArrayList<String>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ucheckbox);


        yingyue = findViewById(R.id.yingyue);
        lvyou = findViewById(R.id.lvyou);
        youxi = findViewById(R.id.youxi);
        kandianying = findViewById(R.id.kandianying);
        button = findViewById(R.id.button4);
        textview = findViewById(R.id.textview2);

        yingyue.setOnCheckedChangeListener(this);
        lvyou.setOnCheckedChangeListener(this);
        youxi.setOnCheckedChangeListener(this);
        kandianying.setOnCheckedChangeListener(this);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                StringBuilder sb = new StringBuilder();

                for (int i = 0;i < hobbies.size();i++) {
                    if (i == hobbies.size() - 1) {
                        sb.append(hobbies.get(i));
                    }else  {
                        sb.append(hobbies.get(i) + ",");
                    }
                }

                textview.setText("你选择了："+ sb);
            }
        });

    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        if (b) {
            hobbies.add(compoundButton.getText().toString().trim());
        }else  {
            hobbies.remove(compoundButton.getText().toString().trim());
        }
    }
}

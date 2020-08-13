package com.qilongtu.asdemo1;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class SpinnerActivity extends AppCompatActivity {

    private TextView textView;
    private Spinner spinner;
    private List<String> list = new ArrayList<String>();
    private ArrayAdapter<String> adapter;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.uspinner);


        //1.定义下拉内容
        list.add("A型");
        list.add("B型");
        list.add("O型");
        list.add("AB型");
        list.add("其他");

        textView = findViewById(R.id.textview5);
        spinner = findViewById(R.id.spinner);

        //2.为下拉列表定义一个适配器
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list);

        //3 设置下拉列表下拉的菜单样式
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        //4 将适配器添加到下拉列表上
        spinner.setAdapter(adapter);

        //5 添加监听器，为下拉列表设置事件响应
        spinner.setOnItemSelectedListener(new Spinner.OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                textView.setText("你的血型是："+adapter.getItem(i));
                view.setVisibility(View.VISIBLE);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                textView.setText("NONE");
                adapterView.setVisibility(View.VISIBLE);
            }
        });

        spinner.setOnTouchListener(new Spinner.OnTouchListener(){
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {

//                view.setVisibility(View.INVISIBLE);

                return false;
            }
        });

        spinner.setOnFocusChangeListener(new Spinner.OnFocusChangeListener(){
            @Override
            public void onFocusChange(View view, boolean b) {
                view.setVisibility(View.VISIBLE);
            }
        });
    }
}

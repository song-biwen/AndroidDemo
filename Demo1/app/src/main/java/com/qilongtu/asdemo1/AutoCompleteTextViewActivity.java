package com.qilongtu.asdemo1;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class AutoCompleteTextViewActivity extends AppCompatActivity {

    private AutoCompleteTextView autoCompleteTextView;
    private static final String[] autoText = new String[]{"1张三","1张无忌","1张三丰"};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.uautocompletetextview);

        autoCompleteTextView = findViewById(R.id.uautocompletetextview);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,autoText);
        autoCompleteTextView.setAdapter(adapter);

    }
}

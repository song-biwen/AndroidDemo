package com.qilongtu.asdemo1;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class EditTextActivity extends AppCompatActivity {

    private EditText editText;
    private TextView textView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.uedittext);

        editText = findViewById(R.id.edittext2);
        textView = findViewById(R.id.textview4);

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                textView.setText(editText.getText().toString());
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }
}

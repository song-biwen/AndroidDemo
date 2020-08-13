package com.qilongtu.asdemo1;

import android.app.ActionBar;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class UImageActivity extends AppCompatActivity {

    private ImageView imageView;
    private ImageButton imageButton;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.uimage);

        imageView = findViewById(R.id.imageview);
        imageButton = findViewById(R.id.imagebutton);


        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ViewGroup.LayoutParams params = imageView.getLayoutParams();
                params.width -= 3;
                params.height -= 3;
                imageView.setLayoutParams(params);
            }
        });
    }
}

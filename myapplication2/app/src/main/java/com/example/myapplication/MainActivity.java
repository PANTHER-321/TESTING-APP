package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView img = findViewById(R.id.imageView);
        Button btn = findViewById(R.id.btnAnimate);

        btn.setOnClickListener(v ->
                img.startAnimation(AnimationUtils.loadAnimation(this,
                        R.anim.rotate))
        );
    }
}
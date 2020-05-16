package com.reza.animation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.reza.animation.activity.ShakeActivity;
import com.reza.animation.activity.YoyoAnimationsActivity;
import com.reza.animation.testAnimation.TestActivity;
import com.reza.animation.xmlAnimations.SelectXMLActivity;

public class SelectActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);

        findViewById(R.id.shake).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), ShakeActivity.class));
            }
        });

        findViewById(R.id.yoyo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), YoyoAnimationsActivity.class));
            }
        });

        findViewById(R.id.codeAnimations).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), TestActivity.class));
            }
        });

        findViewById(R.id.selectXMLActivity).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), SelectXMLActivity.class));
            }
        });

    }
}

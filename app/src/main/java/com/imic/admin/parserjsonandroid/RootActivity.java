package com.imic.admin.parserjsonandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * @author Hà Quang Trung
 * @version 1.0.0
 * @description
 * @desc Technical Director, FPT-Software.
 * @created 8/3/2018
 * @updated 8/3/2018
 * @modified by
 * @updated on 8/3/2018
 * @since 1.0
 */
public class RootActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.root);
    }

    public void clickOne(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    public void clickTwo(View view) {
        Intent intent = new Intent(this,MainActivity2.class);
        startActivity(intent);
    }

    public void clickThree(View view) {
        Intent intent = new Intent(this,MainActivity3.class);
        startActivity(intent);
    }

    public void clickFour(View view) {
        Intent intent = new Intent(this,MainActivity4.class);
        startActivity(intent);
    }
}

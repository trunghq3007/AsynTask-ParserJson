package com.imic.admin.parserjsonandroid;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

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
public class MainActivity3 extends AppCompatActivity{
    Button btnStart;
    MyAsyncTask myAsyncTask;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.asyntask1);
        btnStart = (Button) findViewById(R.id.btnStart);
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Khởi tạo tiến trình của bạn
                //Truyền Activity chính là MainActivity sang bên tiến trình của mình
                myAsyncTask = new MyAsyncTask(MainActivity3.this);
                //Gọi hàm execute để kích hoạt tiến trình
                myAsyncTask.execute();
            }
        });
    }
}

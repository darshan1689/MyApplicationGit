package com.example.dp_android.myapplicationgit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      //  http://www.goprogramming.space/connecting-an-android-studio-project-with-github/
        Toast.makeText(this,"Update Successfully",Toast.LENGTH_SHORT).show();
    }
}

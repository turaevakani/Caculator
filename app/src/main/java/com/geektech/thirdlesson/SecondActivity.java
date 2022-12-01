package com.geektech.thirdlesson;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class SecondActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String text = getIntent().getStringExtra("key1");
        ((TextView) findViewById(R.id.text_view_policies)).setText(text);
    }

    public void onClickExit (View view){
        finishAffinity();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        Log.d("calculator", "onCreate SecondActivity");    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("calculator", "onStart SecondActivity");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("calculator", "onResume SecondActivity");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("calculator", "onStop SecondActivity");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("calculator", "onPause SecondActivity");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("calculator", "onDestroy SecondActivity");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("calculator", "onRestart SecondActivity");
    }


}
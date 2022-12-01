package com.geektech.thirdlesson;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Integer first, second;
    private Boolean isOperationClick, isOperationPlus, isOperationMinus,
            isOperationMultiple, isOperationDivide;
    private Button click;
    private String btnOperation;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text_view);
        click = findViewById(R.id.btn_click);



    }

    @SuppressLint("NonConstantResourceId")
    public void onNumberClick(View view) {
        switch (view.getId()){
            case R.id.btn_one:
                btnOperation = "1";
                click.setVisibility(View.GONE);
                //click on one
                if(textView.getText().toString().equals("0") || isOperationClick){
                    textView.setText("1");
                }else{
                    textView.append("1");
                }
                break;

            case R.id.btn_two:
                btnOperation = "2";
                click.setVisibility(View.GONE);
                //click on two
                if(textView.getText().toString().equals("0") || isOperationClick){
                    textView.setText("2");
                }else{
                    textView.append("2");
                }
                break;

            case R.id.btn_three:
                btnOperation = "3";
                click.setVisibility(View.GONE);
                //click on three
                if(textView.getText().toString().equals("0") || isOperationClick){
                    textView.setText("3");
                }else{
                    textView.append("3");
                }
                break;

            case R.id.btn_four:
                btnOperation = "4";
                click.setVisibility(View.GONE);
                //click on four
                if(textView.getText().toString().equals("0") || isOperationClick){
                    textView.setText("4");
                }else{
                    textView.append("4");
                }
                break;

            case R.id.btn_five:
                btnOperation = "5";
                click.setVisibility(View.GONE);
                //click on five
                if(textView.getText().toString().equals("0") || isOperationClick){
                    textView.setText("5");
                }else{
                    textView.append("5");
                }
                break;

            case R.id.btn_six:
                btnOperation = "6";
                click.setVisibility(View.GONE);
                //click on six
                if(textView.getText().toString().equals("0") || isOperationClick){
                    textView.setText("6");
                }else{
                    textView.append("6");
                }
                break;

            case R.id.btn_seven:
                btnOperation = "7";
                click.setVisibility(View.GONE);
                //click on seven
                if(textView.getText().toString().equals("0") || isOperationClick){
                    textView.setText("7");
                }else{
                    textView.append("7");
                }
                break;

            case R.id.btn_eight:
                btnOperation = "8";
                click.setVisibility(View.GONE);
                //click on eight
                if(textView.getText().toString().equals("0") || isOperationClick){
                    textView.setText("8");
                }else{
                    textView.append("8");
                }
                break;

            case R.id.btn_nine:
                btnOperation = "9";
                click.setVisibility(View.GONE);
                //click on nine
                if(textView.getText().toString().equals("0") || isOperationClick){
                    textView.setText("9");
                }else{
                    textView.append("9");
                }
                break;

            case R.id.btn_null:
                btnOperation = "0";
                click.setVisibility(View.GONE);
                //click on null
                if(textView.getText().toString().equals("0") || isOperationClick){
                    textView.setText("0");
                }else{
                    textView.append("0");
                }
                break;

            case R.id.btn_AC:
                btnOperation = "AC";
                click.setVisibility(View.GONE);
                //click on clear
                textView.setText("0");
                first = 0;
                second = 0;
                break;
        }
        isOperationClick = false;
    }

    @SuppressLint({"NonConstantResourceId", "SetTextI18n"})
    public void onOperationClick(View view) {
        switch (view.getId()){
            case R.id.btn_plus:
                btnOperation = "+";
                click.setVisibility(View.GONE);
                //click on plus
                first = Integer.valueOf(textView.getText().toString());
                isOperationPlus = true;
                break;

            case R.id.btn_minus:
                btnOperation = "-";
                click.setVisibility(View.GONE);
                //click on minus
                first = Integer.valueOf(textView.getText().toString());
                isOperationMinus = true;
                break;

            case R.id.btn_multiple:
                btnOperation = "x";
                click.setVisibility(View.GONE);
                //click on multiple
                first = Integer.valueOf(textView.getText().toString());
                isOperationMultiple = true;
                break;

            case R.id.btn_divide:
                btnOperation = "/";
                click.setVisibility(View.GONE);
                //click on divide
                first = Integer.valueOf(textView.getText().toString());
                isOperationDivide = true;
                break;


                //equate numbers//
            case R.id.btn_equal:
                btnOperation = "=";
                click.setVisibility(View.VISIBLE);
                //click on equal
                second = Integer.valueOf(textView.getText().toString());
                if (isOperationPlus){
                    Integer result = first + second;
                    textView.setText(result.toString());
                    isOperationPlus = false;
                    break;
                }

                if (isOperationMinus){
                    Integer result = first - second;
                    textView.setText(result.toString());
                    isOperationMinus = false;
                    break;
                }

                if (isOperationMultiple){
                    Integer result = first * second;
                    textView.setText(result.toString());
                    isOperationMultiple = false;
                    break;
                }

                if (isOperationDivide){
                    Integer result = first / second;
                    textView.setText(result.toString());
                    isOperationDivide = false;
                    break;
                }

        }
        isOperationClick = true;
    }

    public void onButtonClick(View view){
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        String text = ((TextView) findViewById(R.id.text_view)).getText().toString();
        intent.putExtra("key1", text);
        startActivity(intent);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        Log.d("calculator", "onCreate MainActivity");    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("calculator", "onStart MainActivity");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("calculator", "onResume MainActivity");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("calculator", "onStop MainActivity");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("calculator", "onPause MainActivity");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("calculator", "onDestroy MainActivity");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("calculator", "onRestart MainActivity");
    }
}
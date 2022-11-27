package com.geektech.thirdlesson;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Integer first, second;
    private Boolean isOperationClick, isOperationPlus, isOperationMinus,
            isOperationMultiple, isOperationDivide;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.text_view);
    }

    @SuppressLint("NonConstantResourceId")
    public void onNumberClick(View view) {
        switch (view.getId()){
            case R.id.btn_one:
                //click on one
                if(textView.getText().toString().equals("0") || isOperationClick){
                    textView.setText("1");
                }else{
                    textView.append("1");
                }
                break;

            case R.id.btn_two:
                //click on two
                if(textView.getText().toString().equals("0") || isOperationClick){
                    textView.setText("2");
                }else{
                    textView.append("2");
                }
                break;

            case R.id.btn_three:
                //click on three
                if(textView.getText().toString().equals("0") || isOperationClick){
                    textView.setText("3");
                }else{
                    textView.append("3");
                }
                break;

            case R.id.btn_four:
                //click on four
                if(textView.getText().toString().equals("0") || isOperationClick){
                    textView.setText("4");
                }else{
                    textView.append("4");
                }
                break;

            case R.id.btn_five:
                //click on five
                if(textView.getText().toString().equals("0") || isOperationClick){
                    textView.setText("5");
                }else{
                    textView.append("5");
                }
                break;

            case R.id.btn_six:
                //click on six
                if(textView.getText().toString().equals("0") || isOperationClick){
                    textView.setText("6");
                }else{
                    textView.append("6");
                }
                break;

            case R.id.btn_seven:
                //click on seven
                if(textView.getText().toString().equals("0") || isOperationClick){
                    textView.setText("7");
                }else{
                    textView.append("7");
                }
                break;

            case R.id.btn_eight:
                //click on eight
                if(textView.getText().toString().equals("0") || isOperationClick){
                    textView.setText("8");
                }else{
                    textView.append("8");
                }
                break;

            case R.id.btn_nine:
                //click on nine
                if(textView.getText().toString().equals("0") || isOperationClick){
                    textView.setText("9");
                }else{
                    textView.append("9");
                }
                break;

            case R.id.btn_null:
                //click on null
                if(textView.getText().toString().equals("0") || isOperationClick){
                    textView.setText("0");
                }else{
                    textView.append("0");
                }
                break;

            case R.id.btn_AC:
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
                //click on plus
                first = Integer.valueOf(textView.getText().toString());
                isOperationPlus = true;
                break;

            case R.id.btn_minus:
                //click on minus
                first = Integer.valueOf(textView.getText().toString());
                isOperationMinus = true;
                break;

            case R.id.btn_multiple:
                //click on multiple
                first = Integer.valueOf(textView.getText().toString());
                isOperationMultiple = true;
                break;

            case R.id.btn_divide:
                //click on divide
                first = Integer.valueOf(textView.getText().toString());
                isOperationDivide = true;
                break;


                //equate numbers//
            case R.id.btn_equal:
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
}
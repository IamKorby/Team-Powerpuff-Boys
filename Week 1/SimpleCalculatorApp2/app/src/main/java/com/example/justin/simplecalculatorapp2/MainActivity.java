package com.example.justin.simplecalculatorapp2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    // UI Handles can be declared here so it can be accessed in the entire code
    Button buttonAdd, buttonSubtract, buttonMultiply, buttonDivide;
    TextView tvResult;
    EditText etNum1, etNum2;
    int value1, value2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvResult = (TextView) findViewById(R.id.tv_result);

        etNum1 = (EditText) findViewById(R.id.et_num1);
        etNum2 = (EditText) findViewById(R.id.et_num2);

        // objects like TextView and Button have setOnClickListener

        // to generate setOnClickListener code block:
        // <var>.setonclick
        // ctrl + space
        // enter
        // type new then space
        // ctrl + space
        // enter
        // wait for code to generate

        buttonAdd = (Button) findViewById(R.id.button_add);

        buttonAdd.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                value1 = Integer.parseInt(etNum1.getText().toString());
                value2 = Integer.parseInt(etNum2.getText().toString());
                tvResult.setText("Result: " + String.valueOf(value1 + value2));
            }
        });

        buttonSubtract = (Button) findViewById(R.id.button_subtract);

        buttonSubtract.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                value1 = Integer.parseInt(etNum1.getText().toString());
                value2 = Integer.parseInt(etNum2.getText().toString());
                tvResult.setText("Result: " + String.valueOf(value1 - value2));
            }
        });

        buttonMultiply = (Button) findViewById(R.id.button_multiply);

        buttonMultiply.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                value1 = Integer.parseInt(etNum1.getText().toString());
                value2 = Integer.parseInt(etNum2.getText().toString());
                tvResult.setText("Result: " + String.valueOf(value1 * value2));
            }
        });

        buttonDivide = (Button) findViewById(R.id.button_divide);

        buttonDivide.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                value1 = Integer.parseInt(etNum1.getText().toString());
                value2 = Integer.parseInt(etNum2.getText().toString());
                tvResult.setText("Result: " + String.valueOf(value1 / value2));
            }
        });
    }
}

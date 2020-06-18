package com.example.cal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button plus, min, div, mul;
    EditText ed1, ed2;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        plus = findViewById(R.id.plus);
        min = findViewById(R.id.min);
        div = findViewById(R.id.div);
        mul = findViewById(R.id.mul);
        ed1 = findViewById(R.id.ed1);
        ed2 = findViewById(R.id.ed2);
        result = findViewById(R.id.result);

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getresult("+");

            }
        });
        min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getresult("-");
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getresult("/");
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getresult("*");
            }
        });
    }

    public void getresult(String what){
        if(ed1.getText().toString().equals("")){
            Toast.makeText(MainActivity.this, "1번 값을 입력해주세요", Toast.LENGTH_SHORT).show();
        }
        else if(ed1.getText().toString().equals("")){
            Toast.makeText(MainActivity.this, "2번 값을 입력해주세요", Toast.LENGTH_SHORT).show();
        }
        else {
            int num1 = Integer.parseInt(ed1.getText().toString());
            int num2 = Integer.parseInt(ed2.getText().toString());
            switch (what){
                case "+": result.setText("계산결과: " + String.valueOf(num1 + num2)); break;
                case "-": result.setText("계산결과: " + String.valueOf(num1 - num2)); break;
                case "/": result.setText("계산결과: " + String.valueOf(num1 / num2)); break;
                case "*": result.setText("계산결과: " + String.valueOf(num1 * num2)); break;
                default: break;

            }

        }
    }
}

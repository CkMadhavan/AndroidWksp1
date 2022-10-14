package com.madhavan.testing2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText op1, op2;
    TextView output;
    Button add, sub, mul, div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        op1 = (EditText) findViewById(R.id.op1);
        op2 = (EditText) findViewById(R.id.op2);

        output = (TextView) findViewById(R.id.output);

        add = (Button) findViewById(R.id.add);
        sub = (Button) findViewById(R.id.sub);
        mul = (Button) findViewById(R.id.mul);
        div = (Button) findViewById(R.id.div);
    }

    public void addFunc(View v){
        String op1_text = op1.getText().toString();
        float op1_int = Float.parseFloat(op1_text);

        String op2_text = op2.getText().toString();
        float op2_int = Float.parseFloat(op2_text);

        float output_int = op1_int + op2_int;

        output.setText(String.valueOf(output_int));
    }

    public void subFunc(View v){
        String op1_text = op1.getText().toString();
        float op1_int = Float.parseFloat(op1_text);

        String op2_text = op2.getText().toString();
        float op2_int = Float.parseFloat(op2_text);

        float output_int = op1_int - op2_int;

        output.setText(String.valueOf(output_int));
    }

    public void mulFunc(View v){
        String op1_text = op1.getText().toString();
        float op1_int = Float.parseFloat(op1_text);

        String op2_text = op2.getText().toString();
        float op2_int = Float.parseFloat(op2_text);

        float output_int = op1_int * op2_int;

        output.setText(String.valueOf(output_int));
    }

    public void divFunc(View v){
        String op1_text = op1.getText().toString();
        float op1_int = Float.parseFloat(op1_text);

        String op2_text = op2.getText().toString();
        float op2_int = Float.parseFloat(op2_text);

        float output_int = op1_int / op2_int;

        output.setText(String.valueOf(output_int));
    }

}
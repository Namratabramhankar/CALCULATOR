package com.coc.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button_add,button_sub,button_div,button_mul,button_perfect,button_armstrong,button_pow,button_fact;
    private TextView first_id,second_id,result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

    }

    private void init() {
        button_add=(Button)findViewById(R.id.button_add);
        button_sub=(Button)findViewById(R.id.button_sub);
        button_div=(Button)findViewById(R.id.button_div);
        button_mul=(Button)findViewById(R.id.button_mul);
        button_perfect=(Button)findViewById(R.id.button_perfect);
        button_armstrong=(Button)findViewById(R.id.button_armstrong);
        button_pow=(Button)findViewById(R.id.button_pow);
        button_fact=(Button)findViewById(R.id.button_fact);
        first_id=(TextView)findViewById(R.id.first_id);
        second_id=(TextView)findViewById(R.id.second_id);
        result=(TextView)findViewById(R.id.result);

        button_add.setOnClickListener(this);
        button_sub.setOnClickListener(this);
        button_mul.setOnClickListener(this);
        button_div.setOnClickListener(this);
        button_perfect.setOnClickListener(this);
        button_armstrong.setOnClickListener(this);
        button_pow.setOnClickListener(this);
        button_fact.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String num1 = first_id.getText().toString();
        String num2 = second_id.getText().toString();
        switch(v.getId()){
            case R.id.button_add: float add=Integer.parseInt(num1)+ Integer.parseInt(num2);
                                  result.setText(String.valueOf(add));
                                  break;
        }

    }
}

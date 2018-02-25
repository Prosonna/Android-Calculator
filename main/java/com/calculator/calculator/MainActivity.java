package com.calculator.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btAdd,btSub,btMul,btDiv,btRem,btSquare,btPercent,btRoot;
    private TextView result;
    private EditText fnumber,Snumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init(){
        btAdd=(Button)findViewById(R.id.btAdd);
        btSub=(Button)findViewById(R.id.btSub);
        btMul=(Button)findViewById(R.id.btMul);
        btDiv=(Button)findViewById(R.id.btDiv);
        btRem=(Button)findViewById(R.id.btRem);
        btPercent=(Button)findViewById(R.id.btPercent);
        btSquare=(Button)findViewById(R.id.btSquare);
        btRoot=(Button)findViewById(R.id.btRoot);

        fnumber=(EditText)findViewById(R.id.fnumber);
        Snumber=(EditText)findViewById(R.id.Snumber);
        result=(TextView)findViewById(R.id.result);

        btAdd.setOnClickListener(this);
        btSub.setOnClickListener(this);
        btMul.setOnClickListener(this);
        btDiv.setOnClickListener(this);
        btRem.setOnClickListener(this);
        btPercent.setOnClickListener(this);
        btSquare.setOnClickListener(this);
        btRoot.setOnClickListener(this);

    }

    @Override
    public void onClick(View view){
        String num1=fnumber.getText().toString();
        String num2=Snumber.getText().toString();

        switch(view.getId()){
            case R.id.btAdd:
                Float addition = Float.parseFloat(num1)+ Float.parseFloat(num2);
                result.setText(String.valueOf(addition));
                break;
            case R.id.btSub:
                Float subtraction = Float.parseFloat(num1)- Float.parseFloat(num2);
                result.setText(String.valueOf(subtraction));
                break;
            case R.id.btMul:

                Float multiplication = Float.parseFloat(num1)* Float.parseFloat(num2);
                result.setText(String.valueOf(multiplication));
                break;

            case R.id.btDiv:
             try {
                 Float division = Float.parseFloat(num1) / Float.parseFloat(num2);
                 result.setText(String.valueOf(division));
             }catch(Exception e){
                 result.setText("Cannot be Divided!");
             }
                break;

            case R.id.btRem:

                int remainder = Integer.parseInt(num1)% Integer.parseInt(num2);
                result.setText(String.valueOf(remainder));
                break;

            case R.id.btPercent:

                Float percent = Float.parseFloat(num1)/100;
                result.setText(String.valueOf(percent));
                break;

            case R.id.btSquare:

                int square = Integer.parseInt(num1)* Integer.parseInt(num1);
                result.setText(String.valueOf(square));
                break;

            case R.id.btRoot:

                Double root = Math.sqrt(Double.parseDouble(num1));
                result.setText(String.valueOf(root));
                break;

        }
    }
}
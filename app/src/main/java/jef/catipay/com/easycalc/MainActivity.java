package jef.catipay.com.easycalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Operations op = new Operations();
        final Button addBtn = (Button) findViewById(R.id.addBtn);
        final Button divideBtn = (Button) findViewById(R.id.divideBtn);
        final Button subtractBtn = (Button) findViewById(R.id.subtractBtn);
        final Button multiplyBtn = (Button) findViewById(R.id.multiplyBtn);
        final Button clearBtn = (Button) findViewById(R.id.clearBtn);
        final Button exitBtn = (Button)findViewById(R.id.exitBtn);
        final EditText firstNumber = (EditText)findViewById(R.id.firstNumber);
        final EditText secondNumber = (EditText)findViewById(R.id.secondNumber);
        final TextView result = (TextView)findViewById(R.id.result);



        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number input = new number(Float.parseFloat(firstNumber.getText().toString()),Float.parseFloat(secondNumber.getText().toString()));
                result.setText(String.valueOf(op.addition(input)));
            }
        });
        divideBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number input = new number(Float.parseFloat(firstNumber.getText().toString()),Float.parseFloat(secondNumber.getText().toString()));
                result.setText(String.valueOf(op.division(input)));
            }
        });
        multiplyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number input = new number(Float.parseFloat(firstNumber.getText().toString()),Float.parseFloat(secondNumber.getText().toString()));
                result.setText(String.valueOf(op.multiply(input)));
            }
        });
        subtractBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number input = new number(Float.parseFloat(firstNumber.getText().toString()),Float.parseFloat(secondNumber.getText().toString()));
                result.setText(String.valueOf(op.subtraction(input)));
            }
        });

        clearBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                firstNumber.setText("");
                secondNumber.setText("");
            }

        });
        exitBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
              System.exit(0);
            }

        });


    }


}

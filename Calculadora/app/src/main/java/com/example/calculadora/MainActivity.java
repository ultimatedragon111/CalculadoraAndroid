package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView textResult;
    private EditText num1;
    private EditText num2;
    private Button btadd;
    private Button btsub;
    private Button btmul;
    private Button btdiv;
    private Button btpower;
    private Button btCe;
    private Button btAboutUs;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textResult = (TextView) findViewById(R.id.textResult);
        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);
        btadd = (Button) findViewById(R.id.btadd);
        btsub = (Button) findViewById(R.id.btsub);
        btmul = (Button) findViewById(R.id.btmul);
        btdiv = (Button) findViewById(R.id.btdiv);
        btpower = (Button) findViewById(R.id.btpower);
        btCe = (Button) findViewById(R.id.btCe);
        btAboutUs = (Button) findViewById(R.id.btAboutUs);



        textResult.setText("0.0");

        btadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Suma
                if(num1.getText().toString().trim().isEmpty() || num2.getText().toString().trim().isEmpty()){
                    Toast.makeText(MainActivity.this,"Enter a number", Toast.LENGTH_SHORT).show();
                }
                else{
                    double result = Double.parseDouble(num1.getText().toString().trim()) +  Double.parseDouble(num2.getText().toString().trim());
                    textResult.setText(result + "");
                }
            }
        });
        btsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Resta
                if(num1.getText().toString().trim().isEmpty() || num2.getText().toString().trim().isEmpty()){
                    Toast.makeText(MainActivity.this,"Enter a number", Toast.LENGTH_SHORT).show();
                }
                else{
                    double result = Double.parseDouble(num1.getText().toString().trim()) -  Double.parseDouble(num2.getText().toString().trim());
                    textResult.setText(result + "");
                }
            }
        });
        btmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Multiplicacion
                if(num1.getText().toString().trim().isEmpty() || num2.getText().toString().trim().isEmpty()){
                    Toast.makeText(MainActivity.this,"Enter a number", Toast.LENGTH_SHORT).show();
                }
                else{
                    double result = Double.parseDouble(num1.getText().toString().trim()) *  Double.parseDouble(num2.getText().toString().trim());
                    textResult.setText(result + "");
                }
            }
        });
        btdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Division
                if(num1.getText().toString().trim().isEmpty() || num2.getText().toString().trim().isEmpty()){
                    Toast.makeText(MainActivity.this,"Enter a number", Toast.LENGTH_SHORT).show();
                }
                else{
                    if(Double.parseDouble(num2.getText().toString().trim()) == 0){
                        Toast.makeText(MainActivity.this,"Imposible division", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        double result = Double.parseDouble(num1.getText().toString().trim()) /  Double.parseDouble(num2.getText().toString().trim());
                        textResult.setText(result + "");
                    }
                }
            }
        });
        btpower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Elevacion
                if(num1.getText().toString().trim().isEmpty() || num2.getText().toString().trim().isEmpty()){
                    Toast.makeText(MainActivity.this,"Enter a number", Toast.LENGTH_SHORT).show();
                }
                else{
                    double result = Math.pow(Double.parseDouble(num1.getText().toString().trim()),Double.parseDouble(num2.getText().toString().trim()));
                    textResult.setText(result + "");
                }
            }
        });
        btCe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Reset
                num1.setText("");
                num2.setText("");
                textResult.setText("0.0");
            }
        });
        btAboutUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //About us
                Intent intent = new Intent(MainActivity.this,AboutUs.class);
                startActivity(intent);
            }
        });


    }
}
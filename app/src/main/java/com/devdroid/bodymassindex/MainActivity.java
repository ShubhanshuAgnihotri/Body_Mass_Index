package com.devdroid.bodymassindex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText edtWeight,edtHeightFt,edtHeightIn;
        Button btnCalculate;
        TextView txtResult;

        edtWeight = findViewById(R.id.edtWeight);
        edtHeightFt = findViewById(R.id.edtHeightFt);
        edtHeightIn = findViewById(R.id.edtHeightIn);
        btnCalculate = findViewById(R.id.btnCalculate);
        txtResult = findViewById(R.id.txtResult);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              int wt = Integer.parseInt(edtWeight.getText().toString());
              int ft = Integer.parseInt(edtHeightFt.getText().toString());
              int in = Integer.parseInt(edtHeightIn.getText().toString());

              int totalIn = ft*12 + in;
              double totalCm = totalIn*2.53;

              double totalM = totalCm/100;
              double bmi = wt/(totalM*totalM);

              if(bmi>25) {
                  txtResult.setText("You Are OverWeight");
              }else if (bmi<18){
                  txtResult.setText("You Are UnderWeight");
              }else{
                  txtResult.setText("You Are Healthy");

              }

            }
        });





    }
}
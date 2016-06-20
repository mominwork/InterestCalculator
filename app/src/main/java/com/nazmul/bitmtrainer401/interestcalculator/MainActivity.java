package com.nazmul.bitmtrainer401.interestcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText principalAmountET;
    EditText interestRateET;
    EditText timePeriodET;
    InterestCalculator interestCalculator;
    TextView totalAmountTV;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        principalAmountET=(EditText)findViewById(R.id.prinAmountET);
        interestRateET=(EditText)findViewById(R.id.interestET);
        timePeriodET=(EditText)findViewById(R.id.timeET);
        interestCalculator=new InterestCalculator();
        totalAmountTV=(TextView)findViewById(R.id.totalAmountTV);
    }

    public void calculate(View view) {
        
        double principalAmount=Double.parseDouble(principalAmountET.getText().toString());
        float interestRate=Float.parseFloat(interestRateET.getText().toString());
        float timePeriod=Float.parseFloat(timePeriodET.getText().toString());

        interestCalculator.setPrincipalAmount(principalAmount);
        interestCalculator.setInterestRate(interestRate);
        interestCalculator.setTimePeriod(timePeriod);
        totalAmountTV.setText(String.valueOf(interestCalculator.calculateTotalAmount()));
    }
}

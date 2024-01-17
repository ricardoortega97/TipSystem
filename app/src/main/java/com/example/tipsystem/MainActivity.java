package com.example.tipsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
//main
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fithteen();
        eightteen();
        twenty();
    }

    private void fithteen(){
        Button tip1 = findViewById(R.id.tip1);
        tip1.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              EditText amount = findViewById(R.id.billAmount);//input the amount
              TextView tipAndTotal = findViewById(R.id.total);
              String bill = amount.getText().toString();

              double intAmount = Double.parseDouble(bill);
              double tip = intAmount * 0.15;
              double total = intAmount + tip;
              String strTip = String.format("%.2f", tip);
              String strTotal = String.format("%.2f", total);
              Resources res = getResources();
              String strAmount = res.getString(R.string.tip, strTip, strTotal);
              tipAndTotal.setText(strAmount);
          }
      });
    }
    private void eightteen(){
        Button tip1 = findViewById(R.id.tip2);
        tip1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText amount = findViewById(R.id.billAmount);//input the amount
                TextView tipAndTotal = findViewById(R.id.total);
                String bill = amount.getText().toString();

                double intAmount = Double.parseDouble(bill);
                double tip = intAmount * 0.18;
                double total = intAmount + tip;
                String strTip = String.format("%.2f", tip);
                String strTotal = String.format("%.2f", total);
                Resources res = getResources();
                String strAmount = res.getString(R.string.tip, strTip, strTotal);
                tipAndTotal.setText(strAmount);
            }
        });
    }
    private void twenty(){
        Button tip1 = findViewById(R.id.tip3);
        tip1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText amount = findViewById(R.id.billAmount);//input the amount
                TextView tipAndTotal = findViewById(R.id.total);
                String bill = amount.getText().toString();

                double intAmount = Double.parseDouble(bill);
                double tip = intAmount * 0.20;
                double total = intAmount + tip;
                String strTip = String.format("%.2f", tip);
                String strTotal = String.format("%.2f", total);
                Resources res = getResources();
                String strAmount = res.getString(R.string.tip, strTip, strTotal);
                tipAndTotal.setText(strAmount);
            }
        });
    }
}

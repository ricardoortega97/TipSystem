package com.example.tipsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
//main
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fithteen();

    }

    private void fithteen(){
        Button tip1 = findViewById(R.id.tip1);
        tip1.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              EditText amount = findViewById(R.id.billAmount);
              TextView tipAndTotal = findViewById(R.id.total);
              String bill = amount.getText().toString();

              double intAmount = (double) Integer.parseInt(bill);
              double tip = intAmount * 0.15;
              double total = intAmount + tip;
              String strTip = String.valueOf(tip);
              String strTotal = String.valueOf(total);
              Resources res = getResources();
              String strAmount = res.getString(R.string.tip, strTip, strTotal);
              tipAndTotal.setText(strAmount);
          }
      });




    }
}
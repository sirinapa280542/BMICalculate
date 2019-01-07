package com.nititad.bmicalculate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private void calBMI(){
        EditText textw = (EditText)findViewById(R.id.EditText_textw);
        EditText texth = (EditText)findViewById(R.id.EditText_texth);

        double w = Double.parseDouble(textw.getText().toString());
        double h = Double.parseDouble(texth.getText().toString());

        h = h/100; // cm-->m
        double bmi = w/ (h*h);

        DecimalFormat decFormat = new DecimalFormat ("##.##");
        String msg = "ค่า BMI คือ" + decFormat.format(bmi) + "\n";
        msg +="ลักษณะรูปร่างคือ:";
        if (bmi >=40) msg +="อ้วนขั้นสูงสุด";
        else if (bmi >= 35) msg +="อ้วนขั้นที่2";
        else if (bmi >= 28.5) msg +="อ้วนขั้นที่1";
        else if (bmi >= 23.5) msg +="น้ำหนักเกิน";
        else if (bmi >= 18.5) msg +="อยู่ในเกณฑ์ปกติ";
        else msg += "น้ำหนักต่ำกว่าเกณฑ์";
        Toast.makeText(getBaseContext(),msg, Toast.LENGTH_LONG).show();
    }
}



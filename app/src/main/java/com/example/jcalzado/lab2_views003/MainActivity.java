package com.example.jcalzado.lab2_views003;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText field1, field2;
    TextView result;
    CheckBox checkSumar, checkRestar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        field1 = (EditText) findViewById(R.id.inText1);
        field2 = (EditText) findViewById(R.id.inText2);
        result = (TextView) findViewById(R.id.outText);
        checkSumar = (CheckBox) findViewById(R.id.checkBoxSumar);
        checkRestar = (CheckBox) findViewById(R.id.checkBoxRestar);
    }

    public void operar (View v) {
        int numero1 = Integer.parseInt(field1.getText().toString());
        int numero2 = Integer.parseInt(field2.getText().toString());
        String outString = "";

        if(checkSumar.isChecked()) {
            outString += "La suma es: " + String.valueOf(numero1+numero2);
        }
        if(checkRestar.isChecked()) {
            outString += "  La resta es: " + String.valueOf(numero1-numero2);
        }
        if(!checkSumar.isChecked() && !checkRestar.isChecked()){
            outString = "";
        }
        result.setText(outString);
    }
}

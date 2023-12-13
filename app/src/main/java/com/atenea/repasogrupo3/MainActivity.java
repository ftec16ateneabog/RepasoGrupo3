package com.atenea.repasogrupo3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.DatePicker;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*
        DatePicker datePicker = findViewById(R.id.dateTimePicker);

        int day = datePicker.getDayOfMonth();
        int month = datePicker.getMonth();
        int year = datePicker.getYear();

        datePicker.setOnDateChangedListener(new DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(DatePicker datePicker, int i, int i1, int i2) {
                int a = 1;
            }
        });*/
        TextInputEditText nombre = findViewById(R.id.NompreInputText);
        nombre.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(Seguridad.isValidMail(charSequence.toString()))
                {
                    Toast.makeText(MainActivity.this, "pattern El correo es valido",Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(MainActivity.this, "pattern El correo no es valido",Toast.LENGTH_LONG).show();
                }
                if(Seguridad.isValidText(charSequence.toString()))
                {
                    Toast.makeText(MainActivity.this, "manual El correo es valido",Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(MainActivity.this, "manual El correo no es valido",Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

    }


}
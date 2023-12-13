package com.atenea.repasogrupo3;

import android.util.Patterns;

import com.google.android.material.textfield.TextInputEditText;

public class Seguridad {
    public static boolean isValidNombre(String nombre,int min,int max) {
        int numberChart = (((nombre).toString()).trim()).length();
        return  numberChart >=  min && numberChart <= max;
    }
    public static boolean isValidTel(String tel)
    {
        return Patterns.PHONE.matcher(tel).matches();
    }
    public static boolean isValidMail(String mail)
    {
        return Patterns.EMAIL_ADDRESS.matcher(mail).matches();
    }
    public  static boolean isValidText(String text)
    {
        return text.matches("^[a-zA-Z0-9_+&*-]+(?:\\\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\\\.)+[a-zA-Z]{2,7}$");
    }
}

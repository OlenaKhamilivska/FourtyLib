package com.example.mylibrary;

import android.content.Context;
import android.widget.Toast;

public class Show {
    public static void showToast (Context context, String message){
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }
}

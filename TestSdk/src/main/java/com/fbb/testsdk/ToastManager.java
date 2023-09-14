package com.fbb.testsdk;

import android.content.Context;
import android.widget.Toast;

public class ToastManager {

    public void message(Context context, String message){

        Toast.makeText(context, message, Toast.LENGTH_LONG).show();

    }
}

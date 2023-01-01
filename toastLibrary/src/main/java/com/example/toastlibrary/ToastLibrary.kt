package com.example.toastlibrary

import android.content.Context
import android.widget.Toast

 class ToastLibrary {

     fun simpleToast(context : Context, msg : String) {
        Toast.makeText(context, msg, Toast.LENGTH_LONG).show()
    }
}
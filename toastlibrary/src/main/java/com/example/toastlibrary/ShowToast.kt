package com.example.toastlibrary

import android.content.Context
import android.widget.Toast

public class ShowToast {
    companion object{
        fun showToast(context: Context){
            Toast.makeText(context,"Hello Programmers",Toast.LENGTH_LONG).show()
        }
        fun add(a:Int,b:Int):Int{
            return a+b
        }
    }
}
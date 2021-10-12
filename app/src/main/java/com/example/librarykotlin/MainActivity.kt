package com.example.librarykotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.toastlibrary.ShowToast

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ShowToast.showToast(this)
        Log.d(TAG, "onCreate: "+ShowToast.add(2,5))
    }
}
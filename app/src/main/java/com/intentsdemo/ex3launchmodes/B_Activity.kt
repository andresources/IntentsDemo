package com.intentsdemo.ex3launchmodes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.intentsdemo.R

class B_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)
    }

    fun funLaunchC(view: View) {
        startActivity(Intent(this,C_Activity::class.java))
    }
}
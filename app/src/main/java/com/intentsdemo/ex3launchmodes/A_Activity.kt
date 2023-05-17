package com.intentsdemo.ex3launchmodes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.intentsdemo.R

class A_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a)
    }

    fun funLaunchB(view: View) {
        startActivity(Intent(this,B_Activity::class.java))
    }
}
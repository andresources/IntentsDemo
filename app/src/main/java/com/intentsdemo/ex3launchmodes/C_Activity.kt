package com.intentsdemo.ex3launchmodes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.intentsdemo.R

class C_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c)
    }

    fun funLaunchD(view: View) {
        startActivity(Intent(this,D_Activity::class.java))
    }
}
package com.intentsdemo.ex3launchmodes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.intentsdemo.R

class D_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_d)
    }

    fun funLaunchB(view: View) {
        startActivity(Intent(this,B_Activity::class.java))
    }

    fun funLaunchE(view: View) {
        startActivity(Intent(this,E_Activity::class.java))
    }
}
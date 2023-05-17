package com.intentsdemo.ex3launchmodes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.intentsdemo.R

class E_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_e)
        Log.i("lnc","onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.i("lnc","onStart")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("lnc","onRestart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("lnc","onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("lnc","onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("lnc","onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("lnc","onDestroy")
    }
    fun funLaunchE(view: View) {
        startActivity(Intent(this,E_Activity::class.java))
    }
}
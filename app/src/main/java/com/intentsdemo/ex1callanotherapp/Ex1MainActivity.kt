package com.intentsdemo.ex1callanotherapp

import android.content.Intent
import android.content.Intent.FLAG_ACTIVITY_NEW_TASK
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.intentsdemo.R

class Ex1MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ex1_main)
    }

    fun startNewActivity(view: View) {
        var intent: Intent?= packageManager.getLaunchIntentForPackage("com.broadcastRevDemo")
        if(intent!=null){
            intent.flags = FLAG_ACTIVITY_NEW_TASK
            startActivity(intent)
        }else{
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("market://details?id=" + "com.broadcastRevDemo"));
            startActivity(intent);
        }
    }
}
package com.intentsdemo.ex2sharecontent

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.intentsdemo.R

class Ex2ShareContentMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ex2_share_content_main)
        val data: Uri? = intent?.data

        // Figure out what to do based on the intent type
        if (intent?.type?.startsWith("image/") == true) {
            Toast.makeText(applicationContext,data.toString(),Toast.LENGTH_LONG).show()
        } else if (intent?.type == "text/plain") {
            // Handle intents with text
            Toast.makeText(applicationContext,data.toString(),Toast.LENGTH_LONG).show()
        }
    }
}
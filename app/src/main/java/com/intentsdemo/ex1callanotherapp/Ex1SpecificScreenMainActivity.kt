package com.intentsdemo.ex1callanotherapp

import android.content.ComponentName
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.intentsdemo.R

class Ex1SpecificScreenMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ex1_specific_screen_main)
    }
    //This is explicit intent
    fun startSpecificScreen(view: View) {
        var intent: Intent = Intent()
        intent.component = ComponentName("com.broadcastRevDemo","com.broadcastRevDemo.MainActivity")
        //intent.action = "com.broadcastRevDemo.myaction1"
        intent.putExtra("mydata","100")

        if(packageManager.resolveActivity(intent,0)!=null){
            startActivityForResult(intent,100)
        } else {
            Toast.makeText(this, "No app installed that can perform this action", Toast.LENGTH_SHORT).show();
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        Toast.makeText(applicationContext,"Result"+data?.getStringExtra("mydat"),Toast.LENGTH_LONG).show()

    }
}
package dev.eder.deeplink

import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    val TAG = MainActivity::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val action: String? = intent?.action
        val data: Uri? = intent?.data
        if (data!= null){
            Log.wtf(TAG,"Received ${intent.data.toString()}")
        }
    }
}

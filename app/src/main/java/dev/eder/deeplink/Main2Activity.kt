package dev.eder.deeplink

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        if (intent.data != null) {
            Log.wtf(TAG, "Received" + intent.data!!.toString())
        }
    }

    companion object {

        private val TAG = Main2Activity::class.java.simpleName
    }
}

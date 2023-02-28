package com.chatlog.currenttime

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val time = findViewById<TextView>(R.id.time)

        val timer = object: CountDownTimer(1000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                time.text = getCurrentDate()
            }

            override fun onFinish() {
                this.start()
            }
        }

        timer.start()
    }
    private fun getCurrentDate(): String {
        val sdf = SimpleDateFormat("HH:mm:ss")
        return sdf.format(Date())
    }
}
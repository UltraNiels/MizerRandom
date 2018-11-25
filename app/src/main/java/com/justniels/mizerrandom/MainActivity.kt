package com.justniels.mizerrandom

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rolknop = findViewById<Button>(R.id.rolknop)
        val resultTextView = findViewById<TextView>(R.id.resultTextView)
        val schuifDing = findViewById<SeekBar>(R.id.schuifDing)

        rolknop.setOnClickListener {
            val rand = Random().nextInt(schuifDing.progress + 1) + 1
            resultTextView.text = rand.toString()
        }
    }
}

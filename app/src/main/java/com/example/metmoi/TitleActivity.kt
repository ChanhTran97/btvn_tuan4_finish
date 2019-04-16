@file:Suppress("DEPRECATION")

package com.example.metmoi

import android.app.Activity
import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import kotlinx.android.synthetic.main.activity_title.*


class TitleActivity : AppCompatActivity() {

    private var edtext: String? = "KHTN"
    private var textcolor = "#D81B60"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_title)
        newtitle.setText(edtext)

        val colorview = findViewById<Button>(R.id.btn_title)
        colorview.setBackgroundColor(Color.parseColor(textcolor))

        newtitle.setText((edtext))
        newtitle.setTextColor(Color.parseColor(textcolor))

        val data: Bundle? = intent.extras
        if (data != null) {
            val textedi: String? = data.getString("textmain")
            newtitle.setText(textedi)
        }


        val blue = findViewById<Button>(R.id.btn_blue)
        blue?.setOnClickListener {
            textcolor = "#1976D2"
            colorview.setBackgroundColor(Color.parseColor("#1976D2"))
            newtitle.setTextColor(Color.parseColor(textcolor))
        }


        val green = findViewById<Button>(R.id.btn_green)
        green?.setOnClickListener {
            textcolor = "#64DD17"
            colorview.setBackgroundColor(Color.parseColor(textcolor))
            newtitle.setTextColor(Color.parseColor(textcolor))
        }

        val yellow = findViewById<Button>(R.id.btn_yellow)
        yellow?.setOnClickListener {
            textcolor = "#FDD835"
            colorview.setBackgroundColor(Color.parseColor(textcolor))
            newtitle.setTextColor(Color.parseColor(textcolor))
        }

        val orange = findViewById<Button>(R.id.btn_Orange)
        orange?.setOnClickListener {
            textcolor = "#FF9800"
            colorview.setBackgroundColor(Color.parseColor(textcolor))
            newtitle.setTextColor(Color.parseColor(textcolor))
        }

        val purpe = findViewById<Button>(R.id.btn_purpe)
        purpe?.setOnClickListener {
            textcolor = "#AB47BC"
            colorview.setBackgroundColor(Color.parseColor(textcolor))
            newtitle.setTextColor(Color.parseColor(textcolor))
        }

        val red = findViewById<Button>(R.id.btn_Red)
        red?.setOnClickListener {
            textcolor = "#f44336"
            colorview.setBackgroundColor(Color.parseColor(textcolor))
            newtitle.setTextColor(Color.parseColor(textcolor))
        }


        val btn_save = findViewById<Button>(R.id.titlesave)
        btn_save?.setOnClickListener {
            edtext = newtitle.text.toString()
            intent.putExtra("textshow", edtext)
            intent.putExtra("colortext", textcolor)
            setResult(Activity.RESULT_OK, intent)
            finish()
        }
    }
}

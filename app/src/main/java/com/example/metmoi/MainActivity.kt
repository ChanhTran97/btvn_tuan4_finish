@file:Suppress("UsePropertyAccessSyntax")

package com.example.metmoi

import android.app.Activity
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.view.View.OnClickListener
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ima = findViewById<ImageView>(R.id.Logo)
        ima.setImageResource(R.drawable.image)
        btnbackground.setOnClickListener(gotoBackground)
        btntitle.setOnClickListener(gotoTitleActivity)



    }

    private val gotoTitleActivity = OnClickListener {
        val intent = Intent(this,TitleActivity::class.java)
        intent.putExtra("textmain",tview.getText())
        startActivityForResult(intent, 987)
    }

//    companion object {
//        const val REQUEST_CODE = 1099
//        //const val REQUEST = 1097
//    }

    private val gotoBackground = View.OnClickListener {
        val intent = Intent(this, BackgroundActivity::class.java)
        startActivityForResult(intent, 999)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)


        if (requestCode == 999 && resultCode == Activity.RESULT_OK) {

            val ima = findViewById<ImageView>(R.id.Logo)
            val img = data?.getIntExtra("haha", 0)
            img?.let {ima.setImageResource(img)}
        }

        if(requestCode == 987 && resultCode == Activity.RESULT_OK){
            val text: String? = data?.getStringExtra("textshow")
            val colortext: String? = data?.getStringExtra("colortext")
            val mau = findViewById<TextView>(R.id.tview)
            text?.let{mau.setText(text)}
            colortext?.let{mau.setTextColor(Color.parseColor(colortext))}

        }
    }





}
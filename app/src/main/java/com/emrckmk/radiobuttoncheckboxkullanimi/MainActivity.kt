package com.emrckmk.radiobuttoncheckboxkullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            val javaDurum = checkBoxJava.isChecked
            val pythonDurum=checkBoxPython.isChecked
            val galatasarayDurum=radioButtonGalatasaray.isChecked
            val barcelonaDurum=radioButtonBarcelona.isChecked

            Log.e("JavaDurumu",javaDurum.toString())
            Log.e("PythonDurumu",pythonDurum.toString())
            Log.e("GalatasarayDurumu",galatasarayDurum.toString())
            Log.e("BarcelonaDurumu",barcelonaDurum.toString())

        }

        radioButtonGalatasaray.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked){
                Toast.makeText(applicationContext,"Tebrikler",Toast.LENGTH_LONG).show()
            }
        }

    }
}
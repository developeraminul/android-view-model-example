package com.example.viewmodelexample

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewModel: ColorViewModel = ViewModelProvider(this).get(ColorViewModel::class.java)

        val btnChangeBG = findViewById<Button>(R.id.button)
        btnChangeBG.setBackgroundColor(viewModel.getButtonColor())
        btnChangeBG.setOnClickListener {
            viewModel.setButtonColor()
            btnChangeBG.setBackgroundColor(viewModel.getButtonColor())
        }
    }

    override fun onStart() {
        super.onStart()
        println("onStart()")

    }

    override fun onResume() {
        super.onResume()
        println("onResume")
    }

    override fun onPause() {
        super.onPause()
        println("onPause()")
    }

    override fun onRestart() {
        super.onRestart()
        println("onRestart()")
    }

    override fun onStop() {
        super.onStop()
        println("onStop()")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("onDestroy()")
    }
}
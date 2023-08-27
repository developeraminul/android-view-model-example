package com.example.viewmodelexample
import android.graphics.Color
import androidx.lifecycle.ViewModel

class ColorViewModel : ViewModel() {
    private var buttonColor = Color.BLUE

    fun setButtonColor() {
        this.buttonColor = Color.RED
    }

    @JvmName("getButtonColor1")
    fun getButtonColor(): Int = this.buttonColor
}
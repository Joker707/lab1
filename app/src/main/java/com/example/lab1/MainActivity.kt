package com.example.lab1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.task1_1.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.task1_1)
        memebutton1_1.setOnClickListener {
            roll()
        }
    }

    private fun roll() {
        val drawableResource = when (Random.nextInt(10) + 1) {
            1 -> R.drawable.meme_1
            2 -> R.drawable.meme_2
            3 -> R.drawable.meme_3
            4 -> R.drawable.meme_4
            5 -> R.drawable.meme_5
            6 -> R.drawable.meme_6
            7 -> R.drawable.meme_7
            8 -> R.drawable.meme_8
            9 -> R.drawable.meme_9
            else -> R.drawable.meme_10
        }
        memeimage1_1.setImageResource(drawableResource)
    }
}
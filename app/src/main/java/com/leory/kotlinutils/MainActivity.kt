package com.leory.kotlinutils

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.leory.kotlinutils.utils.click
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var num = 0
        btn.click {
            num++
            txt.text = num.toString()
        }
    }
}

package com.example.hwk4final

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hwk4final.ui.main.MainFragment


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_fragment)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.starthere, MainFragment.newInstance())
                .commitNow()
        }
    }
}
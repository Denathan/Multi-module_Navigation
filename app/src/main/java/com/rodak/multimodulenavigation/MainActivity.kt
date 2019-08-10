package com.rodak.multimodulenavigation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.rodak.utlis.constans.MAIN_FRAGMENT
import com.rodak.utlis.extensions.display

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MainFragment().display(supportFragmentManager, R.id.fragmentContainer, MAIN_FRAGMENT)
    }
}
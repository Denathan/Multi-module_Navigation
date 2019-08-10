package com.rodak.multimodulenavigation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.rodak.multimodulenavigation.extensions.display

class MainActivity : AppCompatActivity() {

    private val defaultTag = "TAG"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MainFragment().display(supportFragmentManager, R.id.fragmentContainer, defaultTag)
    }
}

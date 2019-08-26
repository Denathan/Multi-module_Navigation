package com.rodak.firstfeature

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.rodak.util.extensions.display

class FeatureActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feature)

        FeatureFragment().display(supportFragmentManager, R.id.fragmentContainer, "TAG")
    }
}

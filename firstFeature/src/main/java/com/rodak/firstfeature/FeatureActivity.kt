package com.rodak.firstfeature

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.rodak.utlis.constans.USERNAME_EXTRAS
import kotlinx.android.synthetic.main.activity_feature.textField

class FeatureActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feature)

        if (getUserIntent().isNotEmpty()) textField.text = getUserIntent()
    }

    private fun getUserIntent(): String {
        val intent = intent.extras
        return intent?.getString(USERNAME_EXTRAS) ?: ""
    }
}

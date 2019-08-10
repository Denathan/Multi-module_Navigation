package com.rodak.multimodulenavigation

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.rodak.firstfeature.FeatureActivity
import com.rodak.utlis.constans.USERNAME_EXTRAS
import kotlinx.android.synthetic.main.fragment_main.featureButton
import kotlinx.android.synthetic.main.fragment_main.username

class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_main, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpClickListener()
    }

    private fun setUpClickListener() {
        featureButton.setOnClickListener {
            val intent = Intent(activity, FeatureActivity::class.java)
            intent.putExtra(USERNAME_EXTRAS, getUsername())
            startActivity(intent)
        }
    }

    private fun getUsername() = username.text.toString()
}
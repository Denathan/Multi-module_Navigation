package com.rodak.firstfeature

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.rodak.util.constans.USERNAME_EXTRAS
import kotlinx.android.synthetic.main.fragment_feature.username

class FeatureFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_feature, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpClickListener()

        if (getUserIntent().isNotEmpty()) username.text = getUserIntent()
    }

    private fun setUpClickListener() {
        // TODO implement logic for the button
    }

    private fun getUserIntent(): String {
        val intent = activity?.intent?.extras
        return intent?.getString(USERNAME_EXTRAS) ?: ""
    }
}
package com.rodak.mvi

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

abstract class MvvmiActivity<VS : MvvmiViewState, V : MvvmiView<VS, *>, M : MvvmiModel<VS, V, *>> :
    AppCompatActivity() {

    private lateinit var viewModel: M
    private val bundleKey = "ACTIVITY_BUNDLE"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewModel = setViewModel()
        initialize()
    }

    protected abstract fun setViewModel(): M

    private fun initialize() {
        viewModel.attachView(setView())
    }

    protected abstract fun setView(): V

    override fun onStart() {
        super.onStart()
        viewModel.bind()
    }

    override fun onStop() {
        viewModel.unbind()
        super.onStop()
    }

    override fun onDestroy() {
        viewModel.unsubscribe()
        super.onDestroy()
    }
}
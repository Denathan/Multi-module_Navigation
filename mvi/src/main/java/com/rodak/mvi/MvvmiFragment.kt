package com.rodak.mvi

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment

// TODO check if there are some misleading names for generics, e.g. V : ViewState
abstract class MvvmiFragment<VS : MvvmiViewState, V : MvvmiView<VS, *>, M : MvvmiModel<VS, V, *>> :
    Fragment() {

    private lateinit var viewModel: M
    private val bundleKey = "FRAGMENT_BUNDLE"

    override fun onAttach(context: Context?) {
        injection()
        super.onAttach(context)
    }

    protected open fun injection() {}

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        viewModel = setViewModel()

        restoreStateIfExists(savedInstanceState)
        initialize()
    }

    protected abstract fun setViewModel(): M

    private fun restoreStateIfExists(savedInstanceState: Bundle?) {
        if (newViewModelHasBeenCreated() && savedInstanceState != null) {
            viewModel.setInitialViewState(
                savedInstanceState.getParcelable(bundleKey)
            )
        }
    }

    private fun newViewModelHasBeenCreated() = !viewModel.isAlreadyInitialized()

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

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putParcelable(bundleKey, viewModel.getViewState())
        super.onSaveInstanceState(outState)
    }
}
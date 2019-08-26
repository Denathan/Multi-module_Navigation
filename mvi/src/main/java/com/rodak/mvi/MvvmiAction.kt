package com.rodak.mvi

interface MvvmiAction<V : MvvmiViewState> {

    fun reduce(previousState: V): V
}
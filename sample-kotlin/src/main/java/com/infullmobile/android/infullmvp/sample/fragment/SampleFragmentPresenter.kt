package com.infullmobile.android.infullmvp.sample.fragment

import android.databinding.ViewDataBinding
import android.net.Uri
import android.os.Bundle

import com.infullmobile.android.infullmvp.Presenter

class SampleFragmentPresenter(presentedView: SampleFragmentView,
                              private val sampleFragmentModel: SampleFragmentModel)
    : Presenter<SampleFragmentView, ViewDataBinding>(presentedView) {

    override fun bind(intentBundle: Bundle, savedInstanceState: Bundle, intentData: Uri?) {
        presentedView.setText(sampleFragmentModel.message)
    }
}

package com.infullmobile.android.infullmvp.sample.activity

import android.net.Uri
import android.os.Bundle
import com.infullmobile.android.infullmvp.Presenter
import com.infullmobile.android.infullmvp.sample.databinding.ActivitySampleBinding

class SampleActivityPresenter(presentedView: SampleActivityView,
                              private val sampleActivityModel: SampleActivityModel)
    : Presenter<SampleActivityView, ActivitySampleBinding>(presentedView) {

    override fun bind(intentBundle: Bundle, savedInstanceState: Bundle, intentData: Uri?) {
        presentedView.message = sampleActivityModel.message
    }
}
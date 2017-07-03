package com.infullmobile.android.infullmvp.sample.activity

import android.databinding.ObservableInt
import android.support.v4.app.FragmentStatePagerAdapter
import com.infullmobile.android.infullmvp.PresentedActivityView
import com.infullmobile.android.infullmvp.sample.R
import com.infullmobile.android.infullmvp.sample.databinding.ActivitySampleBinding

open class SampleActivityView(private val pagerAdapter: FragmentStatePagerAdapter)
    : PresentedActivityView<SampleActivityPresenter, ActivitySampleBinding>() {

    override val layoutResId = R.layout.activity_sample

    val productAmount = ObservableInt()

    override fun onViewsBound() {

    }
}

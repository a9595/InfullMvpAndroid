package com.infullmobile.android.infullmvp.sample.activity

import android.databinding.ObservableDouble
import android.databinding.ObservableField
import android.net.Uri
import android.os.Bundle
import com.infullmobile.android.infullmvp.Presenter
import com.infullmobile.android.infullmvp.sample.databinding.ActivitySampleBinding

class SampleActivityPresenter(presentedView: SampleActivityView,
                              private val sampleActivityModel: SampleActivityModel)
    : Presenter<SampleActivityView, ActivitySampleBinding>(presentedView) {

    lateinit var productVm: Product

    override fun bind(intentBundle: Bundle, savedInstanceState: Bundle, intentData: Uri?) {
        sampleActivityModel.getProduct().subscribe { product, throwable ->
            binding.productVm = product
        }
    }

}

data class Product(val name: ObservableField<String>,
                   val price: ObservableDouble) {

    constructor(name: String,
                price: Double)
            : this(ObservableField(name),
                   ObservableDouble(price))
}

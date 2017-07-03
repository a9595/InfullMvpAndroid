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

    override fun bind(intentBundle: Bundle, savedInstanceState: Bundle, intentData: Uri?) {
        loadProduct()
        loadPharmacies()
    }

    private fun loadPharmacies() {
        sampleActivityModel.getPharmacies()
                .subscribe { pharmaciesList, throwable ->
                    presentedView.displayPharmacies(pharmaciesList)
                }
    }

    private fun loadProduct() {
        sampleActivityModel.getProduct().subscribe { product, throwable ->
            presentedView.displayProduct(product)
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

data class Pharmacy(val name: ObservableField<String>) {

    constructor(name: String)
            : this(ObservableField(name))
}
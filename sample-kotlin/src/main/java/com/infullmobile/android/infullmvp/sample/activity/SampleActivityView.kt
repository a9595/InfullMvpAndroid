package com.infullmobile.android.infullmvp.sample.activity

import android.databinding.ObservableArrayList
import android.databinding.ObservableInt
import android.view.View
import com.infullmobile.android.infullmvp.BR
import com.infullmobile.android.infullmvp.PresentedActivityView
import com.infullmobile.android.infullmvp.sample.R
import com.infullmobile.android.infullmvp.sample.databinding.ActivitySampleBinding
import me.tatarka.bindingcollectionadapter2.ItemBinding

open class SampleActivityView
    : PresentedActivityView<SampleActivityPresenter, ActivitySampleBinding>() {

    override val layoutResId = R.layout.activity_sample

    val productAmount = ObservableInt()
    val pharmaciesItems = ObservableArrayList<Pharmacy>()
    val pharmacyItemBinding: ItemBinding<Pharmacy> = ItemBinding.of<Pharmacy>(BR.pharmacyItem, R.layout.item_pharmacy)

    override fun onViewsBound() {
        binding.view = this
    }

    fun onClickMinus(view: View) {
        productAmount.set(productAmount.get() - 1)
    }

    fun onClickPlus() {
        productAmount.set(productAmount.get() + 1)
    }

    fun displayPharmacies(
            pharmaciesList: List<Pharmacy>) {
        pharmaciesItems.addAll(pharmaciesItems)
    }

    fun displayProduct(product: Product?) {
        binding.productVm = product
    }
}

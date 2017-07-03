package com.infullmobile.android.infullmvp.sample.activity

import io.reactivex.Single

class SampleActivityModel {

    fun getProduct(): Single<Product> {
        return Single.just(Product("Apap 240", 15.50))
    }
}
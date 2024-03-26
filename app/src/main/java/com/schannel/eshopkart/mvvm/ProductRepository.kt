package com.schannel.eshopkart.mvvm

import com.schannel.eshopkart.api.ApiService
import com.schannel.eshopkart.model.ProductList
import javax.inject.Inject

class ProductRepository @Inject constructor(private val apiService: ApiService) {

    suspend fun getProducts(): ProductList {
        return apiService.getProducts()
    }


}
package com.schannel.eshopkart.api

import com.schannel.eshopkart.model.ProductList
import com.schannel.eshopkart.utlis.Constants.Companion.List_Of_product
import retrofit2.http.GET

interface ApiService {
    @GET(List_Of_product)
    suspend fun getProducts(): ProductList
}

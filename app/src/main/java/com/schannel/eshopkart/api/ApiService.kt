package com.schannel.eshopkart.api

import com.app.composedemo.model.ProductList
import com.app.composedemo.utlis.Constants.Companion.List_Of_product
import retrofit2.http.GET

interface ApiService {
    @GET(List_Of_product)
    suspend fun getProducts(): ProductList
}

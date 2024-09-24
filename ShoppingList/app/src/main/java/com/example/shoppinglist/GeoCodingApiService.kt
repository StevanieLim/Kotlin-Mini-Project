package com.example.shoppinglist

import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.http.Header


interface GeoCodingApiService {

    @GET("maps/api/geocode/json")
    suspend fun getAddressFromCoordinates(
        @Query("latlng") latlng: String,
        @Query("key")apiKey : String,
        //no address solve
        @Header("X-Android-Package") androidPackage: String = "com.example.shoppinglist",
        @Header("X-Android-Cert") sha1 : String ="1234567890abcdef1234567890abcdef12345678",
    ):GeocodingResponse
}
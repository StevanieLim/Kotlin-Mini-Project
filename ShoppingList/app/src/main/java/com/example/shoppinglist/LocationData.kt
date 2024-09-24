package com.example.shoppinglist

data class LocationData(
        val latitude : Double,
        val longitude : Double
)

data class GeocodingResponse(
    val result: List<GeocodingResult>
)

data class GeocodingResult(
    val formatted_address :String
)
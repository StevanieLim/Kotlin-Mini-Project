package com.example.myrecipeapp

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


//"idCategory": "1",
//"strCategory": "Beef",
//"strCategoryThumb": "https://www.themealdb.com/images/category/beef.png",
//"strCategoryDescription":

@Parcelize
data class Category(val idcategory : String,
    val strCategory : String,
    val strCategoryThumb : String,
    val strCategoryDescription : String): Parcelable

data class CategoriesResponse(val categories : List<Category>)
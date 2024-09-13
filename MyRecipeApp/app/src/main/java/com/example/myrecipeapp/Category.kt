package com.example.myrecipeapp

//"idCategory": "1",
//"strCategory": "Beef",
//"strCategoryThumb": "https://www.themealdb.com/images/category/beef.png",
//"strCategoryDescription":

data class Category(val idcategory : String,
    val strCategory : String,
    val strCategoryThumb : String,
    val strCategoryDescription : String)

data class CategoriesResponse(val categories : List<Category>)
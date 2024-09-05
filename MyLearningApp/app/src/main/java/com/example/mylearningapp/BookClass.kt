package com.example.mylearningapp
import java.util.Calendar

val calendar = Calendar.getInstance()
val currentYear = calendar.get(Calendar.YEAR)

class BookClass (var title:String = "Unknow", var author:String = "Anonymous", var yearPublished:Int= currentYear){

    init {

    }


}
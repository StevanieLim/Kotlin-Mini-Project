package com.example.wishlistapp

import android.content.Context
import androidx.room.Room
import com.example.wishlistapp.data.WishDtabase
import com.example.wishlistapp.data.Wishrepository

object Graph {
    lateinit var database: WishDtabase

    val wishrepository by lazy{
        Wishrepository(wishDao = database.wishDao())
    }

    fun provide(context: Context){
        database = Room.databaseBuilder(context, WishDtabase::class.java, "wishlist.db").build()
    }

}
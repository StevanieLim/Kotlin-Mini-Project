package com.example.wishlistapp.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [Wish::class],
    version = 1,
    exportSchema = false

)
abstract class WishDtabase : RoomDatabase() {
    abstract fun wishDao() : WishDao

}
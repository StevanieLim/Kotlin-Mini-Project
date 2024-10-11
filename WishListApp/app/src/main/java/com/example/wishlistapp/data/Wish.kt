package com.example.wishlistapp.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "wish-table")
data class Wish(
    @PrimaryKey(autoGenerate = true)
    val id : Long = 0L,
    @ColumnInfo(name = "wish-title")
    val title : String = "",
    @ColumnInfo(name = "wish-desc")
    val desc : String = ""
)

object DummyWish{
    val wishlist = listOf(
        Wish(title = "Google Watch 2", desc = "Google watch of watch to watch time"),
        Wish(title = "Google Watch 3", desc = "Google watch of watch to watch time"),
        Wish(title = "Google Watch 4", desc = "Google watch of watch to watch time"),
        Wish(title = "Google Watch 5", desc = "Google watch of watch to watch time"),

        )
}



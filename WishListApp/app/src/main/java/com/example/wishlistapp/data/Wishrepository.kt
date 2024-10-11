package com.example.wishlistapp.data

import kotlinx.coroutines.flow.Flow

class Wishrepository(private val wishDao: WishDao) {

    suspend fun addAWish (wish:Wish){
        wishDao.addWish(wish)
    }

    fun getWishes(): Flow<List<Wish>> = wishDao.getAllWishes()

    fun getAWishById(id:Long) :Flow<Wish>{
        return wishDao.getAWishes(id)
    }

    suspend fun updateAWish(wish:Wish){
        wishDao.updataeWish(wish)
    }

    suspend fun deleteAWish(wish:Wish){
        wishDao.deleteWish(wish)
    }


}
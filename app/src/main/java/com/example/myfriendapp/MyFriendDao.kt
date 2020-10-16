package com.example.myfriendapp

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

interface MyFriendDao {
    fun tambahTeman(teman: MyFriend)
    fun ambilSemuaTeman(): Any


    @Dao
    interface MyFriendDao {

        @Insert(onConflict = OnConflictStrategy.REPLACE)
        fun tambahTeman(friend: MyFriend)

        @Query("SELECT * FROM MyFriend")
        fun ambilSemuaTeman(): LiveData<List<MyFriend>>

    }
}
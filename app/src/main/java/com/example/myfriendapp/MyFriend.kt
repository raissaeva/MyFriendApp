package com.example.myfriendapp

import androidx.room.Entity
import androidx.room.PrimaryKey

class MyFriend {
    infix fun tambahDataTeman(teman: Any): Any {
        TODO("Not yet implemented")
    }

    @Entity
    data class MyFriend (
        @PrimaryKey(autoGenerate = true)
        val temanId: Int? = null,
        val nama : String,
        val kelamin : String,
        val email : String,
        val telp: String,
        val alamat: String )


}
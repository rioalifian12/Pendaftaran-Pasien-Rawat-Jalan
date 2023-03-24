package com.example.pendaftaranpasien.persistences

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.pendaftaranpasien.model.DaftarPasien

@Database(entities = [DaftarPasien::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun daftarPasienDao(): DaftarPasienDao
}
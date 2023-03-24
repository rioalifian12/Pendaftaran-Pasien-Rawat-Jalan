package com.example.pendaftaranpasien.persistences

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.pendaftaranpasien.model.DaftarPasien

@Dao
interface DaftarPasienDao {
    @Query("SELECT * FROM DaftarPasien")
    fun loadAll(): LiveData<List<DaftarPasien>>

    @Query("SELECT * FROM DaftarPasien WHERE id = :id")
    fun find(id: String): DaftarPasien?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(vararg items: DaftarPasien)

    @Delete
    fun delete(item: DaftarPasien)
}
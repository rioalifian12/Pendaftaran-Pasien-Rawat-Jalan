package com.example.pendaftaranpasien.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class DaftarPasien(
    @PrimaryKey val id: String,
    val nama: String,
    val nik: String,
    val kelamin: String,
    val tanggal_lahir: String,
    val alamat: String,
    val tanggal_kunjungan: String
)

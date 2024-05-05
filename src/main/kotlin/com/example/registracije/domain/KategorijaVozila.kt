package com.example.registracije.domain

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity(name = "kategorija_vozila")
data class KategorijaVozila(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val kategorijaId: Int = 0,

    @Column(name = "naziv_kategorije")
    val nazivKategorije: String,

    @Column(name = "cijena_registracije")
    val cijenRegistracije: Double
)

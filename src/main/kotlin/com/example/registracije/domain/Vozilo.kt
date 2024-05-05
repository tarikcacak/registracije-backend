package com.example.registracije.domain

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity(name = "vozilo")
data class Vozilo(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val voziloId: Int = 0,

    @Column(name = "marka")
    val marka: String,

    @Column(name = "model")
    val model: String,

    @Column(name = "godina_proizvodnje")
    val godinaProizvodnje: Int,

    @Column(name = "registarska_oznaka")
    val registarskaOznaka: String,

    @Column(name = "kategorija_id")
    val kategorijaId: Int
)
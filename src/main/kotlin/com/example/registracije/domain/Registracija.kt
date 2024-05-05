package com.example.registracije.domain

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.util.Date

@Entity(name = "registracija")
data class Registracija(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val registracijaId: Int = 0,

    @Column(name = "vozilo_id")
    val voziloId: Int,

    @Column(name = "vlasnik_id")
    val vlasnikId: Int,

    @Column(name = "datum_registracije")
    val datumRegistracije: Date,

    @Column(name = "datum_isteka_registracije")
    val datumIstekaRegistracije: Date
)

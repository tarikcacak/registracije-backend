package com.example.registracije.domain

import jakarta.persistence.*

@Entity(name = "vlasnik")
data class Vlasnik(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val vlasnikId: Int = 0,

    @Column(name = "ime")
    val ime: String,

    @Column(name = "prezime")
    val prezime: String,

    @Column(name = "adresa")
    val adresa: String,

    @Column(name = "kontakt_telefon")
    val kontaktTelefon: String
)
package com.example.registracije.persistence

import com.example.registracije.domain.Registracija
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param

interface RegistracijaRepository : JpaRepository<Registracija, Long> {

    @Query(
        value = "select * from registracija",
        nativeQuery = true
    )
    fun getAllRegistracije(): List<Registracija>

}
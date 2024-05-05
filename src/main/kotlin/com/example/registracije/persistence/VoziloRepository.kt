package com.example.registracije.persistence

import com.example.registracije.domain.Vozilo
import org.springframework.data.jpa.repository.JpaRepository

interface VoziloRepository : JpaRepository<Vozilo, Long> {

}
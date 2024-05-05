package com.example.registracije.api.services

import com.example.registracije.domain.Vozilo
import com.example.registracije.persistence.VoziloRepository
import org.springframework.stereotype.Service

@Service
class RegistracijeService(
    private val voziloRepository: VoziloRepository
) {
    fun getAllVozila(): List<Vozilo> {
        return voziloRepository.findAll()
    }

    fun createVozilo(vozilo: Vozilo): Vozilo {
        return voziloRepository.save(vozilo)
    }

    fun updateVozilo(vozilo: Vozilo): Vozilo {
        return voziloRepository.save(vozilo)
    }

    fun deleteVozilo(voziloId: Int) {
        voziloRepository.deleteById(voziloId.toLong())
    }
}
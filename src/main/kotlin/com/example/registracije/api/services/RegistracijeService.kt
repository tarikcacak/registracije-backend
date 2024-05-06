package com.example.registracije.api.services

import com.example.registracije.domain.Registracija
import com.example.registracije.domain.Vlasnik
import com.example.registracije.domain.Vozilo
import com.example.registracije.persistence.RegistracijaRepository
import com.example.registracije.persistence.VlasnikRepository
import com.example.registracije.persistence.VoziloRepository
import org.springframework.stereotype.Service

@Service
class RegistracijeService(
    private val voziloRepository: VoziloRepository,
    private val vlasnikRepository: VlasnikRepository,
    private val registracijaRepository: RegistracijaRepository
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

    fun getAllVlasnik(): List<Vlasnik> {
        return vlasnikRepository.findAll()
    }

    fun createVlasnik(vlasnik: Vlasnik): Vlasnik {
        return vlasnikRepository.save(vlasnik)
    }

    fun updateVlasnik(vlasnik: Vlasnik): Vlasnik {
        return vlasnikRepository.save(vlasnik)
    }

    fun deleteVlasnik(vlasnikId: Int) {
        vlasnikRepository.deleteById(vlasnikId.toLong())
    }

    fun getAllRegistracija(): List<Registracija> {
        return registracijaRepository.getAllRegistracije()
    }

    fun createRegistracija(registracija: Registracija): Registracija {
        return registracijaRepository.save(registracija)
    }

    fun updateRegistracija(registracija: Registracija): Registracija {
        return registracijaRepository.save(registracija)
    }

    fun deleteRegistracija(registracijaId: Int) {
        return registracijaRepository.deleteById(registracijaId.toLong())
    }
}
package com.example.registracije.api.controllers

import com.example.registracije.api.services.RegistracijeService
import com.example.registracije.domain.Registracija
import com.example.registracije.domain.Vlasnik
import com.example.registracije.domain.Vozilo
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/registracija-vozila")
class RegistracijeController(
    private val registracijeService: RegistracijeService
) {
    @GetMapping("/vozila")
    fun getAllVozila(): List<Vozilo> {
        return registracijeService.getAllVozila()
    }

    @PostMapping("/vozila")
    fun postVozilo(
        @RequestBody vozilo: Vozilo
    ): Vozilo {
        return registracijeService.createVozilo(vozilo)
    }

    @PutMapping("/vozila")
    fun putVozilo(
        @RequestBody vozilo: Vozilo
    ): Vozilo {
        return registracijeService.updateVozilo(vozilo)
    }

    @DeleteMapping("/vozila/{voziloId}")
    fun deleteVozilo(
        @PathVariable voziloId: Int
    ) {
        return registracijeService.deleteVozilo(voziloId)
    }

    @GetMapping("/vlasnik")
    fun getAllVlasnik(): List<Vlasnik> {
        return registracijeService.getAllVlasnik()
    }

    @PostMapping("/vlasnik")
    fun postVlasnik(
        @RequestBody vlasnik: Vlasnik
    ): Vlasnik {
        return registracijeService.createVlasnik(vlasnik)
    }

    @PutMapping("/vlasnik")
    fun putVlasik(
        @RequestBody vlasnik: Vlasnik
    ): Vlasnik {
        return registracijeService.updateVlasnik(vlasnik)
    }

    @DeleteMapping("/vlasnik/{vlasnikId}")
    fun deleteVlasnik(
        @PathVariable vlasnikId: Int
    ) {
        registracijeService.deleteVlasnik(vlasnikId)
    }

    @GetMapping("/registracija")
    fun getAllRegistracija(): List<Registracija> {
        return registracijeService.getAllRegistracija()
    }

    @PostMapping("/registracija")
    fun postRegistracija(
        @RequestBody registracija: Registracija
    ): Registracija
    {
        return registracijeService.createRegistracija(registracija)
    }

    @PutMapping("/registracija")
    fun putMapping(
        @RequestBody registracija: Registracija
    ): Registracija {
        return registracijeService.updateRegistracija(registracija)
    }

    @DeleteMapping("/registracija/{registracijaId}")
    fun deleteRegistracija(
        @PathVariable registracijaId: Int
    ) {
        registracijeService.deleteRegistracija(registracijaId)
    }
}
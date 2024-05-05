package com.example.registracije.api.controllers

import com.example.registracije.api.services.RegistracijeService
import com.example.registracije.domain.Vozilo
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/registracija")
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
    fun delete(
        @PathVariable voziloId: Int
    ) {
        return registracijeService.deleteVozilo(voziloId)
    }

}
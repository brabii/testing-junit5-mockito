package com.testing.controllers;

import com.testing.fauxspring.Model;
import com.testing.services.VetService;

public class VetController {
	private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    public String listVets(Model model){

        model.addAttribute("vets", vetService.findAll());

        return "vets/index";
    }
}

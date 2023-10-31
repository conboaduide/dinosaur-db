package com.koro.dinosaurdb.controller;

import com.koro.dinosaurdb.entity.ResponseObject;
import com.koro.dinosaurdb.service.DinosaurService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dinosaurs")
public class DinosaurController {

    private final DinosaurService dinosaurService;

    public DinosaurController(DinosaurService dinosaurService) {
        this.dinosaurService = dinosaurService;
    }

    @GetMapping
    public ResponseObject getDinosaurs() {
        return dinosaurService.getDinosaurs();
    }
}

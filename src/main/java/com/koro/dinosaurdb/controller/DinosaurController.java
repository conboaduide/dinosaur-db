package com.koro.dinosaurdb.controller;

import com.koro.dinosaurdb.entity.Dinosaur;
import com.koro.dinosaurdb.entity.ResponseObject;
import com.koro.dinosaurdb.service.DinosaurService;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public ResponseObject createDinosaur(@RequestBody Dinosaur dinosaur) {
        return dinosaurService.createDinosaur(dinosaur);
    }

    @DeleteMapping("/{id}")
    public ResponseObject deleteDinosaur(@PathVariable String id){
        return dinosaurService.deleteDinosaur(id);
    }

    @PatchMapping ("/{id}")
    public ResponseObject updateDinosaur(@PathVariable String id, @RequestBody Dinosaur dinosaur){
        return dinosaurService.updateDinosaur(id, dinosaur);
    }
}

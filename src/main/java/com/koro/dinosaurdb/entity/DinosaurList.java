package com.koro.dinosaurdb.entity;

import java.util.ArrayList;

public class DinosaurList extends ArrayList<Dinosaur> {

    private static DinosaurList instance;

    public static DinosaurList getInstance() {
        if (instance == null) {
            instance = new DinosaurList();
            instance.add(new Dinosaur("D1", "Tyrannosaurus rex", "Land", "Upper Cretaceous", "North America", 1905));
            instance.add(new Dinosaur("D2", "Triceratops", "Land", "Late Cretaceous", "North America", 1889));
            instance.add(new Dinosaur("D3", "Pteranodon", "Sky", "Late Cretaceous", "North America", 1876));
        }
        return instance;
    }
}

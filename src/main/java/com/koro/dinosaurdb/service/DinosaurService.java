package com.koro.dinosaurdb.service;

import com.koro.dinosaurdb.entity.Dinosaur;
import com.koro.dinosaurdb.entity.DinosaurList;
import com.koro.dinosaurdb.entity.ResponseObject;
import org.springframework.stereotype.Component;

@Component
public class DinosaurService {

    public ResponseObject getDinosaurs() {
        return new ResponseObject("Ok", "Success", DinosaurList.getInstance());
    }

    public ResponseObject createDinosaur(Dinosaur dinosaur) {
        DinosaurList.getInstance().add(dinosaur);
        return new ResponseObject("Ok", "Success", DinosaurList.getInstance().get(DinosaurList.getInstance().size()-1));
    }

    public ResponseObject deleteDinosaur(String id) {
        for (Dinosaur dinosaur : DinosaurList.getInstance()){
            if(dinosaur.getId().equals(id)){
                DinosaurList.getInstance().remove(dinosaur);
                return new ResponseObject("Ok", "Success", id);
            }
        }
        return new ResponseObject("Fail", "Not Found", id);
    }

    public ResponseObject updateDinosaur(String id, Dinosaur dinosaur) {
        for (Dinosaur d : DinosaurList.getInstance()){
            if (d.getId().equals(id)) {
                d.setSpecies(dinosaur.getSpecies() != null ? dinosaur.getSpecies() : d.getSpecies());
                d.setHabitat(dinosaur.getHabitat() != null ? dinosaur.getHabitat() : d.getHabitat());
                d.setLocation(dinosaur.getLocation() != null ? dinosaur.getLocation() : d.getLocation());
                d.setLivingPeriod(dinosaur.getLivingPeriod() != null ? dinosaur.getLivingPeriod() : d.getLivingPeriod());
                d.setDiscoveredYear(dinosaur.getDiscoveredYear() != 0 ? dinosaur.getDiscoveredYear() : d.getDiscoveredYear());
                return new ResponseObject("Ok", "Success", id);
            }
        }
        return new ResponseObject("Fail", "Not Found", id);
    }
}

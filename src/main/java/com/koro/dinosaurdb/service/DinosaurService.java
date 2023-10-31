package com.koro.dinosaurdb.service;

import com.koro.dinosaurdb.entity.DinosaurList;
import com.koro.dinosaurdb.entity.ResponseObject;
import org.springframework.stereotype.Component;

@Component
public class DinosaurService {

    public ResponseObject getDinosaurs() {
        return new ResponseObject("Ok", "Success", DinosaurList.getInstance());
    }
}

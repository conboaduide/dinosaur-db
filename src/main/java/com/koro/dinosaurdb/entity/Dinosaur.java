package com.koro.dinosaurdb.entity;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Dinosaur {

    private String id;
    private String species;
    private String habitat;
    private String livingPeriod;
    private String location;
    private int discoveredYear;
}

package com.example.Labo1Ex.domain.model;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Builder
public class Specimen {
    private String name;
    private BaseVirus baseVirus;
    private int dangerLevel;
    private String weakPoint;
    private State state;
    private Ubication lastUbication;
}

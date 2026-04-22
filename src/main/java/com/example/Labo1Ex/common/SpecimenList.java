package com.example.Labo1Ex.common;

import com.example.Labo1Ex.domain.model.BaseVirus;
import com.example.Labo1Ex.domain.model.Specimen;
import com.example.Labo1Ex.domain.model.State;
import com.example.Labo1Ex.domain.model.Ubication;
import lombok.Getter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Getter
public class SpecimenList {
    private final List<Specimen> specimenList;

    public SpecimenList() {
        specimenList = List.of(
                Specimen.builder()
                        .name("Zombie")
                        .baseVirus(BaseVirus.TVIRUS)
                        .dangerLevel(1)
                        .weakPoint("Head")
                        .state(State.LIBERTY)
                        .lastUbication(Ubication.TOWN)
                        .build(),

                Specimen.builder()
                        .name("Licker")
                        .baseVirus(BaseVirus.TVIRUS)
                        .dangerLevel(2)
                        .weakPoint("Exposed brain")
                        .state(State.LIBERTY)
                        .lastUbication(Ubication.POLICESTATION)
                        .build(),

                Specimen.builder()
                        .name("Hunter")
                        .baseVirus(BaseVirus.TVIRUS)
                        .dangerLevel(3)
                        .weakPoint("Chest")
                        .state(State.CONTAINED)
                        .lastUbication(Ubication.LABORATORY)
                        .build(),

                Specimen.builder()
                        .name("Nemesis")
                        .baseVirus(BaseVirus.TVIRUS)
                        .dangerLevel(5)
                        .weakPoint("Heart")
                        .state(State.LIBERTY)
                        .lastUbication(Ubication.TOWN)
                        .build(),

                Specimen.builder()
                        .name("G-Birkin")
                        .baseVirus(BaseVirus.GVIRUS)
                        .dangerLevel(5)
                        .weakPoint("Eyes")
                        .state(State.LIBERTY)
                        .lastUbication(Ubication.LABORATORY)
                        .build(),

                Specimen.builder()
                        .name("Verdugo")
                        .baseVirus(BaseVirus.PLAGAS)
                        .dangerLevel(5)
                        .weakPoint("Cold temperatures")
                        .state(State.CONTAINED)
                        .lastUbication(Ubication.MANSION)
                        .build(),

                Specimen.builder()
                        .name("El Gigante")
                        .baseVirus(BaseVirus.PLAGAS)
                        .dangerLevel(5)
                        .weakPoint("Plaga parasite")
                        .state(State.ERADICATED)
                        .lastUbication(Ubication.TOWN)
                        .build(),

                Specimen.builder()
                        .name("Jack Baker")
                        .baseVirus(BaseVirus.CADOU)
                        .dangerLevel(5)
                        .weakPoint("Regenerative core")
                        .state(State.ERADICATED)
                        .lastUbication(Ubication.MANSION)
                        .build(),

                Specimen.builder()
                        .name("Lady Dimitrescu")
                        .baseVirus(BaseVirus.CADOU)
                        .dangerLevel(5)
                        .weakPoint("Exposed form")
                        .state(State.ERADICATED)
                        .lastUbication(Ubication.MANSION)
                        .build()
        );
    }
}

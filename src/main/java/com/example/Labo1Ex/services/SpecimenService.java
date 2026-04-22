package com.example.Labo1Ex.services;

import com.example.Labo1Ex.domain.model.BaseVirus;
import com.example.Labo1Ex.domain.model.Specimen;
import com.example.Labo1Ex.domain.model.State;
import com.example.Labo1Ex.repositories.SpecimenRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SpecimenService {
    private final SpecimenRepository specimenRepository;

    public List<Specimen> getAllSpecimens() {
        return specimenRepository.findAll();
    }

    public List<Specimen> getSpecimensByBaseVirus(BaseVirus baseVirus) {
        return specimenRepository.findAll().stream().filter(obj -> obj.getBaseVirus().equals(baseVirus)).toList();
    }

    public List<Specimen> getSpecimenByState(State state) {
        return specimenRepository.findAll().stream().filter(obj -> obj.getState().equals(state)).toList();
    }

    public List<BaseVirus> getBaseVirusInLiberty() {
        return specimenRepository.findAll().stream().filter(s -> s.getState() == State.LIBERTY).map(Specimen::getBaseVirus).distinct().toList();
    }
}

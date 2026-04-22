package com.example.Labo1Ex.services;

import com.example.Labo1Ex.domain.model.Specimen;
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
}

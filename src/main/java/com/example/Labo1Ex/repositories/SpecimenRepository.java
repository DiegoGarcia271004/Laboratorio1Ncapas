package com.example.Labo1Ex.repositories;

import com.example.Labo1Ex.common.SpecimenList;
import com.example.Labo1Ex.domain.model.Specimen;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class SpecimenRepository {
    private final SpecimenList specimenList;

    public List<Specimen> findAll() {
        return specimenList.getSpecimenList();
    }
}



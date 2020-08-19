package com.dubreuia.synthesizrs.services;

import com.dubreuia.synthesizrs.model.Synthesizer;
import com.dubreuia.synthesizrs.repositories.SynthesizerRepository;
import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SynthesizerServiceImpl implements SynthesizerService {

    @Autowired
    private SynthesizerRepository synthesizerRepository;

    @Override
    @Transactional
    public List<Synthesizer> getSynthesizers() {
        return synthesizerRepository.findAll().stream()
                .peek(s -> Hibernate.initialize(s.getCreatedBy()))
                .collect(Collectors.toList());
    }

}

package com.dubreuia.synthesizrs.repositories;

import com.dubreuia.synthesizrs.model.Synthesizer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SynthesizerRepository extends JpaRepository<Synthesizer, Long> {
}

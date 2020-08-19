package com.dubreuia.synthesizrs.controllers;

import com.dubreuia.synthesizrs.dtos.SynthesizerDto;
import com.dubreuia.synthesizrs.repositories.SynthesizerRepository;
import com.dubreuia.synthesizrs.services.SynthesizerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin
@RestController
public class SynthesizersController {

    @Autowired
    private SynthesizerService synthesizerService;

    @RequestMapping("/api/synths")
    public List<SynthesizerDto> synths() {
        return synthesizerService.getSynthesizers().stream().map(SynthesizerDto::new).collect(Collectors.toList());
    }

}
package com.dubreuia.synthesizrs.controllers;

import com.dubreuia.synthesizrs.dtos.SynthDto;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class SynthsController {

    @RequestMapping("/api/synths")
    public List<SynthDto> login() {
        return List.of(
                new SynthDto(1, "Juno-106", "Roland", "1984"),
                new SynthDto(1, "Synthesizer 1c/2c/3c", "Moog", "1964")
        );
    }

}
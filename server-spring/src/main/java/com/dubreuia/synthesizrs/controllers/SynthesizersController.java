package com.dubreuia.synthesizrs.controllers;

import com.dubreuia.synthesizrs.dtos.SynthesizerDto;
import com.dubreuia.synthesizrs.model.Synthesizer;
import com.dubreuia.synthesizrs.model.User;
import com.dubreuia.synthesizrs.repositories.SynthesizerRepository;
import com.dubreuia.synthesizrs.repositories.UserRepository;
import com.dubreuia.synthesizrs.services.SynthesizerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin
@RestController
public class SynthesizersController {

    @Autowired
    private SynthesizerService synthesizerService;

    @Autowired
    private SynthesizerRepository synthesizerRepository;

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/api/synths")
    public List<SynthesizerDto> getSynths() {
        return synthesizerService.getSynthesizers().stream()
                .sorted(Comparator.comparing(Synthesizer::getId))
                .map(SynthesizerDto::new)
                .collect(Collectors.toList());
    }

    @PostMapping("/api/synths")
    public void createSynth(@RequestBody SynthesizerDto synthesizerDto) {
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        User user = userRepository.findById(username).orElseThrow();
        Synthesizer synthesizer = synthesizerDto.toSynthesizer();
        synthesizer.setCreatedBy(user);
        synthesizerRepository.save(synthesizer);
    }

    @PostMapping("/api/synths/{id}/image")
    public void createSynthImage(@PathVariable("id") long id, @RequestParam("file") MultipartFile file) throws Exception {
        Synthesizer synthesizer = synthesizerRepository.findById(id).orElseThrow();
        // The "public" directory is automatically used by Spring to serve static assets
        Path publicDirectory = Paths.get(".", "public").toAbsolutePath();
        byte[] imageContent = file.getBytes();
        Path filepath = Paths.get(publicDirectory.toString(), file.getOriginalFilename());
        try (OutputStream os = Files.newOutputStream(filepath)) {
            os.write(imageContent);
        }
        synthesizer.setFilename(file.getOriginalFilename());
        synthesizerRepository.save(synthesizer);
    }

}
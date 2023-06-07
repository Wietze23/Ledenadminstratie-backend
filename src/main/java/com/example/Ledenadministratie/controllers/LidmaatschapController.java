package com.example.Ledenadministratie.controllers;

import com.example.Ledenadministratie.domain.Lid;
import com.example.Ledenadministratie.domain.Lidmaatschap;
import com.example.Ledenadministratie.domain.Team;
import com.example.Ledenadministratie.repository.LidmaatschapRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LidmaatschapController {
    @Autowired
    LidmaatschapRepository lidmaatschapRepository;
    @PostMapping("/lidmaatschap")
    Lidmaatschap save(@RequestBody Lidmaatschap lidmaatschap) {
        return lidmaatschapRepository.save(lidmaatschap);
    }

//    @PutMapping("/lidmaatschap")
//    Lidmaatschap update(@RequestBody Lidmaatschap lidmaatschap) {
//        return lidmaatschapRepository.save(lidmaatschap);
//    }
}

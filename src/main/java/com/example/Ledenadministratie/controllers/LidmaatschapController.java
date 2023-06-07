package com.example.Ledenadministratie.controllers;

import com.example.Ledenadministratie.domain.Lidmaatschap;
import com.example.Ledenadministratie.repository.LidmaatschapRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static org.springframework.web.bind.annotation.RequestMethod.*;
import static org.springframework.web.bind.annotation.RequestMethod.PUT;

@RestController
@CrossOrigin(origins = "*", methods = {GET, DELETE,  POST, PUT})
public class LidmaatschapController {
    @Autowired
    LidmaatschapRepository lidmaatschapRepository;
    @PostMapping("/lidmaatschap")
    Lidmaatschap save(@RequestBody Lidmaatschap lidmaatschap) {
        return lidmaatschapRepository.save(lidmaatschap);
    }
    @GetMapping("/lidmaatschap")
    Iterable<Lidmaatschap> findAll() {
        return lidmaatschapRepository.findAll();
    }


//    @PutMapping("/lidmaatschap")
//    Lidmaatschap update(@RequestBody Lidmaatschap lidmaatschap) {
//        return lidmaatschapRepository.save(lidmaatschap);
//    }
}

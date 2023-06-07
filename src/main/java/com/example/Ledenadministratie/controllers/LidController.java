package com.example.Ledenadministratie.controllers;

import com.example.Ledenadministratie.domain.Lid;
import com.example.Ledenadministratie.repository.LidRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static org.springframework.web.bind.annotation.RequestMethod.*;


@RestController
@CrossOrigin(origins = "*", methods = {GET, DELETE,  POST, PUT})
public class LidController {
    @Autowired
    LidRepository lidRepository;
    @PostMapping("/lid")
    Lid save(@RequestBody Lid lid) {
        return lidRepository.save(lid);
    }

    @GetMapping("/lid")
    Iterable<Lid> findAllSorted() {
        return lidRepository.findAllByOrderByNaamAsc();
    }

//    @GetMapping("/lid/{id}")
//    Iterable<Lid> findByNaam() {
//        return lidRepository.findByNaam();
//    }
    @DeleteMapping("/lid/{id}")
    void delete(@PathVariable int id) {
        lidRepository.deleteById(id);
    }

    @PutMapping("/lid")
    Lid update(@RequestBody Lid lid) {
        return lidRepository.save(lid);
    }
}
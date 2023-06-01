package com.example.Ledenadministratie.controllers;

import com.example.Ledenadministratie.domain.Lid;
import com.example.Ledenadministratie.domain.Team;
import com.example.Ledenadministratie.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static org.springframework.web.bind.annotation.RequestMethod.*;
import static org.springframework.web.bind.annotation.RequestMethod.PUT;

@RestController
@CrossOrigin(origins = "*", methods = {GET, DELETE,  POST, PUT})
public class TeamController {
    @Autowired
    TeamRepository teamRepository;
    @PostMapping("/team")
    Team save(@RequestBody Team team) {
        return teamRepository.save(team);
    }

    @GetMapping("/team")
    Iterable<Team> findAllSorted() {
        return teamRepository.findAllByOrderByCategorieAsc();
    }

    @DeleteMapping("/team/{id}")
    void delete(@PathVariable int id) {
        teamRepository.deleteById(id);
    }

    @PutMapping("/team")
    Team update(@RequestBody Team team) {
        return teamRepository.save(team);
    }
}

package com.example.Ledenadministratie.repository;

import com.example.Ledenadministratie.domain.Lid;
import com.example.Ledenadministratie.domain.Lidmaatschap;
import com.example.Ledenadministratie.domain.Team;
import org.springframework.data.repository.CrudRepository;

public interface LidmaatschapRepository extends CrudRepository
        <Lidmaatschap, Integer> {

}

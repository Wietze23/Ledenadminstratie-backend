package com.example.Ledenadministratie.repository;

import com.example.Ledenadministratie.domain.Lid;
import com.example.Ledenadministratie.domain.Team;
import org.springframework.data.repository.CrudRepository;

public interface TeamRepository extends CrudRepository<Team, Integer> {

    Iterable<Team>findAllByOrderByCategorieAsc();
}

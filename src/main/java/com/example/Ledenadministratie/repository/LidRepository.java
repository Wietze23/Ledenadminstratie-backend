package com.example.Ledenadministratie.repository;

import com.example.Ledenadministratie.domain.Lid;
import org.springframework.data.repository.CrudRepository;

public interface LidRepository extends CrudRepository<Lid, Integer> {
    Iterable<Lid> findAllByOrderByNaamAsc();
}



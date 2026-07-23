package com.levanthem.pe.mamnguqua.repository;

import com.levanthem.pe.mamnguqua.entity.Fruit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FruitRepository extends JpaRepository<Fruit, Integer> {
//    List<Fruit> getAllByOrderByDesc();

    List<Fruit> searchAllByNameContainingIgnoreCase(String keyword);


    boolean existsByName(String name);
}
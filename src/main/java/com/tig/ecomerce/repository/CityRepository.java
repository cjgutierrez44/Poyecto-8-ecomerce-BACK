package com.tig.ecomerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tig.ecomerce.model.City;

@Repository
public interface CityRepository extends JpaRepository<City, Integer>{

}

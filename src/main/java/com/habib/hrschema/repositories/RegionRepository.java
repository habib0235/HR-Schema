package com.habib.hrschema.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.habib.hrschema.entities.Region;


@Repository
public interface RegionRepository extends JpaRepository<Region, Long>{

}

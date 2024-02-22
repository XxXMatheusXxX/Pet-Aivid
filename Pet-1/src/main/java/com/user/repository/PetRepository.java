package com.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.entities.Pet;

public interface  PetRepository extends JpaRepository<Pet,Long>{

	

}
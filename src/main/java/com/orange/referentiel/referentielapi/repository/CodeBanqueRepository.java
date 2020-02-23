package com.orange.referentiel.referentielapi.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.orange.referentiel.referentielapi.model.CodeBanque;

public interface CodeBanqueRepository extends JpaRepository<CodeBanque, Integer> {
	
	public Optional<CodeBanque> findById (Integer id);

}

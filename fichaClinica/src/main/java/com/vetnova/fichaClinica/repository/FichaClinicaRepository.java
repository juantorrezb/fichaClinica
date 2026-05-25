package com.vetnova.fichaClinica.repository;

import org.springframework.data.convert.ReadingConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vetnova.fichaClinica.model.FichaClinica;

@Repository
public interface FichaClinicaRepository extends  JpaRepository<FichaClinica, Long> {

}

package com.naga.validation.repository;

import com.naga.validation.dto.Professional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProfessionalRepository extends JpaRepository<Professional,Integer> {
  public  Optional<Professional> findByPrfId(int prfId);

    // Professional findByPrf_name(String name);
    //Professional findByPrf_Id(Integer prfId);


//    @Query("SELECT p FROM professionals p WHERE p.prf_id = :prf_id")
   // Professional findByPrf_Id(int prf_Id);



}

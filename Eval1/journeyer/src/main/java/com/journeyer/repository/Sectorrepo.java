package com.journeyer.repository;


import com.journeyer.modal.Sector;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface Sectorrepo extends JpaRepository<Sector, Long> {

    @Query(value = "from Sector where Subsector_Id=''")
    public List<Sector> findBysectorid();

    @Query(value = "from Sector where Subsector_Id=?1")
    public List<Sector> findBySubsectorid(String subsectorid);

}

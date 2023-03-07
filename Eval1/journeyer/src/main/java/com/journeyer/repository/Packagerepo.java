package com.journeyer.repository;

import com.journeyer.modal.Tourpackage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Packagerepo extends JpaRepository<Tourpackage, Long>{

    @Query(value = "from Tourpackage p where Sectormaster_Id=?1")
    public List<Tourpackage> findBypackageid(int sectormasterid);


    @Query(value = "from Tourpackage p where Package_Id=?1")
    public List<Tourpackage> findBysectorid(int pacakgeid);

}

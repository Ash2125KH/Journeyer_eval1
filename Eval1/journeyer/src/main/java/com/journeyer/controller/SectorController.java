package com.journeyer.controller;

import com.journeyer.modal.Sector;
import com.journeyer.repository.Sectorrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class SectorController {

    @Autowired
    Sectorrepo sectorrepo;

    //for getting home page
    @GetMapping(value="/sector")
    public List<Sector> getsectors()
    {
        return sectorrepo.findBysectorid();
    }

    //for sector page
    @GetMapping(value="/sectors")
    public List<Sector> getAllsectors()
    {
        return sectorrepo.findAll();
    }

    //for subsectorpage
    @GetMapping(value="/subsector/{subsectorid}")
    public List<Sector> getSubsector(@PathVariable String subsectorid)
    {
        return sectorrepo.findBySubsectorid(subsectorid);
    }
}


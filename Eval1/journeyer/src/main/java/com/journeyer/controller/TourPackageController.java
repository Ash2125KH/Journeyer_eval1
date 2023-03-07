package com.journeyer.controller;


import com.journeyer.Services.PackageService;
import com.journeyer.modal.Tourpackage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@CrossOrigin
public class TourPackageController {

    @Autowired
    PackageService packservice;


    //for getting name,date page details
    @GetMapping(value="/package/{sectormasterid}")
    public List<Tourpackage> getpackage(@PathVariable int sectormasterid)
    {
        return packservice.getpackage(sectormasterid);
    }

    //for getting itenery,booking date page details
    @GetMapping(value="/packages/{packageid}")
    public List<Tourpackage> getpackageid(@PathVariable int packageid)
    {
        List<Tourpackage> tpack=packservice.getpackagebysectorid(packageid);
        return tpack;
    }

    //for search by date filter
    @GetMapping(value="/package")
    public List<Tourpackage> getTourbyperoid()
    {
        return packservice.searchpackagebydates();
    }
}

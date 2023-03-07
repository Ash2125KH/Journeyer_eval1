package com.journeyer.Services;


import com.journeyer.modal.Tourpackage;
import com.journeyer.repository.Packagerepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PackageServiceImp implements PackageService{

    @Autowired
    Packagerepo packrepo;

    @Override
    public List<Tourpackage> getpackage(int sectormasterid) {
        // TODO Auto-generated method stub

        List<Tourpackage> pack=packrepo.findBypackageid(sectormasterid);
        return pack;
    }

    @Override
    public List<Tourpackage> getpackagebysectorid(int packageid) {
        // TODO Auto-generated method stub
        return packrepo.findBysectorid(packageid);
    }

    @Override
    public List<Tourpackage> searchpackagebydates() {

        return packrepo.findAll();
    }




}

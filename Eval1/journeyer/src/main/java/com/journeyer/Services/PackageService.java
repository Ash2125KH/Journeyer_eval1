package com.journeyer.Services;


import com.journeyer.modal.Tourpackage;

import java.util.List;

public interface PackageService {

    public List<Tourpackage> getpackage(int sectormasterid);
    public List<Tourpackage> getpackagebysectorid(int packageid);
    public List<Tourpackage> searchpackagebydates();

}
